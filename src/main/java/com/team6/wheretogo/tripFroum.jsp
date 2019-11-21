<%@ page language = "java" contentType = "text/html; charset = UTF-8" pageEncoding = "UTF-8"%>
<%@ page import = "java.io.PrintWriter"%>
<%@ page import = "user.UserDAO"%>
<%@ page import = "board.BoardDAO"%>
<%@ page import = "board.BoardDTO"%>
<%@ page import = "java.util.ArrayList"%>
<%@ page import = "java.sql.*" %>

<%//유저 아이디 불러오기.
	String userID = null;;String userName=null;
	if(session.getAttribute("userID")!=null)
	{
		userID = (String) session.getAttribute("userID");
	}
%>

<%//보드 기본세팅

	//보드 대분류
	String boardType="tripForum";
	//검색사안
	String search = null;
	//페이지당 보드 출력수.
	int boardIndexNoPerPage=10;
	
	
	if(request.getParameter("search")!=null)
	{try{search = (String)(request.getParameter("search"));}catch(Exception e){System.out.println("검색에러");}}



	ArrayList<BoardDTO> boardList = new  ArrayList<BoardDTO>();
	int pageNo=1;
	//href로 검색한것 int변형해서 가져올수 있다면, 페이지번호 바꿔줌.
	if(request.getParameter("pageNo")!=null){try{pageNo = Integer.parseInt(request.getParameter("pageNo"));}catch(Exception e){System.out.println("검색에러");}}

	boardList = new BoardDAO().GetList(boardType,search);
%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset = "UTF-8">
	<title>WTG</title>
	<link rel = "stylesheet" href = "styles/styles.css"/>
</head>
</head>
<body>
	<header>
		<div id = "backToIndex"><a href = "index.jsp">WTG</a></div>
		<nav>
			<ul>
				<li><a href= "tripPlan.jsp">여행 플랜</a></li>
				<li><a href= "tripLog.jsp">여행 일지</a></li>
				<li><a href= "tripForum.jsp">여행게시판</a></li>
				<li><a href= "countryForum.jsp">해외 포럼</a></li>
				<li><a href= "freeForum.jsp">자유게시판</a></li>
			</ul>
		</nav>
	</header>
	<section>
		<article id = freeForum1>
			<div id = "upperBoardBorderSolid">
				여행게시판
			</div>
			<div id = "mainBoard">
				<table style="width:100%;text-align:center;" >
					<thead style ="text-align:center;background-color:#B2CCFF;">
						<tr >
							<th width="10%">번호</th>
							<th width="10%">분류</th>
							<th width = "40%">제목</th>
							<th width = "15%">등록일</th>
							<th width = "15%">작성자</th>
							<th width = "10%">조회수</th>
						</tr>
					</thead>
					<tbody>

<%//보드 내용 검색
//보드 에러
						if(boardList!=null){%><tr><td colspan = "6"><h1 >등록된 보드가 없습니다.</h1></td></tr><%}
//보드 검색내용 없음
						else if(boardList.size()==0){%><tr><td colspan = "6"><h1 >등록된 글이 없습니다..</h1></td></tr><%}
//보드 검색중.
						else{
//Nostart Noend : 페이지당 지정한 글수만큼 출력가능할시, start는 이번페이지에서, End는 +1증가한 다음페이지에서 시작글.
//index No : 화면상에서 표기될 글번호.(실제 검색에서는 0부터라서-1된것을 찾음)
							int  NoStart = boardList.size()-(pageNo-1)*boardIndexNoPerPage;
							int NoNextStart = NoStart-boardIndexNoPerPage;
							for(int indexNo=NoStart ;(indexNo>=1)&&(indexNo>NoNextStart);indexNo--){
								BoardDTO board = boardList.get(indexNo-1);%>
								<tr>
									<td><a href = "tripForum2.jsp?boardID=<%=board.getBoardNo()%>" style="text-decoration:none;color:black"><%=board.boardClassfy()%></a></td>	
									<td><a href = "tripForum2.jsp?boardID=<%=board.getBoardNo()%>" style="text-decoration:none;color:black"><%=indexNo%></a></td>	
									<td><a href = "tripForum2.jsp?boardID=<%=board.getBoardNo()%>" style="text-decoration:none;color:black"><%=board.getBoardTitle()%></a></td>	
									<td><a href = "tripForum2.jsp?boardID=<%=board.getBoardNo()%>" style="text-decoration:none;color:black"><%=board.getBoardEnrollDate()%></a></td>	
									<td><a href = "tripForum2.jsp?boardID=<%=board.getBoardNo()%>" style="text-decoration:none;color:black"><%=board.getBoardWriter()%></a></td>
									<td><a href = "tripForum2.jsp?boardID=<%=board.getBoardNo()%>" style="text-decoration:none;color:black"><%=board.getBoardViews()%></a></td>	
								</tr>
						
							<%}
						}%>
					</tbody>
				</table>
			</div>
			<div id = "BoardSearch">
				
				<%
				//글수에 따라 << 1 ... 10>>, <<현재 , ... , 현재+8 >>식 이동.
				//가장 오랜된글 >>(맨끝으로)
				//1 : <<(최신글로)
				//MaxIndexAdd1 : 10개 못채우는 나머지 있을때 최대페이지번호 +1해줘야함.
				if(boardList!=null&&boardList.size()!=0){
							
							int MaxIndexAdd1=0;	
							if(boardList.size()%boardIndexNoPerPage!=0){MaxIndexAdd1=1;}
							int MaxIndex=(boardList.size()/boardIndexNoPerPage)+MaxIndexAdd1;%> 
							<div id="BoardPageNo">
								<a href="tripForum.jsp?pageNo=<%=1%>"><<</a>
									<%
									//시작번호 10넘어가면 현재번호부터 10개
									if(pageNo>10)
									{
										//-10돌아가는 < 추가.%>
										<a href="tripForum.jsp?pageNo=<%=pageNo-10%>"> &nbsp < &nbsp </a>	
										<%//1페이지씩 표시.
										for(int i=pageNo;(i<pageNo+10)&&(i<=MaxIndex);i++)
										{%>
											<a href = "tripForum.jsp?pageNo=<%=i%>"><%=i%></a>
										<%}
										//+10이후 더있으면 +10하는 >추가.
										if(pageNo+10<MaxIndex){%><a href="tripForum.jsp?pageNo=<%=pageNo+10%>"> &nbsp > &nbsp </a><%}
									}else{		
									//1붙터 시작하면 10or최대값 까지
										for(int i=1;(i<=MaxIndex);i++){%><a href = "tripForum.jsp?pageNo=<%=i%>"><%=i%></a><%}
									}%>
									<a href="tripForum.jsp?pageNo=<%=MaxIndex%>">>></a>
							</div>
				<%}%>
				
				
				<%if(userID!=null) {%>
						<div >
							<a href = "./boardEnroll.jsp?boardType=tripForum"><button  >글쓰기</button></a>
						</div>
				<%}%>
				<form action =" method = "get" >
					<select name = "Country" class =  "form-control">
						<option   value = "Plan" selected > 플랜</option>
						<option value = "Log" > 로그</option>
						<option value = "All" > 전부</option>
					</select>
					
					<select name = "userGender" class =  "form-control">
						<option   value = "None" selected > 정렬</option>
						<option value = "제목" > Title</option>
						<option value = "작성자" > Writer</option>
					</select>
					<br>
					<select name = "SearchFor" class =  "form-control">
						<option   value = "All" selected > 전체</option>
						<option value = "제목" > Title</option>
						<option value = "작성자" > Writer</option>
					</select>
					<input type = "text" id = "search" style="width:800px;" >
					<button>검색</button>
				</form>
			</div>
		</article>
	
		<article id = "LoginLoginMenu">
			<%if(userID == null){%>
				<form method = "post" action = "./userLogin.jsp">
					<div id = "IDPWD1">
					<div id = "id">
							아이디
							<div id = "idbox"><input type = "text" name = "userID" class = "form-control" size = 10></div>
						</div>
						<div id = "psd">
							패스워드
							<div id = "psdbox"><input type = "password" name = "userPassword" class = "form-control" size = 10></div>
						</div>
						<button id = "LogIn"type = "submit" >로그인</button>
					</div>
					<div id = "IDPWD1">
						<div id = "CreateIDAndPassWord">
							<a href = "./userJoin.jsp">회원가입</a>
						</div>
						<div id = "FindIDAndPassWord">
							<a href = "./findID.jsp">아이디찾기 /</a>
							<a href = "./findPassword.jsp">비밀번호찾기</a>
						</div>
					</div>
				</form>
			<%}else{ %><a href = "./userLogOut.jsp">로그아웃.</a><%} %>
		</article>
	</section>
</body>

</html>








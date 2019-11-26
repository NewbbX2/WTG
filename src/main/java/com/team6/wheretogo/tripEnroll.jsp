<%@ page language = "java" contentType = "text/html; charset = UTF-8" pageEncoding = "UTF-8"%>
<%@ page import = "user.UserDAO"%>
<!DOCTYPE html>
<html>
	<head>
		<title>여행글 작성중입니다..</title>
		<style>
			body			{	height:100%;	width: 1000px;}
			label			{display: inline-block;	width: 400px;}
			#MainConsult	{width: 1500px;	height:500px;}
		</style>
	</head>
	
<%//유저정보불러오기
			String userID = null;
			if(session.getAttribute("userID")!=null){userID = (String) session.getAttribute("userID");}
%>	

<%//보드 대분류 불러오기
	String tripType=null;
	if(request.getParameter("tripType")!=null){
		try{tripType = request.getParameter("tripType");}
		catch(Exception e){System.out.println("비정상적인 접근 또는 검색에러");}
	}
%>
<%//여행게시판이면 이전게시글 불러오기.
	String tripBoardNo=null;
	if(request.getParameter("tripBoardNo")!=null){
		try{tripBoardNo = request.getParameter("tripBoardNo");}
		catch(Exception e){System.out.println("비정상적인 접근 또는 검색에러");}
	}
%>
	<body >
			<form action="./tripEnrollAction.jsp" method="post"   ENCTYPE="multipart/form-data">
				<label>게시판종류</label>
				<select name = "boardType">
					<%if(tripType.equals("tripPlan")){%>
						<option value="tripPlan">여행계획</option>
					<%}else if(tripType.equals("tripLog")){%>
						<option value="tripLog">여행일지</option>
					<%}%>
				</select><br>
				<% //사용안하는데 일단 몰라서 만들어둠. 
				%>
				<select name = "boardClassfy" style="display:none;" >
					<%if(tripType.equals("tripPlan")){%>
						<option value="tripPlan">여행계획</option>
					<%}else if(tripType.equals("tripLog")){%>
						<option value="tripLog">여행일지</option>
					<%}%>
				</select>
				<%if(tripBoardNo!=null&& (!tripBoardNo.equals(""))){%>
				
				<%}%>
				<label>게시판제목</label>
				<input type = "text" name = "boardTitle" class = "form-control" maxlength = "30" style = "width:300px"><br />
				
				<label>작성자이름</label>
				<select name = "boardWriter" ><option value = "<%=userID%>" selected><%=userID%></option></select><br>
				<label>여행시작일</label>
				<input type="text" name="tripStartDate" /><br>
				<label>여행종료일</label>
				<input type="text" name="tripEndDate" /><br>
				
				<label>본문</label><textarea  name = "boardContent" maxlength = "4096" style = "height:180px; width:700px;"
				<%if(tripBoardNo!=null&& (!tripBoardNo.equals(""))){%>
				value=boardContent
				<%}%>></textarea><br/>
				<input type = "submit" value = "등록하기" style = "position:absolute; left:650px;">
			</form>
			<%if(tripType==null||tripType.equals("")){%>
				<a href = "./index.jsp"><input type ="button" value = "취소"style = "position:absolute; left:10px;"> </a>
			<%}else{ %>
				<a href = "./<%= tripType%>.jsp"><input type ="button" value = "취소"style = "position:absolute; left:10px;"> </a>
			<%} %>
</html>

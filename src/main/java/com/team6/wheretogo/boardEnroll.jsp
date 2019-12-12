<%//Freeforum과 CountryForum에서 사용됨.




//이젠 섹션에서 가져온 아이디.
String userID = null;
//request에서 가져온 boardType
String boardType=null;

%>

<%
	if(session.getAttribute("userID")!=null){userID = (String) session.getAttribute("userID");}

	if(request.getParameter("boardType")!=null)
	{
		try{boardType = request.getParameter("boardType");}
		catch(Exception e){System.out.println("비정상적인 접근 또는 검색에러");}
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<title>보드글입니다.</title>
		<style>
			body			{	height:100%;	width: 1000px;}
			label			{display: inline-block;	width: 400px;}
			#MainConsult	{width: 1500px;	height:500px;}
		</style>
	</head>
	
	<body >
			<form action="./boardEnrollAction.ejs" method="post"   ENCTYPE="multipart/form-data">
			
				<label>게시판종류</label>
				<select name = "boardType">
					<option value=<%=boardType%>>
						<%if(boardType.equals("tripForum")){%>여행게시판<%}%>
						<%if(boardType.equals("countryForum")){%>해외포럼<%}%>
						<%if(boardType.equals("freeForum")){%>자유게시판<%}%>
					</option>
				</select><br>
				
				<label>게시판분류</label>
				<select name = "boardClassfy" >
					<%if(boardType.equals("tripForum")){%>
						<option value="tripPlan">여행계획</option>
						<option value="tripLog">여행일지</option>
					<%}
					else if(boardType.equals("countryForum")){%>
						<option value="Korea">한국</option>
						<option value="China">중국</option>
						<option value="Japan">일본</option>
					<%}
					else if(boardType.equals("freeForum")){%>
						<option value="Free">자유게시판</option>
					<%}%>
				</select><br>
				<%if(tripBoardNo!=null&& (!tripBoardNo.equals(""))){%><%}%>
	
				<label>게시판제목</label>
				<input type = "text" name = "boardTitle" class = "form-control" maxlength = "30" style = "width:300px"><br />
				
				<label>작성자이름</label>
				<select name = "boardWriter" ><option value = "<%=userID%>" selected><%=userID%></option></select><br>
				
				<label>본문</label>
				<textarea  name = "boardContent" maxlength = "4096" style = "height:180px; width:700px;"></textarea><br/>
				
				<input type = "submit" value = "등록하기" style = "position:absolute; left:650px;">
			</form>
			<%if(boardType==null||boardType.equals("")){%>
				<a href = "./index.ejs"><input type ="button" value = "취소"style = "position:absolute; left:10px;"> </a>
			<%}else{ %>
				<a href = "./<%= boardType%>.ejs"><input type ="button" value = "취소"style = "position:absolute; left:10px;"> </a>
			<%} %>
</html>

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

	
	
<!DOCTYPE html>
<html>
	<head>
		<meta charset = "UTF-8">
		<title>WTG</title>
		<link rel = "stylesheet" href = "libs/jquerty-ui.min.css"/>
		<link rel = "stylesheet" href = "styles/styles.css"/>
		<script src = "libs/jquery-ui.min.js"></script>
		<script src = "scripts/scripts.js"></script>
		<script type="text/javascript">	</script>
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
			<article id = "indexBoard"></article>
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
						<div id = "IDPWD2">
							<div id = "UserJoin">
								<a href = "./userJoin.jsp">회원가입</a>
							</div>
							<div id = "FindIDAndPassWord">
								<a href = "findID.jsp">아이디찾기 /</a>
								<a href = "findPassword.jsp">비밀번호찾기</a>
							</div>
						</div>
					</form>
				<%}else{ %><a href = "./userLogOut.jsp">로그아웃.</a><%} %>
			</article>
		</section>
		
		<!-- 꼬리말-->
		<footer>
			개인정보처리방침<br>
			CopyRight  All right reserved
		</footer>
	</body>
</html>

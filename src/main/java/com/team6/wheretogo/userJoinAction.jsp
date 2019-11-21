<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="user.UserDTO" %>
<%@ page import ="user.UserDAO" %>
<%@ page import ="java.io.PrintWriter" %>
	<%
	request.setCharacterEncoding("UTF-8");
	String userID = "1";
	String userPassword = "1";
	String userPassword2 = "1";
	String userName = "1";
	String userBirthDate= "1";
	String userGender= "1";
	String userHintQestion= "1";
	String userHintAns= "1";
	String userEmail01= "1";
	String userEmail02 = "1";
	
	String userAddress01 = "1";
	String userAddress02 = "1";
	String userAddress03 = "1";
	String userPhoneNo01 = "1";
	String userPhoneNo02 = "1";
	String userPhoneNo03 = "1";
	String userCellPhoneNo01 = "1";
	String userCellPhoneNo02 = "1";
	String userCellPhoneNo03 = "1";
	
	if(request.getParameter("userID") !=null) userID = (String)request.getParameter("userID");
	if(request.getParameter("userPassword") !=null)userPassword = (String)request.getParameter("userPassword");
	if(request.getParameter("userPassword2") !=null)userPassword2 = (String)request.getParameter("userPassword2");
	if(request.getParameter("userName") !=null) userName = (String)request.getParameter("userName");
	if(request.getParameter("userBirthDate") !=null)userBirthDate = (String)request.getParameter("userBirthDate");
	if(request.getParameter("userGender") !=null) userGender = (String)request.getParameter("userGender");
	if(request.getParameter("userHintQestion") !=null)userHintQestion = (String)request.getParameter("userHintQestion");
	if(request.getParameter("userHintAns") !=null)userHintAns = (String)request.getParameter("userHintAns");
	if(request.getParameter("userEmail01") !=null)userEmail01 = (String)request.getParameter("userEmail01");
	if(request.getParameter("userEmail02") !=null)userEmail02 = (String)request.getParameter("userEmail02");
	

	if(request.getParameter("userAddress01") !=null) userAddress01 = (String)request.getParameter("userAddress01");
	if(request.getParameter("userAddress02") !=null) userAddress02 = (String)request.getParameter("userAddress02");
	if(request.getParameter("userAddress03") !=null) userAddress03 = (String)request.getParameter("userAddress03");
	if(request.getParameter("userPhoneNo01") !=null) userPhoneNo01 = (String)request.getParameter("userPhoneNo01");
	if(request.getParameter("userPhoneNo02") !=null) userPhoneNo02 = (String)request.getParameter("userPhoneNo02");
	if(request.getParameter("userPhoneNo03") !=null) userPhoneNo03 = (String)request.getParameter("userPhoneNo03");
	if(request.getParameter("userCellPhoneNo01") !=null) userCellPhoneNo01 = (String)request.getParameter("userCellPhoneNo01");
	if(request.getParameter("userCellPhoneNo02") !=null) userCellPhoneNo02 = (String)request.getParameter("userCellPhoneNo02");
	if(request.getParameter("userCellPhoneNo03") !=null) userCellPhoneNo03 = (String)request.getParameter("userCellPhoneNo03");
	
		
	if(userID ==null||userPassword == null||userPassword2 == null|| userName == null||userBirthDate == null||userGender == null
			||userID.equals("")||userPassword.equals("")||userPassword2.equals("")||userName.equals("")||userBirthDate.equals("") 	)
	{
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('입력이 안된사항이 있습니다');");
		script.println("history.back();");
		script.println("</script>");
		script.close();
	}
	else if(!userPassword.equals(userPassword2))
	{
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('비밀번호가 서로 다릅니다.');");
		script.println("history.back();");
		script.println("</script>");
		script.close();
	}
	else{
		UserDAO userDAO = new UserDAO();
		int result = userDAO.UserJoin(new UserDTO( userID,  userPassword,  userName, Integer.parseInt( userBirthDate), Boolean.parseBoolean( userGender),
				Integer.parseInt( userHintQestion),  userHintAns,  userEmail01,  userEmail02,  userAddress01,
				 userAddress02, 
				 userAddress03,
				 Integer.parseInt( userPhoneNo01), 
				 Integer.parseInt( userPhoneNo02), 
				 Integer.parseInt( userPhoneNo03),
				 Integer.parseInt( userCellPhoneNo01), Integer.parseInt( userCellPhoneNo02), Integer.parseInt( userCellPhoneNo03))); 
		
		
			
			//int result = userDAO.register(userID,userPassword,userName,userBirthDate,userGender,userAddress); 
			
			if(result == -1) {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('이미존재하는아이디입니다.');");
				script.println("history.back();");
				script.println("</script>");
				script.close();
			}else if(result==-2){
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('데이터베이스접속오류입니다.');");
				script.println("location.href = 'index.jsp';");
				script.println("</script>");
				script.close();
			}else if(result==0){
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('비밀번호오류입니다.');");
				script.println("location.href = 'index.jsp';");
				script.println("</script>");
				script.close();
			}else{
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('회원가입성공');");
				script.println("location.href = 'index.jsp';");
				script.println("</script>");
				script.close();
		}
		
	}
	
 	%>
    

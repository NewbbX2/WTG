<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="user.UserDTO" %>
<%@ page import ="user.UserDAO" %>
<%@ page import ="java.io.PrintWriter" %>
	<%
	request.setCharacterEncoding("UTF-8");
	String userID = null;
	String userPassword = null;
	String userPassword2 = null;
	String userName = null;
	String userBirthDate= null;
	String userGender= null;
	String userHintQestion= null;
	String userHintAns= null;
	String userEmail01= null;
	String userEmail02 = null;
	
	String userAddress01 = null;
	String userAddress02 = null;
	String userAddress03 = null;
	String userPhoneNo01 = null;
	String userPhoneNo02 = null;
	String userPhoneNo03 = null;
	String userCellPhoneNo01 = null;
	String userCellPhoneNo02 = null;
	String userCellPhoneNo03 = null;
	
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
	

	if(request.getParameter("userAddress01") !=null) userID = (String)request.getParameter("userID");
	if(request.getParameter("userAddress02") !=null)userPassword = (String)request.getParameter("userPassword");
	if(request.getParameter("userAddress03") !=null)userPassword2 = (String)request.getParameter("userPassword2");
	if(request.getParameter("userName") !=null) userName = (String)request.getParameter("userName");
	if(request.getParameter("userBirthDate") !=null)userBirthDate = (String)request.getParameter("userBirthDate");
	if(request.getParameter("userGender") !=null) userGender = (String)request.getParameter("userGender");
	if(request.getParameter("userHintQestion") !=null)userHintQestion = (String)request.getParameter("userHintQestion");
	if(request.getParameter("userHintAns") !=null)userHintAns = (String)request.getParameter("userHintAns");
	if(request.getParameter("userEmail01") !=null)userEmail01 = (String)request.getParameter("userEmail01");
	
		
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
				 userAddress02,  userAddress03, Integer.parseInt( userPhoneNo01), Integer.parseInt( userPhoneNo02), Integer.parseInt( userPhoneNo03),
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
    

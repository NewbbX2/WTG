<%@ page import ="trip.TripDTO" %>
<%@ page import ="trip.TripDAO" %>
<%@ page import = "java.io.File" %>
<%@ page import = "com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import = "com.oreilly.servlet.MultipartRequest" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%@ page import = "java.util.*,java.text.*" %>
<%@ page import = "java.sql.*" %>


<%@ page import ="java.io.PrintWriter" %>
<%@ page import = "util.DatabaseUtil" %>

<!DOCTYPE html>
<html>
<head></head>
<body oncontextmenu = "returnfalse" ondragstart = "return flase" onselectstart = "return false">

<%
	//로그인체크
	String userID = null;
		if(session.getAttribute("userID") !=null) userID = (String) session.getAttribute("userID");
		if(userID ==null){PrintWriter script = response.getWriter();script.println("<script>");script.println("alert('로그인이 필요합니다.');");
	script.println("location.href='./index.jsp'");script.println("</script>");script.close();return;}
%>
<%
	String directory = application.getRealPath("/upload/");
int maxSize = 1024*1024*100;	String encoding= "UTF-8";
MultipartRequest multipartRequest= new MultipartRequest(request, directory, maxSize,encoding,new DefaultFileRenamePolicy());
	
	

Calendar cal = Calendar.getInstance();
int boardDate = cal.get(Calendar.YEAR)*1000000+(cal.get(Calendar.MONTH)+1)*1000+cal.get(Calendar.DATE);
	
	

	String boardType=null;
	String boardClassfy=null;
	String boardTitle=null;
	int boardEnrollDate= cal.get(Calendar.YEAR)*10000+(cal.get(Calendar.MONTH)+1)*100+cal.get(Calendar.DATE);
	String boardWriter=null;
	String boardContent=null;	if(multipartRequest.getParameter("userID") !=null) userID = (String)multipartRequest.getParameter("userID");
	int tripStartDate=-1;
	if(multipartRequest.getParameter("tripStartDate") !=null) {String tripStartDates = (String)multipartRequest.getParameter("tripStartDate"); tripStartDate = Integer.parseInt(tripStartDates);}
	
	int tripEndDate=-1;
	if(multipartRequest.getParameter("tripEndDate") !=null) {String tripEndDates = (String)multipartRequest.getParameter("tripEndDate"); tripEndDate = Integer.parseInt(tripEndDates);}
	
	if(multipartRequest.getParameter("boardType") !=null) boardType = (String)multipartRequest.getParameter("boardType");
	if(multipartRequest.getParameter("boardClassfy") !=null) boardClassfy = (String)multipartRequest.getParameter("boardClassfy");	
	if(multipartRequest.getParameter("boardTitle") !=null) boardTitle = (String)multipartRequest.getParameter("boardTitle");
	if(multipartRequest.getParameter("boardWriter") !=null) boardWriter = (String)multipartRequest.getParameter("boardWriter");
	if(multipartRequest.getParameter("boardContent") !=null) boardContent = (String)multipartRequest.getParameter("boardContent");

	if(boardType==null||boardType.equals("")||boardClassfy==null||boardClassfy.equals("")||
			boardTitle==null||boardTitle.equals("")||boardWriter==null||boardWriter.equals("")||	
			boardContent==null||boardContent.equals("")			)
	{
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('입력이 안된사항이 있습니다');");
		script.println("history.back();");
		script.println("</script>");
		script.close();
		return;
	}
	
	if(tripStartDate==-1||tripEndDate==-1)
	{
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('여행일자가 부정확합니다');");
		script.println("history.back();");
		script.println("</script>");
		script.close();
		return;
	}
	
	TripDAO boardDAO = new TripDAO();
	int result = boardDAO.AddList(
		new TripDTO(
		0,  boardType, boardClassfy,  boardTitle,  boardEnrollDate,  			boardWriter,tripStartDate,tripEndDate,boardContent));
	if(result == 1) {
		session.setAttribute("userID", userID);
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("location.href='"+boardType+".jsp'");
		script.println("</script>");
		script.close();
		return ;
	}else if(result==-1)
	{
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('" + boardTitle +boardClassfy+ "리저트-1실패했습니다.');");
		script.println("location.href = 'index.jsp';");
		script.println("</script>");
		script.close();
		return;
	}else 
	{
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('" + boardTitle +boardClassfy+ "그밖의 실패했습니다.');");
		script.println("location.href = 'index.jsp';");
		script.println("</script>");
		script.close();
	}
%>
    
    
    
    
    
    
    
</body>
</html>
    

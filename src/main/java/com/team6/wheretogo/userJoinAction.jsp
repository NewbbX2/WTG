<%
request.setCharacterEncoding("UTF-8");
String userID = "1";
String userPassword1 = "1";
String userPassword2 = "1";
String userName = "1";
String userBirthDate= "1";
String userGender= "1";

if(request.getParameter("userID") !=null) userID = (String)request.getParameter("userID");
if(request.getParameter("userPassword1") !=null)userPassword1 = (String)request.getParameter("userPassword1");
if(request.getParameter("userPassword2") !=null)userPassword2 = (String)request.getParameter("userPassword2");
if(request.getParameter("userName") !=null) userName = (String)request.getParameter("userName");
if(request.getParameter("userBirthDate") !=null)userBirthDate = (String)request.getParameter("userBirthDate");
if(request.getParameter("userGender") !=null) userGender = (String)request.getParameter("userGender");
{%>
    

<!DOCTYPE html>
<html>
  <head> </head>
  <body>

    <%PrintWriter script = response.getWriter();
    if(userID ==null||userPassword1 == null||userPassword2 == null|| userName == null||userBirthDate == null||userGender == null
        ||userID.equals("")||userPassword1.equals("")||userPassword2.equals("")||userName.equals("")||userBirthDate.equals("") 	)
    <%{
            <a href = "/.userJoin.ejs">입력되지 않은사항이 있습니다. 돌아가시려면 클릭하거나 뒤로가기를 누르시오.</a>
    <%}
    else if(!userPassword1.equals(userPassword2))
    {
        PrintWriter script1 = response.getWriter();%>
        
        <a href = "/.userJoin.ejs">비밀번호가 다릅니다. 돌아가시려면 클릭하거나 뒤로가기를 누르시오.</a>
    <%}
    else{

 ////////////////////////
 //////!!!!!!!!!!!!////
 //여기서 DB 검색해서 중복아이디 있나 체크.
 //중복있으면 돌려보내기.
 //DB없으면 오류인데 이건 안해도될듯.
 //중복없으면 생성
    }

    %>

    </body>
</html>

 <%@ page language = "java" contentType = "text/html; charset = UTF-8" pageEncoding = "UTF-8"%>
<%@ page import ="user.UserDTO" %>
<%@ page import ="user.UserDAO" %>
<%@ page import = "java.util.ArrayList"%>
<%@ page import = "java.net.URLEncoder"%>
<!DOCTYPE html>
<html>
<head>
		<meta http-equiv = "Content-Type" content="text/html" charset="UTF-8">
		<title> 회원가입페이지입니다.</title>
		<script type="text/javascript">
		//스크립트 부분, 비밀번호 두개가 같은지 체크
		function PasswordCheckFunction()
		{
			var userPassword=$('#userPassword').val();
			var userPassword2=$('#userPassword2').val();
			if(userPassword!=userPassword2)		{$('#PasswordCheckMessage').html('비밀번호가 일치하지 않습니다.');}
			else									{$('#PasswordCheckMessage').html('');}
		}
		//이거 표시할 장소 만들예정
	</script>
</head>
<body oncontextmenu='return false' ondragstart = "return flase" onselectstart = "return false">
	

	<div class = "container">
		<form action = "userJoinAction.jsp">
			<table class = "table table-bordered table-hover" style="text-align: center;border:1px solid #dddddd">
				<thead>
					<tr>
						<th colspan="3">
							<h4>회원가입</h4>
						</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td style = "width:110px;"><h5>아이디</h5></td>
						<td colspan="2"><input type = "text" onkeyup="IDCheckFunction();" id = "userID" name = "userID" placeholder= "아이디를 입력해 주십시오."maxLength = "20"></td>
					</tr>
					<tr>
						<td style = "width:110px;"><h5>비밀번호</h5></td>
						<td colspan="2"><input type = "password" onkeyup="PasswordCheckFunction();"id = "userPassword" name = "userPassword" placeholder= "비밀번호를 입력하십시오."maxLength = "20"></td>
					</tr>
					<tr>
						<td style = "width:110px;"><h5>비밀번호 확인</h5></td>
						<td colspan="2"><input type = "password" onkeyup="PasswordCheckFunction();" id = "userPassword2" name = "userPassword2" placeholder= "비밀번호(확인)을 입력해주십시오."maxLength = "20"></td>
					</tr>
					<tr>
						<td style = "width:110px;"><h5>이름</h5></td>
						<td colspan="2"><input type = "text" id = "userName" name = "userName"placeholder= "이름을 입력해 주십시오." maxLength = "20"></td>
					</tr>
					<tr>
						<td style = "width:110px;"><h5>생년월일</h5></td>
						<td colspan="2"><input type = "text" id = "userBirthDate" name = "userBirthDate" placeholder= "생년월일을 입력해주십시오예) 20000101"maxLength = "8"></td>
					</tr>
					<tr>
						<td style = "width:110px;"><h5>성별</h5></td>
						<td colspan="2">
								<select name = "userGender" class =  "form-control">
									<option   value = "true" > 남자</option>
									<option value = "false" selected> 여자</option>
								</select>
						</td>
					</tr>
					<tr>
						<td style = "width:110px;"><h5>비밀번호힌트</h5></td>
						<td colspan="2">
							<select name = "userHintQestion" class = "form-control">
								 <option value=''>선택하세요</option>
						          <option value='30'>졸업한 초등학교 이름은?</option>
						          <option value='31'>제일 친한 친구의 핸드폰 번호는?</option>
						          <option value='32'>아버지 성함은?</option>
						          <option value='33'>어머니 성함은?</option>
						          <option value='34'>어릴 적 내 별명은?</option>
						          <option value='35'>가장 아끼는 물건은?</option>
						          <option value='36'>좋아하는 동물은?</option>
						          <option value='37'>좋아하는 색깔은?</option>
						          <option value='38'>좋아하는 음식은?</option>
							</select>
						</td>
					</tr>
					<tr>
						<td style = "width:110px;"><h5>비밀번호답변</h5></td>
						<td colspan="2"><input type = "text" id = "userHintAns" name = "userHintAns" placeholder= "비밀번호 답변을 입력해주시요"maxLength = "50"></td>
					</tr>
					
					<tr>
						<td style = "width:110px;"><h5>유저 Email</h5></td>
						<td><input type = "text" id = "userEmail01" name = "userEmail01" placeholder= "Email앞자리를 입력해주시오."maxLength = "8"></td>
						<td>
							<select name = "userEmail02" class = "form-control">
					                 <option value="">직접입력</option>
					                 <option value="daum.net">daum.net</option>
					                 <option value="empal.com">empal.com</option>
					                 <option value="gmail.com">gmail.com</option>
					                 <option value="hanmail.net">hanmail.net</option>
					                 <option value="msn.com">msn.com</option>
					                 <option value="naver.com">naver.com</option>
					                 <option value="nate.com">nate.com</option>
							</select>
						</td>
					</tr>
					<tr>
						<td style = "width:110px;"><h5>주소</h5></td>
						<td><input type = "text" id = "userAddress01" name = "userAddress01" placeholder= "주소"maxLength = "30"></td>
						<td><input type = "text" id = "userAddress02" name = "userAddress02" placeholder= "주소뒷자리"maxLength = "30"></td>
						<td><input type = "text" id = "userAddress03" name = "userAddress03" placeholder= "zipcode"maxLength = "20"></td>
					</tr>
					<tr>
						<td style = "width:110px;"><h5>전화번호</h5></td>
						<td><input type = "text" id = "userPhoneNo01" name = "userPhoneNo01" placeholder= "ex)010"maxLength = "8"></td>
						<td><input type = "text" id = "userPhoneNo02" name = "userPhoneNo02" placeholder= "ex)9244"maxLength = "8"></td>
						<td><input type = "text" id = "userPhoneNo03" name = "userPhoneNo03" placeholder= "ex)0000"maxLength = "8"></td>
					</tr>
					<tr>
						<td style = "width:110px;"><h5>핸드폰번호</h5></td>
						<td><input type = "text" id = "userCellPhoneNo01" name = "userCellPhoneNo01" placeholder= "ex)010"maxLength = "8"></td>
						<td><input type = "text" id = "userCellPhoneNo02" name = "userCellPhoneNo02" placeholder= "ex)9244"maxLength = "8"></td>
						<td><input type = "text" id = "userCellPhoneNo03" name = "userCellPhoneNo03" placeholder= "ex)0000"maxLength = "8"></td>
					</tr>
					<tr>
						<td style = "text-align:lefg"colspan="3">
							<input type = "submit" value = "회원가입">
							<h5 style = "color:red;" id = "IDCheckMessage"></h5>
							<h5 style = "color:red;" id = "PasswordCheckMessage"></h5>
							<a href = "index.jsp" >취소</a>
						</td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
</body>
</html>

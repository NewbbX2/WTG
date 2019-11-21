
package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DatabaseUtil;

public class UserDAO {
	//DB에 유저추가.
	public int UserJoin(UserDTO User)
	{
		String SQL = "INSERT INTO userInfor VALUES(?,?,?,?,?,  ?,?,?,?,?,		?,?,?,?,?,  ?,?,?)";
		try {
			Connection conn = DatabaseUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			
			pstmt.setString(1,User.getUserID());
			pstmt.setString(2,User.getUserPassword());
			pstmt.setString(3,User.getUserName());
			pstmt.setInt(4,User.getUserBirthDate());
			pstmt.setBoolean(5, User.isUserGender());
			

			pstmt.setInt(6,User.getUserHintQestion());
			pstmt.setString(7,User.getUserHintAns());
			pstmt.setString(8,User.getUserEmail01());
			pstmt.setString(9,User.getUserEmail02());
			pstmt.setString(10, User.getUserAddress01());
			

			pstmt.setString(11,User.getUserAddress02());
			pstmt.setString(12,User.getUserAddress03());
			pstmt.setInt(13,User.getUserPhoneNo01());
			pstmt.setInt(14,User.getUserPhoneNo02());
			pstmt.setInt(15, User.getUserPhoneNo03());
			

			pstmt.setInt(16,User.getUserCellPhoneNo01());
			pstmt.setInt(17,User.getUserCellPhoneNo02());
			pstmt.setInt(18,User.getUserCellPhoneNo03());
			return pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return -1;
		}
	}
	
	
	//DB에서 유저삭제
	public int UserDelete(String UserID)
	{
		String SQL = "DELETE FROM  userInfor WHERE userID = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1,UserID);
			return pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally 
		{
			try{	if(conn!=null)	conn.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(pstmt!=null)	pstmt.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(rs!=null)	rs.close();}	catch(Exception e){e.printStackTrace();};
		}
		return -1;
	}
	
	
	
	//로그인용 비밀번호 체크
	//1 : 일치
	//2 : 불일치
	//-2 : 입력안된것 있음.
	//-1 : DB목차 오류
	//-3 : DB오류
	public int UserPasswordCheck(String UserID,String UserPassword)
	{
		String SQL = "SELECT userPassword FROM userInfor WHERE userID = ?";
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		if(UserID==null || UserID.equals("")|| UserPassword==null || UserPassword.equals(""))
		{
			return -2;
		}
		else {
			try 
			{ 
				 conn = DatabaseUtil.getConnection();
				 pstmt = conn.prepareStatement(SQL);
				 pstmt.setString(1, UserID);
				 rs=pstmt.executeQuery();
				 if(rs.next())
				 {
					if(rs.getString(1).equals(UserPassword)){return 1;}
					else{return 0;}
				 }
				 return -1;
			}catch(Exception e) {e.printStackTrace();}
			finally {
				try{	if(conn!=null)	conn.close();}	catch(Exception e){e.printStackTrace();};
				try{	if(pstmt!=null)	pstmt.close();}	catch(Exception e){e.printStackTrace();};
				try{	if(rs!=null)	rs.close();}	catch(Exception e){e.printStackTrace();};
			}
			return -3;//DB오류
		}	
	}

	
	//아이디찾기.
	public String FindID(String userName,int userBirthDate,Boolean userGender,int userHintQestion,String userHintAns)
	{
		String SQL = "SELECT userID FROM userInfor WHERE userName = ? AND userBirthDate = ?  AND userGender = ? AND userAddress = ? ";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1,userName);
			pstmt.setInt(2,userBirthDate);
			pstmt.setBoolean(3,userGender);
			pstmt.setInt(4,userHintQestion);
			pstmt.setString(5,userHintAns);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
		}catch(Exception e) {e.printStackTrace();}
		finally 
		{
			try{	if(conn!=null)	conn.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(pstmt!=null)	pstmt.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(rs!=null)	rs.close();}	catch(Exception e){e.printStackTrace();};
		}
		return null;//데이터베이스 오류
	}
	
	
	
	public String getUserName(String UserID)
	{
		String SQL = "SELECT userName FROM userInfor WHERE userID = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1,UserID);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
		}catch(Exception e) {e.printStackTrace();}
		finally 
		{
			try{	if(conn!=null)	conn.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(pstmt!=null)	pstmt.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(rs!=null)	rs.close();}	catch(Exception e){e.printStackTrace();};
		}
		return null;//데이터베이스 오류
	}
	
	
	
	
	
}

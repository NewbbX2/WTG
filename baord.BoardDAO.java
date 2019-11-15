package board;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import util.DatabaseUtil;

public class BoardDAO
{
	
	public int Delete(int BoardNo)
	{
		String SQL = "DELETE FROM board WHERE boardNo = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, BoardNo);
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

	
	
	

	public String GetBoardTitle(int BoardNo)
	{
		String SQL = "SELECT boardTitle FROM board WHERE BoardNo = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1,BoardNo);
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
		return null;
	}
	public String GetBoardClassfy(int BoardNo)
	{
		String SQL = "SELECT boardClassfy FROM board WHERE BoardNo = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1,BoardNo);
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
		return null;
	}
	public int GetEnrollDate(int BoardNo)
	{
		String SQL = "SELECT boardEnrollDate FROM board WHERE boardNo = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1,BoardNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		}catch(Exception e) {e.printStackTrace();}
		finally 
		{
			try{	if(conn!=null)	conn.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(pstmt!=null)	pstmt.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(rs!=null)	rs.close();}	catch(Exception e){e.printStackTrace();};
		}
		return 0;
	}
	public String GetBoardWriter(int BoardNo)
	{
		String SQL = "SELECT boardWriter FROM board WHERE boardNo = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1,BoardNo);
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
		return null;
	}
	public int GetBoardViews(int BoardNo)
	{
		String SQL = "SELECT boardViews FROM board WHERE boardNo = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1,BoardNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		}catch(Exception e) {e.printStackTrace();}
		finally 
		{
			try{	if(conn!=null)	conn.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(pstmt!=null)	pstmt.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(rs!=null)	rs.close();}	catch(Exception e){e.printStackTrace();};
		}
		return 0;
	}
	public int GetBoardRecommandation(int BoardNo)
	{
		String SQL = "SELECT boardRecommandation FROM board WHERE boardNo = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1,BoardNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		}catch(Exception e) {e.printStackTrace();}
		finally 
		{
			try{	if(conn!=null)	conn.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(pstmt!=null)	pstmt.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(rs!=null)	rs.close();}	catch(Exception e){e.printStackTrace();};
		}
		return 0;
	}
	public String GetBoardContent(String boardID)
	{
		String SQL = "select boardContent from board where boardID = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1,Integer.parseInt(boardID));
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
		return null;
	}
	
	
	
	public void IncreaseBoardViews(int boardNo)
	{

		String SQL= "UPDATE board SET boardViews = boardViews + 1 WHERE boardNo = ? ";
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rs = 0;
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1,boardNo);
			rs = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally 
		{
			try{	if(conn!=null)	conn.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(pstmt!=null)	pstmt.close();}	catch(Exception e){e.printStackTrace();};
		}
	}
	public void IncreaseBoardRecommandation(int boardNo)
	{

		String SQL= "UPDATE board SET boardRecommandation = boardRecommandation + 1 WHERE boardNo = ? ";
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rs = 0;
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1,boardNo);
			rs = pstmt.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		finally 
		{
			try{	if(conn!=null)	conn.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(pstmt!=null)	pstmt.close();}	catch(Exception e){e.printStackTrace();};
		}
	}
	
	
	
	
	
	
	
	
	

	
	public int AddList(BoardDTO boardDTO)
	{
		String SQL = "INSERT INTO board VALUES(null,?,?,?,?,  	?,?,?,?);";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);						
			//pstmt.setInt(1,boardDTO.getBoardID());
			pstmt.setString(1,boardDTO.getBoardType().replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\r\n", "<br>"));
			pstmt.setString(2,boardDTO.getBoardClassfy().replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\r\n", "<br>"));
			pstmt.setString(3,boardDTO.getBoardTitle().replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\r\n", "<br>"));
			pstmt.setInt(4,boardDTO.getBoardEnrollDate());
			pstmt.setString(5,boardDTO.getBoardWriter().replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\r\n", "<br>"));	
			pstmt.setInt(6,boardDTO.getBoardViews());
			pstmt.setInt(7,boardDTO.getBoardRecommandation());
			pstmt.setString(8,boardDTO.getBoardContent().replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\r\n", "<br>"));
			
			return pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally 
		{
			try{	if(conn!=null)	conn.close();}	catch(Exception e){e.printStackTrace();return -1;};
			try{	if(pstmt!=null)	pstmt.close();}	catch(Exception e){e.printStackTrace();return -1;};
			try{	if(rs!=null)	rs.close();}	catch(Exception e){e.printStackTrace();return -1;};
			
		}//DB
		return -2;
	}
	
	public int ReformList(BoardDTO boardDTO)
	{
		String SQL = "UPDATE board SET "
				+ "boardType = ? , boardClassfy = ? , boardTitle = ? , boardEnrollDate = ? , boardWriter = ? ,"
				+ "boardViews = ?, boardRecommandation = ?, boardContent = ? "
				+ "WHERE boardID = ?";
		
		
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);			
			pstmt.setString(1,boardDTO.getBoardType().replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\r\n", "<br>"));
			pstmt.setString(2,boardDTO.getBoardClassfy().replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\r\n", "<br>"));
			pstmt.setString(3,boardDTO.getBoardTitle().replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\r\n", "<br>"));
			pstmt.setInt(4,boardDTO.getBoardEnrollDate());
			pstmt.setString(5,boardDTO.getBoardWriter());
			pstmt.setInt(6,boardDTO.getBoardViews());
			pstmt.setInt(7,boardDTO.getBoardRecommandation());
			pstmt.setString(8,boardDTO.getBoardContent());
			pstmt.setInt(9,boardDTO.getBoardNo());
		
			return pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{	if(conn!=null)	conn.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(pstmt!=null)	pstmt.close();}	catch(Exception e){e.printStackTrace();};
			try{	if(rs!=null)	rs.close();}	catch(Exception e){e.printStackTrace();};
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
}

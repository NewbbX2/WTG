package board;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import board.BoardDTO;
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
	public String GetBoardContent(String boardNo)
	{
		String SQL = "select boardContent from board where boardNo = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1,Integer.parseInt(boardNo));
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
		String SQL = "INSERT INTO board VALUES(null,?,?,?,?,  	?,?,?,?,?);";

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
			pstmt.setInt(9,boardDTO.getTripNo());
			
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
				+ "boardViews = ?, boardRecommandation = ?, boardContent = ? , tripNo = ?"
				+ "WHERE boarNo = ?";
		
		
		
		
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
			pstmt.setInt(9,boardDTO.getTripNo());
			pstmt.setInt(10,boardDTO.getBoardNo());
		
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
	
	
	

	public ArrayList<BoardDTO> GetList(String boardType,String search) 
	{	
		ArrayList<BoardDTO> boardList = null;
		String SQL = "";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		
		try {conn = DatabaseUtil.getConnection();
			if(search==null||search.equals("")||search==""||search.equals(null))
			{
				SQL = "SELECT * FROM board WHERE boardType = ? ORDER BY boardNo";
				pstmt = conn.prepareStatement(SQL);
				pstmt.setString(1, boardType);
			}
			else
			{
				SQL = "SELECT * FRom board WHERE (boardType = ? ) AND CONCAT(boardTitle,boardWriter,boardContent)Like ? ORDER BY boardNo";
				pstmt = conn.prepareStatement(SQL);
				pstmt.setString(1, "%"+boardType+"%");
				pstmt.setString(2, "%"+search.replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\r\n", "<br>")+"%");
			}

			
			rs = pstmt.executeQuery();
			boardList = new ArrayList<BoardDTO>();
			while(rs.next()) {
				BoardDTO board = new BoardDTO(
							rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),	
							rs.getString(6),rs.getInt(7),rs.getInt(8),rs.getString(9),rs.getInt(10));
					boardList.add(board);
					}
		}
		catch(Exception e) {e.printStackTrace();}
		finally 
		{
					try{	if(conn!=null)	conn.close();}	catch(Exception e){e.printStackTrace();};
					try{	if(pstmt!=null)	pstmt.close();}	catch(Exception e){e.printStackTrace();};
					try{	if(rs!=null)	rs.close();}	catch(Exception e){e.printStackTrace();};
		}
		return boardList;
	}
	
	
	
	
	
}

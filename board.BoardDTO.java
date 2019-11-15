	package board;
public class BoardDTO
{
	int boardNo;
	String boardType;
	String boardClassfy;
	String boardTitle;
	int boardEnrollDate;
	
	String boardWriter;
	int boardViews;
	int boardRecommandation;
	String boardContent;
	
	
	
	public BoardDTO() {super();}
	
	
	
	
	
	
	
	
	
	
	
	public BoardDTO(int boardNo, String boardType, String boardClassfy, String boardTitle, int boardEnrollDate,
			String boardWriter, int boardViews, int boardRecommandation, String boardContent) {
		super();
		this.boardNo = boardNo;
		this.boardType = boardType;
		this.boardClassfy = boardClassfy;
		this.boardTitle = boardTitle;
		this.boardEnrollDate = boardEnrollDate;
		this.boardWriter = boardWriter;
		this.boardViews = boardViews;
		this.boardRecommandation = boardRecommandation;
		this.boardContent = boardContent;
	}











	public int getBoardNo() {
		return boardNo;
	}
	public String getBoardType() {
		return boardType;
	}
	public String getBoardClassfy() {
		return boardClassfy;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public int getBoardEnrollDate() {
		return boardEnrollDate;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public int getBoardViews() {
		return boardViews;
	}
	public int getBoardRecommandation() {
		return boardRecommandation;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}
	public void setBoardClassfy(String boardClassfy) {
		this.boardClassfy = boardClassfy;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public void setBoardEnrollDate(int boardEnrollDate) {
		this.boardEnrollDate = boardEnrollDate;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public void setBoardViews(int boardViews) {
		this.boardViews = boardViews;
	}
	public void setBoardRecommandation(int boardRecommandation) {
		this.boardRecommandation = boardRecommandation;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	

}

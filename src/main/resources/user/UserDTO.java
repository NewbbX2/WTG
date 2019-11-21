
package user;

public class UserDTO {
	private String userID;
	private String userPassword;
	private String userName;
	private int userBirthDate;
	private boolean userGender;
	
	private int userHintQestion;
	private String userHintAns;
	private String userEmail01;
	private String userEmail02;
	private String userAddress01;
	
	
	private String userAddress02;
	private String userAddress03;
	private int userPhoneNo01;
	private int userPhoneNo02;
	private int userPhoneNo03;
	
	private int userCellPhoneNo01;
	private int userCellPhoneNo02;
	private int userCellPhoneNo03;

	
	
	
	
	
	
	
	public UserDTO(String userID, String userPassword, String userName, int userBirthDate, boolean userGender,
			int userHintQestion, String userHintAns, String userEmail01, String userEmail02, String userAddress01,
			String userAddress02, String userAddress03, int userPhoneNo01, int userPhoneNo02, int userPhoneNo03,
			int userCellPhoneNo01, int userCellPhoneNo02, int userCellPhoneNo03) {
		super();
		this.userID = userID;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userBirthDate = userBirthDate;
		this.userGender = userGender;
		this.userHintQestion = userHintQestion;
		this.userHintAns = userHintAns;
		this.userEmail01 = userEmail01;
		this.userEmail02 = userEmail02;
		this.userAddress01 = userAddress01;
		this.userAddress02 = userAddress02;
		this.userAddress03 = userAddress03;
		this.userPhoneNo01 = userPhoneNo01;
		this.userPhoneNo02 = userPhoneNo02;
		this.userPhoneNo03 = userPhoneNo03;
		this.userCellPhoneNo01 = userCellPhoneNo01;
		this.userCellPhoneNo02 = userCellPhoneNo02;
		this.userCellPhoneNo03 = userCellPhoneNo03;
	}
	public String getUserID() {
		return userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public int getUserBirthDate() {
		return userBirthDate;
	}
	public boolean isUserGender() {
		return userGender;
	}
	public int getUserHintQestion() {
		return userHintQestion;
	}
	public String getUserHintAns() {
		return userHintAns;
	}
	public String getUserEmail01() {
		return userEmail01;
	}
	public String getUserEmail02() {
		return userEmail02;
	}
	public String getUserAddress01() {
		return userAddress01;
	}
	public String getUserAddress02() {
		return userAddress02;
	}
	public String getUserAddress03() {
		return userAddress03;
	}
	public int getUserPhoneNo01() {
		return userPhoneNo01;
	}
	public int getUserPhoneNo02() {
		return userPhoneNo02;
	}
	public int getUserPhoneNo03() {
		return userPhoneNo03;
	}
	public int getUserCellPhoneNo01() {
		return userCellPhoneNo01;
	}
	public int getUserCellPhoneNo02() {
		return userCellPhoneNo02;
	}
	public int getUserCellPhoneNo03() {
		return userCellPhoneNo03;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserBirthDate(int userBirthDate) {
		this.userBirthDate = userBirthDate;
	}
	public void setUserGender(boolean userGender) {
		this.userGender = userGender;
	}
	public void setUserHintQestion(int userHintQestion) {
		this.userHintQestion = userHintQestion;
	}
	public void setUserHintAns(String userHintAns) {
		this.userHintAns = userHintAns;
	}
	public void setUserEmail01(String userEmail01) {
		this.userEmail01 = userEmail01;
	}
	public void setUserEmail02(String userEmail02) {
		this.userEmail02 = userEmail02;
	}
	public void setUserAddress01(String userAddress01) {
		this.userAddress01 = userAddress01;
	}
	public void setUserAddress02(String userAddress02) {
		this.userAddress02 = userAddress02;
	}
	public void setUserAddress03(String userAddress03) {
		this.userAddress03 = userAddress03;
	}
	public void setUserPhoneNo01(int userPhoneNo01) {
		this.userPhoneNo01 = userPhoneNo01;
	}
	public void setUserPhoneNo02(int userPhoneNo02) {
		this.userPhoneNo02 = userPhoneNo02;
	}
	public void setUserPhoneNo03(int userPhoneNo03) {
		this.userPhoneNo03 = userPhoneNo03;
	}
	public void setUserCellPhoneNo01(int userCellPhoneNo01) {
		this.userCellPhoneNo01 = userCellPhoneNo01;
	}
	public void setUserCellPhoneNo02(int userCellPhoneNo02) {
		this.userCellPhoneNo02 = userCellPhoneNo02;
	}
	public void setUserCellPhoneNo03(int userCellPhoneNo03) {
		this.userCellPhoneNo03 = userCellPhoneNo03;
	}

	
}

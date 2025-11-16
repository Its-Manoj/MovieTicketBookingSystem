package admin;

public class AdminInfo {
	private String AdminId;
	private String PassKey;
	
	
	public AdminInfo() {
		
	}
	
	public AdminInfo(String AdminId, String PassKey) {
		this.AdminId=AdminId;
		this.PassKey=PassKey;
	}
	public String getAdminId() {
		return AdminId;
	}
	public void setAdminId(String adminId) {
		AdminId = adminId;
	}
	public String getPassKey() {
		return PassKey;
	}
	public void setPassKey(String passKey) {
		PassKey = passKey;
	}
	

}

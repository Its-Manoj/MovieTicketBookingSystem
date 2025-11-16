package customer;

public class CustomerInfo {
	private String Name;
	private double Mobile;
	private String Email;

	public CustomerInfo() {

	}

	public CustomerInfo(String Name,double Mobile,String Email) {
		this.Name=Name;
		this.Mobile=Mobile;
		this.Email=Email;

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getMobile() {
		return Mobile;
	}

	public void setMobile(double mobile) {
		Mobile = mobile;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	


}

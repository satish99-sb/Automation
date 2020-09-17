package beans;

public class UserBean {
	private String uname;
	private String uemail;
	private String umobile;
	private String uaddress;
	private String upass;
	private String urpass;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUmobile() {
		return umobile;
	}
	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUrpass() {
		return urpass;
	}
	public void setUrpass(String urpass) {
		this.urpass = urpass;
	}
	@Override
	public String toString() {
		return "UserBean [uname=" + uname + ", uemail=" + uemail + ", umobile=" + umobile + ", uaddress=" + uaddress
				+ ", upass=" + upass + ", urpass=" + urpass + "]";
	}
	
	
}

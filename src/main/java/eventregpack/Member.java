package eventregpack;

public class Member {
	private String fullname, htnumber, branch, section, email, password, phone, gender, address;

	public Member() {
		super();
	}

	public Member(String fullname, String htnumber, String branch, String section, String email, String password,
			String phone, String gender, String address) {
		super();
		this.fullname = fullname;
		this.htnumber = htnumber;
		this.branch = branch;
		this.section = section;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getHtnumber() {
		return htnumber;
	}

	public void setHtnumber(String htnumber) {
		this.htnumber = htnumber;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}

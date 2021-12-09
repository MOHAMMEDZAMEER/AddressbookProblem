package Com.bridgelabz.adbook;

/*Contact class contains Variables*/
public class ContactInfo {

	String FirstName;
	String LastName;
	String Address;
	String City;
	String State;
	int ZipCode;
	int PhoneNum;
	String Email;
	
	public ContactInfo(String fn,String ls,String a,String c,String s,int z,int pn,String e) {
		
		this .FirstName=fn;
		this.LastName=ls;
		this.Address=a;
		this.City=c;
		this.State=s;
		this.ZipCode=z;
		this.PhoneNum=pn;
		this.Email=e;
	
		
	}
	
	/**Initiating Getter and Setter Method**/
	
	public String getFirstName() {
		return FirstName;
	}



	public void setFirstName(String firstName) {
		FirstName = firstName;
	}



	public String getLastName() {
		return LastName;
	}



	public void setLastName(String lastName) {
		LastName = lastName;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public String getCity() {
		return City;
	}



	public void setCity(String city) {
		City = city;
	}



	public String getState() {
		return State;
	}



	public void setState(String state) {
		State = state;
	}



	public int getZipCode() {
		return ZipCode;
	}



	public void setZipCode(int zipCode) {
		ZipCode = zipCode;
	}



	public int getPhoneNum() {
		return PhoneNum;
	}



	public void setPhoneNum(int phoneNum) {
		PhoneNum = phoneNum;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}

	//override Method
	@Override
	public String toString() {
	return String.format("FirstName: " + getFirstName() +"\n"
						+ "LastName: " + getLastName() +"\n"
						+ "Address: " +getAddress() +"\n"
						+ "City: " + getCity() +"\n"
						+ "State: " + getState() +"\n"
						+ "ZipCode: " +getZipCode() +"\n"
						+ "PhoneNum: " +getPhoneNum() +"\n"
						+ "Email: " +getEmail() +"\n");
			
	}
		
	}

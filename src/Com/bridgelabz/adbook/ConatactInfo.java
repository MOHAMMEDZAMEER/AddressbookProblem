package Com.bridgelabz.adbook;

/*Contact class contains Variables*/
public class ConatactInfo {

	String FirstName;
	String LastName;
	String Address;
	String City;
	String State;
	int ZipCode;
	int PhoneNum;
	String Email;
	
	public ConatactInfo(String fn,String ls,String a,String c,String s,int z,int pn,String e) {
		
		this .FirstName=fn;
		this.LastName=ls;
		this.Address=a;
		this.City=c;
		this.State=s;
		this.ZipCode=z;
		this.PhoneNum=pn;
		this.Email=e;
	
		
	}
	
	public String toString() {
		return String.format(FirstName + " " +LastName + " " +Address +" " +City + " " +State + "" + ZipCode + " " +PhoneNum + " " +Email + " ");
	}
		
	}

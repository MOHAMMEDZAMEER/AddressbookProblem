package Com.bridgelabz.adbook;

import java.util.ArrayList;

public class AddressBookList {
	
	public static final int size = 0;
	String UserInputBookName;
	ArrayList<ContactInfo> Contact;
	
	//Constructor
	public AddressBookList(String UserInputBookName) {
		// TODO Auto-generated constructor stub
		this.UserInputBookName = UserInputBookName;
		this.Contact = new ArrayList<ContactInfo>();
	}

	public String getUserInputBookName() {
		return UserInputBookName;
	}

	public void setUserInputBookName(String userInputBookName) {
		UserInputBookName = userInputBookName;
	}

	@Override
	public String toString() {

		return "Address Book name :- " + UserInputBookName + "\n" + "Contacts :- " + Contact;
	}

	public static boolean isEmpty1() {
		// TODO Auto-generated method stub
		return false;
	}

	public static Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(AddressBookList addressBookList) {
		// TODO Auto-generated method stub
		
	}




	

	
}

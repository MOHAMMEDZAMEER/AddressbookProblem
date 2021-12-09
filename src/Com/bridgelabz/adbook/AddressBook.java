package Com.bridgelabz.adbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	//Input the Contact Information
	 Scanner Z = new Scanner(System.in);
	
	 ArrayList<ContactInfo> contactbook = new ArrayList<>();
	//Creting addcontact method
	public void addcontact() {
		System.out.print("Enter FirstName: ");
		String First= Z.next();
	
		System.out.print("Enter LastName: ");
		String Last = Z.next();
		
		System.out.print("Enter Address: ");
		String Address= Z.next();
		
		System.out.print("Enter City: ");
		String City = Z.next();
		
		System.out.print("Enter State: ");
		String State = Z.next();
		
		System.out.print("Enter ZipCode: ");
		int Zip = Z.nextInt();
		
		System.out.print("Enter PhoneNumber: ");
		int Phone = Z.nextInt();
		
		System.out.print("Enter Email: ");
		String email = Z.next();
	
	ContactInfo contact = new ContactInfo(First, Last, Address, City, State, Zip, Phone, email);
			contactbook.add(contact);
	System.out.println("\n Contact Added SuccsessFully");
	
	}
	// creating Diplay Method
	public void Displaycontact() {
		System.out.println("\n --------Contacts in AddressBook-------");
		for (ContactInfo person : contactbook) {
			System.out.println(person.toString());
		}
	}
	
	

	/*Main Method*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------WELLCOME TO ADDRESSBOOK PROBLEM---------");
	AddressBook obj = new AddressBook();
	obj.addcontact();
	obj.Displaycontact();
	}
	

}

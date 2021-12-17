package Com.bridgelabz.adbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	//Input the Contact Information
	 static Scanner Z = new Scanner(System.in);
	
	static  ArrayList<ContactInfo> contactbook = new ArrayList<>();
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
	
	//Edit Contact Feature
	public void EditContact() {
		System.out.println("/n Enter FirstName to EditContactInfo");
		String Name= Z.next();
	
		for(ContactInfo person : contactbook) {
			if(Name.equals(person.FirstName)) {
				System.out.println("\n Select option to Edit...."
											+ "1.FirstName."
											+ "2.LastName."
											+ "3.Address."
											+ "4.city."
											+ "5.State."
											+ "6.ZipCode."
											+ "7.PhoneNum."
											+ "8.Email.");
			
		
			int option = Z.nextInt();
			switch(option){
			case 1: 
				System.out.print("Enter new first name :- ");
				String newFirstName = Z.next();
				person.setFirstName(newFirstName);
				System.out.println("First name is updated.");
				break;
				
			case 2:
				System.out.print("Enter new last name :- ");
				String newLastName = Z.next();
				person.setLastName(newLastName);
				System.out.println("Last name is updated.");
				break;
				
			case 3:
				System.out.print("Enter new Address :- ");
				String newAddress = Z.next();
				person.setAddress(newAddress);
				System.out.println("Address is updated.");
				break;
				
			case 4:
				System.out.print("Enter new city name :- ");
				String newCity = Z.next();
				person.setCity(newCity);
				System.out.println("City is updated.");
				break;
				
			case 5:
				System.out.print("Enter new state name :- ");
				String newState = Z.next();
				person.setState(newState);
				System.out.println("State is updated.");
				break;
				
			case 6:
				System.out.print("Enter new Zip code :- ");
				int newZip = Z.nextInt();
				person.setZipCode(newZip);
				System.out.println("Zip code is updated.");
				break;
				
			case 7:
				System.out.print("Enter new phone number :- ");
				int newPhone =  Z.nextInt();
				person.setPhoneNum(newPhone);
				System.out.println("Phone number is updated.");
				break;
				
			case 8:
				System.out.print("Enter new email :- ");
				String newEmail = Z.next();
				person.setEmail(newEmail);
				System.out.println("Email is updated.");
				break;
				
			default:
				System.out.println("Please enter a number between 1 to 8 only...");
				
			}
		}
		else {
			continue;
			}
		}
	}
	
	//Delete contact Feture 
	public void Deletecontact() {
		System.out.print("Enter The Contact FirstName to DeleteContact");
		String delete = Z.next();
		
		for(int i =0;i<contactbook.size(); i++) {
			String  FindingFirstName = contactbook.get(i).getFirstName();
			
			if(delete.equals(FindingFirstName)) {
				contactbook.remove(i);
				System.out.println("\n Selected Contact Deleted Succsessfully");
				break;
			
			}else {
				continue;
			}
		}
		
	}
	//Adding multiple Person contacts Feture
	
	public void MultiplePerson() {
		System.out.print("Enter How Many Contacts Want Add ");
		int UserWant = Z.nextInt();
		for(int i =0;i<=UserWant;i++) {
			addcontact();
		}
	}
	
	//Uc:6 Ability to add Multiple Addressbook to System
	public void NewAddressBook() {
		System.out.print("Enter AddressBook Name :");
		String userInputBookName = Z.next();
	
		if(!CheckUnique(userInputBookName)) {
			System.out.println("you alredy have This Name AddressBook");
			return;
		}
	
		AddressBookList addressBookList = new AddressBookList(userInputBookName);
		addressBookList.add(addressBookList);
		
		System.out.println("New AddressBook is Added To List");
	}
		
	//Checking Unique AddressBook
	private boolean CheckUnique(String userInputBookName) {
		// TODO Auto-generated method stub
		if(AddressBookList.isEmpty1()) {
		return true;
	}
		for(int i = 0; i < AddressBookList.size; i++) {
			String getName = AddressBookList.get(i).UserInputBookName;
			if(getName.equals(userInputBookName)) {
				return false;
			}
		}
		return true;
	}
	
	// display address book
		public void displayAddressBook(AddressBookList[] AddressBookList) {
			for (AddressBookList addressBook : AddressBookList) {
				System.out.println(addressBook);
			}
		}
		
		
	/*Main Method*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------WELLCOME TO ADDRESSBOOK PROBLEM---------");
	AddressBook obj = new AddressBook();
	System.out.print("Choose One Option to Perfome On Address Book (1)ENTER OR (2)EXIT:");
	int Choose = Z.nextInt();
	
	if(Choose==1) {
		while(Choose !=2) {
			System.out.println("--------CHOOSE BELOW OPTION TO PERFOME ON ADDRESBOOK--------");
			
			System.out.println("1.AddContact");
			System.out.println("2.DeleteContact");
			System.out.println("3.EditContact");
			System.out.println("4.Add new AdressBook");
			System.out.println("5.Display AddressBook");
			System.out.println("6.Exit from the AddressBook");
		
			System.out.print("Choose Your Option:");
			
			int Choice= Z.nextInt();
			switch(Choice) {
			
			case 1 :
				obj.MultiplePerson();
				break;
			case 2 :
				obj.Deletecontact();
				break;
			case 3:
				obj.addcontact();
				break;
			case 4:
				obj.NewAddressBook();
				break;
			case 5 :
				obj.Displaycontact();
				break;
				
			default :
				System.out.println("Enter Valid Choice :");
			}
			if (Choice == 6) {
				System.out.println("Successfully exited from the Address Book Application.");
				break;
			}
		}
	} else if (Choose == 2) {
		System.out.println("Successfully exited from the Address Book Application.");
	} else {
		System.out.println("Choose Valid option [1.Enter (or) 2.Exit]...");
		
		}	
		
		
	}
	
	
	}
	
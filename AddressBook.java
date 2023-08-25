package MapProgram;

import java.util.Scanner;

public class AddressBook {
private String firstName;
private String lastName;
private String address;

public AddressBook() {
	enterName();
	enterAddress();
}

public AddressBook(String firstName, String lastName, String address) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
}

public void enterName() {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first name");
	setFirstName(input.nextLine());
	
	System.out.println("Enter last name");
	setLastName(input.nextLine());
}

public void enterAddress() {
	Scanner addressInput = new Scanner(System.in);
	System.out.println("Enter address");
	setAddress(addressInput.nextLine());
}

}
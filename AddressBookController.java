package MapProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookController {

	public static void main(String[] args) {
		ArrayList<AddressBook> addressBook = new ArrayList<AddressBook>();

		String menu = "Main Menu\n" + "1. Add address\n" + "2. Remove address\n" + "3. Count total addresses\n"
				+ "4. List all addresses\n" + "5. Find address by last name\n" + "6. Exit";

		int menuOption = 0;
		while (menuOption != 6) {
			System.out.println(menu);
			Scanner menuInput = new Scanner(System.in);
			menuOption = menuInput.nextInt();
			switch (menuOption) {
			case 1:
				addressBook.add(new AddressBook());
				break;
			case 2:
				removeAddress(addressBook);
				break;
			case 3:
				addressCount(addressBook);
				break;
			case 4:addressList(addressBook);
				break;
			case 5:
				findAddress(addressBook);
				break;
			case 6:
				menuOption = 6;
				System.out.println("Exiting");
				break;
			}
		}
	}

	public static void removeAddress(ArrayList<AddressBook> arrayList) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter address to remove");
		String addressR = input.nextLine();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getAddress().equals(addressR)) {
				arrayList.remove(i);
			}
		}
	}

	public static void addressCount(ArrayList<AddressBook> arrayList) {
		int count = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			count++;
		}
		System.out.println("Total addresses entered: " + count);
	}
	public static void addressList(ArrayList<AddressBook> arrayList) {
				for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getAddress());
			
		}
	}

	public static void findAddress(ArrayList<AddressBook> arrayList) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the last name of address to find");
		String nameR = input.nextLine();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getLastName().equals(nameR)) {
				System.out.println(arrayList.get(i));
			}

		}
	}

}

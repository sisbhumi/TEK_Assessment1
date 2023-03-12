package virtualkeyforrepo;

import java.util.Scanner;

public class LockedMeApp {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		System.out.println("-----------------------------------------------------");
		System.out.println("---------------Welcome to LockedMe.com.---------------");
		System.out.println("------------Developed by Bhumika Sisodiya------------");
		System.out.println("-----------------------------------------------------\n\n");
		FilesList obj = new FilesList();
		userChoice(obj);	
	}
	
	static String get() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter File Name.");
		String name = input.next();
		return name;
	}
	
	private static void userChoice(FilesList obj) {
		
		int choice=4;
		while(choice!=0) {
			
			displayMenu(obj);
			System.out.println("Enter you choice: ");
			choice = input.nextInt();
			
			switch(choice) {
				
			case 1: 
				obj.show();
				break;
			
			case 2:
				obj.addfile(get());
				break;
		
			case 3: 
				obj.search(get());
				break;
			
			case 4:
				obj.removefile(get());
				break;
			
			case 0: 
				System.out.println("Thank you!");
				break;	
			
			}	
		}	
	}

	private static void displayMenu(FilesList obj) {
		System.out.println("-----------------------------------------------------\n");
		System.out.println("Please Select a option from Menu.\n\n-Display All Files -> Press '1'\n"
				+ "-Add new File -> Press '2'\n"
				+ "-Search a File -> Press '3\n"
				+ "-Delete a File -> Press '4'\n"
				+ "-Close -> Press '0'");
		
		System.out.println("-----------------------------------------------------");
	}
}

import java.util.Scanner;

public class Customer {
	static String name;
	static String address;
	static long phoneNumber;
	static String email_id;
	
	//Loading Customer Details
	static void customerDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Name");
		name = scan.nextLine();
		System.out.println("Enter your Address");
		address = scan.nextLine();
		System.out.println("Enter Phone Number");
		phoneNumber = scan.nextLong();
		scan.nextLine();
		System.out.println("Enter your Email Id");
		email_id = scan.next();
//		scan.close();
	}
	
	//Pizza Selection Functionality
	static void selectionOfPizza(int choice, Pizza[] piz, int choiceMode) {
		Scanner sc = new Scanner(System.in);
		int quantity;
		System.out.println("Your choice is "+piz[choice-1].name);
		System.out.println("Enter the Quantity");
		quantity = sc.nextInt();
		System.out.println("Your Order of "+quantity+" "+piz[choice-1].name+" Pizza has placed");
		Pizza.billDisplay(quantity, choice, piz, choiceMode);
		
	}
}

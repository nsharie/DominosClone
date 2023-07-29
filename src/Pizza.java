import java.util.*;

public class Pizza {
	String name;
	int prize;
	String size;
	String category;
	
	//Loading the Pizza Data
	public Pizza(String name, int prize, String size, String category) {
		this.name = name;
		this.prize = prize;
		this.size = size;
		this.category = category;
	}
	
	//Bill Generation
	static void billDisplay(int quantity, int choice, Pizza[] pizza, int choiceMode) {
		if(choiceMode!=2) {
			if(choice == 1) {
				System.out.println("The total amount for "+quantity+" pizza is "+(quantity*pizza[choice-1].prize)); 
			}
			else {
				System.out.println("The total amount for "+quantity+" pizza is "+(quantity*pizza[choice-1].prize));
			}
		}
		else {
			if(choice == 1) {
				System.out.println("The total amount for "+quantity+" "+pizza[choice-1].name+" pizza is "+(quantity*pizza[choice-1].prize+50)); 
			}
			else {
				System.out.println("The total amount for "+quantity+" "+pizza[choice-1].name+" pizza is "+(quantity*pizza[choice-1].prize+50));
			}
		}
	}
	
	//Take Away Functionality
	static void takeAway(Pizza[] piz, int choiceMode) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);		
		
		while(true) {
			Restuarant.displayMenu(piz);
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				Customer.selectionOfPizza(choice, piz, choiceMode);
				System.out.println("Your order will be ready in 20 minutes");
				return;
			}
			case 2:{
				Customer.selectionOfPizza(choice, piz, choiceMode);
				System.out.println("Your order will be ready in 20 minutes");
				return;
			}
			default:
				System.out.println("Undefined Selection "+choice);
				System.out.println("Please select a valid Option");
				System.out.println();
			}		
		}
	}
	
	//Delievery Functionality
	static void delievery(Pizza[] piz, int choiceMode) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			Restuarant.displayMenu(piz);
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:{
				Customer.selectionOfPizza(choice, piz, choiceMode);
				System.out.println("Addition Delievery Charges is Rs.50");
				System.out.println("Your Order will be delievered to "+Customer.address+" in 20 minutes");
				return;
			}
			case 2:{
				Customer.selectionOfPizza(choice, piz, choiceMode);
				System.out.println("Addition Delievery Charges is Rs.50");
				System.out.println("Your Order will be delievered to "+Customer.address+" in 20 minutes");
				return;
			}
			default:
				System.out.println("Undefined Selection "+choice);
				System.out.println("Please select a valid Option");
				System.out.println();
			}
		}
	}
	
	//Dine In Functionality
	static void dineIn(Pizza[] piz, int choiceMode) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			Restuarant.displayMenu(piz);
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:{
				Customer.selectionOfPizza(choice, piz, choiceMode);
				System.out.println("Your Order will be ready in 10 minutes");
				return;
			}
			case 2:{
				Customer.selectionOfPizza(choice, piz, choiceMode);
				System.out.println("Your Order will be ready in 10 minutes");
				return;
			}
			}
		}
	}
}

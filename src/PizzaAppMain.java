import java.util.Scanner;

public class PizzaAppMain {
	
	//Pizza Details
	public static Pizza[] pizzaObjectCreation() {
		String pizza[][] = {{"Corn and Cheese","Regular","Veg"},{"Chicken","Regular","Non Veg"}};
		int price[] = {100,150};
		Pizza a[] = new Pizza[price.length];
		
		for (int i = 0; i < pizza.length; i++) {
				
			a[i] = new Pizza(pizza[i][0], price[i], pizza[i][1], pizza[i][2]);	
		}
		
		return a;
	}
	
	//Restaurants Details
	public static Restuarant[] restaurantObjectCreation() {
		String [] address = {"Sapthagiri Medical College, Chikkabanvara, Hesargatta","8th Mile, Bangalore","Yeshwantpur, Bangalore"};
		Restuarant [] restaurant = new Restuarant[address.length];
		
		for(int i=0;i<restaurant.length;i++) {
			restaurant[i] = new Restuarant(address[i]);
		}
		
		return restaurant;
	}
	
	//Main Method
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pizza [] pizza = pizzaObjectCreation();
		Restuarant[] restaurant = restaurantObjectCreation();
		System.out.println("Welcome to Domino's Clone App");
		System.out.println();
		System.out.println("Order Your Pizza At Your Convenience");
		System.out.println("<--------------------------------------------------->");
		Customer.customerDetails();

		while(true) {
			System.out.println();
			Restuarant.displayRestaurant(restaurant);
			System.out.println("Please Select the Restaurant");
			int restSelection = sc.nextInt();
			if(restSelection<4) {}
			else {System.out.println("Please Select From Above Restuarants"); continue;}
			System.out.println("Please select one of the options below");
			System.out.println("Select an Option from below");
			System.out.println("<---------------------------------------------->");
			System.out.println("1. Dine In");
			System.out.println("2. Delivery");
			System.out.println("3. Take Away");
			System.out.println("4. Exit");
			int choice = sc.nextInt();
			switch (choice) {
				case 1: 
					Pizza.dineIn(pizza,choice);
					System.out.println("Thank You");
					return;
	
				case 2:
					Pizza.delievery(pizza,choice);
					System.out.println("Thank You");
					return;
	
				case 3:
					Pizza.takeAway(pizza, choice);
					System.out.println("Thank You");
					return;
	
				case 4:System.out.println("Thank You");return;
	
				default:
					System.out.println("Unexpected Value "+choice);
					System.out.println("Please select a valid option");
			}
		}
		
	}

}

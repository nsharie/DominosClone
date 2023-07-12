
public class Restuarant {
	static String name = "Domino's";
	String address; 
	
	//Loading the Restuarants Address Data
	public Restuarant(String address) {
		this.address = address;
	}
	
	//Restuarants Display Functionality
	static void displayRestaurant(Restuarant[] rest) {
			for(int i=0;i<rest.length;i++) {
				System.out.println((i+1)+". "+name);
				System.out.println(rest[i].address);
				System.out.println();
			}
		}
	
	//Menu Display Fuctionality
	static void displayMenu(Pizza [] piz) {
		System.out.println("<----------------------Menu--------------------------->");		
		int j=1;
		for(int i=0;i<piz.length;i++) {
			System.out.println(j+"."+piz[i].name);
			System.out.println("  "+piz[i].size + " " + piz[i].category);
			System.out.println("  "+"Rs. "+piz[i].prize);
			System.out.println();
			j++;
		}
	}
	}
	

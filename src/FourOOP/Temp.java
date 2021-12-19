package FourOOP;
import java.util.*;
public class Temp {
	public static void main (String[] args) 
    {
		//declaring local variables 
		int priceOfOtherTypesOfRice = 45;
		double discountValue = 0.9;
		HashMap<String,Integer> ricePriceMap  = new HashMap<>();
		ricePriceMap.put("Lion", 48);
		ricePriceMap.put("Ganador", 50);
		ricePriceMap.put("Conchita", 47);
		double totalPrice =0.0;        		
		
        System.out.println("List of prices: ");
        System.out.println("Lion - Php48/kilo");
        System.out.println("Ganador - Php50/kilo");
        System.out.println("Conchita - Php47/kilo");
        System.out.println("Other types of rice - Php45/kilo");
        System.out.println(" ");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Type of rice: ");
        String rice = input.nextLine();
        System.out.println(" ");

        System.out.println("Kilos of rice: ");
        int kilo = input.nextInt();
        System.out.println(" ");
        
        System.out.println("Type of rice: " +rice);
        System.out.println("Kilos of rice: " +kilo);
        if(kilo>11)
        {
            System.out.println("You have a discount of 10%.");
            totalPrice  =kilo * ((discountValue)*ricePriceMap.getOrDefault(rice, priceOfOtherTypesOfRice));
        }
        else if(kilo<11)
        {
            System.out.println("You have no discount of 10%.");
            totalPrice  =kilo * ricePriceMap.getOrDefault(rice, priceOfOtherTypesOfRice);
        }
        System.out.println("Final total cost of rice is " + totalPrice);

    }
}



    
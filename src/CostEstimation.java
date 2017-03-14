//Damile Ferro Martinez
//March 9, 2017
//Class name: CostEstimation.java
//This program performs a cost estimation.

import java.util.Scanner;

public class CostEstimation {

	public static void main(String[] args) {
	
		Scanner keyBoard=new Scanner(System.in);
		double basePrice;
		int person;
		double flatMarkup;
		double cost1=0;
		double cost2 = 0;
		double cost3 = 0;
		
		//----> Prompt questions to user.
		
		System.out.print("Enter the base price >> ");
		basePrice=keyBoard.nextDouble();
				
		System.out.print("Enter how many person are involved >> ");
		person=keyBoard.nextInt();
		
		//Build material selection code
		
		//calculations
		flatMarkup = basePrice * 5 / 100;
		cost1 = basePrice + flatMarkup;
		cost2 = (cost1 * 1.2/100 )*person;
		
		//calculate final cost depending on material selection

		//Output

		System.out.print("The total cost is " + "$" + "finalCost");
		
	}

}

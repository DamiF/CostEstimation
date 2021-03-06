//Damile Ferro Martinez
//March 9, 2017
//Class name: CostEstimation.java
//This program performs a cost estimation.

import javax.swing.*;

public class CostEstimation {

	public static void main(String[] args) {
	
		double basePrice = 0;
		double flatMarkup;
		double[] materialMarkup = {7.5, 13, 2, 0};
		double finalCost;
		double cost1=0;
		double cost2 = 0;
		double cost3 = 0;
		int person = 0;
		int selectedMaterial = 0;
		String[] materials = {"Pharmaceutical", "Food", "Electronics", "Other"};
		String choicesOptions = "";
				
		//----> Builds a string to be prompt to the user.

		for(int x = 0; x < materialMarkup.length; ++x)
			choicesOptions = choicesOptions + "\n" + (x+1) + "- " + materials[x];
		
		//----> Prompt questions to user inside a Try block in case of any exception occurs.
		
		try{			
			basePrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the base price"));
			person = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how many person are involved"));
			choicesOptions = JOptionPane.showInputDialog(null, "Please select one of the following materials: \n" + choicesOptions); 
			selectedMaterial = Integer.parseInt(choicesOptions);
					
			//calculations
			flatMarkup = basePrice * 5 / 100;
			cost1 = basePrice + flatMarkup;
			cost2 = (cost1 * 1.2/100 )*person;
			
			if (selectedMaterial != 4){
				cost3 = cost1 * materialMarkup[selectedMaterial-1]/100;
				finalCost = cost1 + cost2 + cost3;
			}

			else
				finalCost = cost1 + cost2;

			//Output

			JOptionPane.showMessageDialog(null, "The total cost is " + "$" + finalCost);
			
		}
			// Actions to take if exception occurs 
			catch(Exception mistake){
				JOptionPane.showMessageDialog(null, "Your answer is not valid");
			}
	}
}

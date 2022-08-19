/***********************************************************************************************************************************************************************************
* MartianHouse.java
************************************************************************************************************************************************************************************
* project three - houses on mars 
************************************************************************************************************************************************************************************
* Project description 
* calcualte the estimate (cost) of settlers houses 
* Kevin Phung
* 9-25-2021
* CMSC-255-004
************************************************************************************************************************************************************************************/
import java.util.Scanner; 
public class MartianHouses {
	public static void main (String [] args) {
		/*************************************
		*Creating scanner
		**************************************/
		Scanner input = new Scanner (System.in);
		
		/*************************************
		* Redo process if ask again (holder outside)
		*************************************/
		String answer;
		
		/*************************************
		* Loop with do and while asking user
		*************************************/
		do {
		/***********************************
		* Ask the user to insert their names
		***********************************/
		System.out.println("Enter the settlers name:"); 
		String Name = input.nextLine();
		
		/**********************************
		* Ask the user to insert the length of the side of house 
		**********************************/
		System.out.println("Enter the length of a side of the house:");
		double sides = input.nextDouble(); 
		
		/**********************************
		* Calculating the area of roof
		**********************************/
		double roofArea = 2 * sides * sides * ( 1 + Math.sqrt(2));
		
		/**********************************
		*Calculating the area of the floor
		*********************************/
		double floorArea = 2 * sides * sides * (1 + Math.sqrt(2)); 
		
		/**********************************
		* Calculating area of outer walls 
		*********************************/
		double wallsArea = 8 * 12 * sides;
		
		/**********************************
		* Calcualting total surface area 
		**********************************/
		double surfaceArea = (roofArea + floorArea + wallsArea); 
		
		/**********************************
		* total cost of all the areas
		**********************************/
		double totalAmount = (surfaceArea * 14.50);
		
		/**********************************
		* Display the results and rounding
		**********************************/
		System.out.printf(Name + " has a house surface area of %,.2f and cost of $%,.2f\n", surfaceArea, totalAmount); 
		
		/**********************************
		* Asking user if they want to continue and try another house 
		*********************************/
		System.out.println("Would you like to enter another house? Enter no to exit.");
		input.nextLine();
		
		answer = input.nextLine().trim(); 
		}
		
		/**********************************
		* Loop if answer is something else other than no 
		*********************************/
		while (!answer.equalsIgnoreCase("no"));
	
	}
	
}
/****************************************************************************************************************************************************************************************
* MartianMoney.java
*************************************************************************************************************************************************************************************
* Project two - Money on mars
*************************************************************************************************************************************************************************************
* Project desciption 
* calcualting curreny between money on mars 
* Kevin Phung
* 9-4-2021
* CMSC-255-004
************************************************************************************************************************************************************************************/
import java.util.Scanner;
public class MartianMoney {
	 public static void main(String[] args) {
		 /********************
		 *creating a scanner
		 *********************/
		 Scanner input = new Scanner(System.in);
		 /*************************************
		 *choosing the options like if and else 
		 *************************************/
		 System.out.println("Would you like to randomly enter a dollar amount (1) or enter it yourself (2). "); 
		 int num = input.nextInt(); 
		 
		 /*************************
		 *the random ammount option 
		 *************************/
		 if (num == 1) {
		 int randomNum = (int) (Math.random() * 10000000) + 80; 
		 
		 double randomNumber = randomNum;
		 System.out.println (randomNum);
		 /*************************
		 * Calculating for the 1st options
		 *************************/
		 double convertRate = randomNumber / 80;
		 
		 /*************************
		 * conversion into cents 
		 *************************/
		 int leftAmount = (int) (convertRate * 100); 
		 
		 /*************************
		 *Find the number of one Tintina on 1st option
		 *************************/
		 int sumOfTintina = leftAmount / 100; 
		 leftAmount = leftAmount % 100; 
		 
		 /*************************
		 * Find the number of Sutton on 1st option 
		 *************************/
		 int sumOfSutton = leftAmount / 20; 
		 leftAmount = leftAmount % 20; 
		 
		 /*************************
		 * Find the number of knorr on 1st option 
		 *************************/
		 int sumOfKnorrs = leftAmount / 10; 
		 leftAmount = leftAmount % 10; 
		 
		 /*************************
		 * Find the number of Wernicke on 1st option
		 *************************/
		 int sumOfWernicke = leftAmount / 1; 
			 
		/************************* 
	    *Displaying results 
		/*************************/
		  System.out.print(randomNum + " is " + sumOfTintina + " Tintina " + sumOfSutton + " Sutton " + sumOfKnorrs + " Knorr " + sumOfWernicke + " Wernickes");
		  
		 }
		 
		 /*************************
		 *the other option
		 *************************/
		 else if (num == 2) {
		    System.out.println("Enter a dollar amount between $80 and $10,000,000. "); 
			double amount = input.nextDouble();
			if (amount >= 80 && amount <= 10000000) {
			
		/*************************	
		 * calcualting for the 2nd options
		*************************/
		double convertionRate = (amount / 80);
        
		 /*************************
		 * Conversion into cents 
		 *************************/
		int userAmount = (int) amount; 
        int remainingAmount = (int)(convertionRate * 100);
		 
		 /**************************
		 * Finding the number of Titnia on 2nd option 
		 **************************/
		 int numberOfTintina = remainingAmount / 100; 
		 remainingAmount = remainingAmount % 100;
		 
		 /*************************
		 *Find the number of Sutton on 2nd option 
		 *************************/
		 int numberOfSutton = remainingAmount / 20;
		  remainingAmount = remainingAmount % 20; 
		 
		 /*************************
		 * Find the number of knorr on 2nd option 
		 *************************/
		 int numberOfKnorrs = remainingAmount / 10; 
		 remainingAmount = remainingAmount % 10; 
		 
		 /*************************
		 * Find the number of wernicke on 2nd option 
		 *************************/
		 double numberOfWernicke = (double)remainingAmount / 1;
		 int numberOfWernickes = (int) numberOfWernicke;
		 /*************************
		 * Displaying results 
		 *************************/
		 if (numberOfSutton == 0 && numberOfKnorrs == 0) {
			 System.out.print(userAmount + " is " + numberOfTintina + " tintina " + numberOfWernickes + " wernicke ");
		 }
		 else if (numberOfWernickes == 0 && numberOfKnorrs == 0){
		     System.out.print(userAmount + " is " + numberOfTintina + " tintina " + numberOfSutton + " sutton ");
		 }
		 else if (numberOfSutton == 0 && numberOfWernickes == 0) {
			 System.out.print(userAmount + " is " + numberOfTintina + " tintina " + numberOfKnorrs + " knorr ");
		 }
		 else if (numberOfSutton == 0 ) {
			 System.out.print(userAmount + " is " + numberOfTintina + " tintina " + numberOfKnorrs + " knorr " + numberOfWernickes + " wernicke ");
		 }
		 else if (numberOfKnorrs == 0) {
			 System.out.print(userAmount + " is " + numberOfTintina + " tintina " + numberOfSutton + " sutton " + numberOfWernickes + " wernicke ");
		 }
		 else if (numberOfWernickes == 0) {
			 System.out.print(userAmount + " is " + numberOfTintina + " tintina " + numberOfSutton + " sutton " + numberOfKnorrs + " knorr ");
		 }
		 else {
			 System.out.print(userAmount + " is " + numberOfTintina + " tintina " + numberOfSutton + " sutton " + numberOfKnorrs + " knorr " + numberOfWernickes + " wernicke ");
		 
		  System.out.println();
			}
		 
		}
			else {
				System.out.print("incorrect input");
			}
		 }
		 
		 else {
			 System.out.print("incorrect input");
		 }

		 
		 
	 }
}

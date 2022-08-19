/***********************************************
* Kevin Phung
* CMSC 255 004
***********************************************/
import java.util.Scanner; 

public class PhoneSelection {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		/*****************
		* Prompt user to enter a single letter
		*****************/
		System.out.println("Enter a single letter, and I will tell you what the corresponding digit is on the telephone"); 
		
		/*****************
		* Capturing a character from the user
		*****************/
		char letter = input.next().charAt(0);
		
		/*****************
		* Convert input to uppercase letters
		*****************/
		letter = Character.toUpperCase(letter);
		
		/*****************
		* checking user imput and assign a letter
		*****************/
		if ( letter == 'A' || letter == 'B' || letter == 'C') {
			System.out.println("The digit 2 corresponds to the letter " + letter + " on the telephone.");
	}
	    else if ( letter == 'D' || letter == 'E' || letter == 'F') {
			System.out.println("The digit 3 corresponds to the letter " + letter + " on the telephone.");
	}
	    else if (letter == 'G' || letter == 'H' || letter == 'I') {
			System.out.println("The digit 4 corresponds to the letter " + letter + " on the telephone.");;
	}
	    else if ( letter == 'J' || letter == 'K' || letter == 'L') {
			System.out.println("The digit 5 corresponds to the letter " + letter + " on the telephone.");
	}
	    else if (letter == 'M' || letter == 'N' || letter == 'O') {
			System.out.println("The digit 6 corresponds to the letter " + letter + " on the telephone.");
	}
	    else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S' ) {
			System.out.println("The digit 7 corresponds to the letter " + letter + " on the telephone.");
	}
	    else if (letter == 'T' || letter == 'U' || letter == 'V') {
			System.out.println("The digit 8 corresponds to the letter " + letter + " on the telephone.");
	}
	    else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z' ) {
			System.out.println("The digit 9 corresponds to the letter " + letter + " on the telephone.");
	}
	     /************
	     * the other option if a non-alphebtical charcter is entered
	     *************/
	    else {
		System.out.println ("There are no matching digits"); 
	}
		
		
	
		
		
		
		
	}
	
}
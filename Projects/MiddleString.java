import java.util.Scanner;
public class MiddleString {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		String word1, word2, word3, middle; 
		
		
		//getting user input
		System.out.println ("Please enter three strings");
		word1 = input.next();
		word2 = input.next();
		word3 = input.next();
		
		
		//comparisons
		if (word1.compareTo(word2) <= 0 && word1.compareTo(word3) <= 0) {
			
			// word1 would be the first word (not the last)
			if (word2. compareTo(word3) <= 0 ) 
				middle = word2;
			else 
				middle = word3; 
		
		}
		
		else if (word2.compareTo(word3) <= 0) {
			
			// word 2 would be the first word (not the last)
			if (word1.compareTo(word3) <= 0) 
				middle = word1; 
			else 
				middle = word3; 
		}
		
		else {
			
			// word 3 would be the first word (not the last) 
			if (word1.compareTo (word2) <= 0) 
				middle = word1; 
			else 
				middle = word2; 
			
		}
		
		System.out.println (middle); 
	
		
		
		
	}
}

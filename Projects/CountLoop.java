import java.util.Scanner;

public class CountLoop{
	public static void main (String []args) {
    Scanner input = new Scanner(System.in);
	// Input from the user
	System.out.print ("Enter a positive integer: ");
	int answer = input.nextInt();
	
	//the while loop
	int number = 1;
	int count = 0;
	while (number <= 100) {
	count = count + number;
    number++;
	}
	int realAnswer = count + answer; 
    System.out.print("The sum is for the first loop while is " + realAnswer);
	
	//the for loop
	int sum = 0;
	for (int i = 1; i <= 100; i++) {
		sum+=i;
	}
	int secAnswer = sum + answer; 
	System.out.println();
	System.out.println("The sum is for the second loop for is " + secAnswer);
	
	//the do and while loop
	int num = 1;
	int data = 0; 
	do {
		data= num + data; 
		num++; 
	} while (num <= 100);
	int thrAnswer = data + answer; 
	System.out.println("The sum is for the third loop do and while is " + thrAnswer);
	
	
	}
}
	

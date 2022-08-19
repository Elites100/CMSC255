import java.util.Scanner;

public class Lab7 {
  
   public static void main(String[] args) {
     // variable declarations for part 1
     String title;
     String firstName;
     String lastName;
     Scanner in = new Scanner(System.in);
     
     // prompt for input for part 1
     System.out.print("Enter a title:");
     title = in.next();
     System.out.print("Enter your first name:");
     firstName = in.next();     
     System.out.print("Enter a your last name:");
     lastName = in.next();
     
     // call the method for part 1
     greeting(title, firstName, lastName);
     
     // variable declarations for part 2
     int number1;
     int number2;
     
     // user prompts for part 2
     System.out.print("Enter first number:");
     number1 = in.nextInt();
     System.out.print("Enter second number:");
     number2 = in.nextInt();
     
     // call the methods max and sumTo inside the println statement
     System.out.println("The largest number is " + max(number1, number2));
     System.out.println("The sum of the numbers is " + sumTo(number1, number2));
 }// end of main method
   
 /******************** greeting method goes here*********************/
  public static void greeting( String n1, String n2, String n3) {

    System.out.println("Dear " + n1 + " "+ n2 + " "+ n3);

  }
 
  
  
  
  /***********************end of method*************************/
  
  /******************** max method goes here
   * @return*********************/
  public static int max(int num1, int num2) {
    int results;
       if (num1 < num2)
      results = num2;
    else
    results = num1;
    return results;
  }
  

  
  
  /***********************end of method*************************/
   
  /******************** sumTo method goes here*********************/
  
  public static int sumTo(int num1, int num2) {

      if (num1 < num2) {
          int temp = num1;
          num1 = num2;
          num2 = temp;
      }
      int changeNum = num1;
      int changeNum2 = num2;
      int sum = 0;
    for(int count = changeNum2; count <= changeNum; count++)
      sum=sum+count;
              return sum;

  }

  
  
  /***********************end of method*************************/
}

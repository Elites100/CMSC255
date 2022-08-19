
public class Expressions 
{
  public static void main(String[] args)
  {
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    
    /**********************************************************
     * 3 and 4 are added with sum 7       
     * 7 is divided by 5 with 1 the result of integer division
     * The value displayed is 1
     ***********************************************************/
    System.out.println("#1 " + ((a + b) / c));   
    
    /**********************************************************
     * Because division has higher precedence, 4 is divided by 5 with 0 the result of integer division       
     * 3 is added to 0 with sum 3
     *  The value displayed is 3
     ***********************************************************/
    System.out.println("#2 " + (a + b / c));       
    
	
	/************************************************************
	* since it is a preincrement, 3 is added by 1 with the value of 4 
	* so the value that would be displayed is 4
	*************************************************************/
    System.out.println("#3 " + (++a));     

	/**************************************
	* since it is a predecrement, 3 is then returned after, but it is minus by 1 if it is by itself (--a;) which would be 2
	* so the value that would be displayed is 3 in the example
	**************************************/
    System.out.println("#4 " + (--a));
	
	
	/**************************************
	* since it is a postincrement, 3 is the orginal since it is post and the next line would increase by 1 (if it is a++; itself then it would be 4)
	* so the value that would be displayed is 3 in the example
	**************************************/
    System.out.println("#5 " + (a++));       
	
	/**************************************
	* since it is a postdecrement, 3 is the orginal value that is return 
	* so the value that would be displayed is 4
	**************************************/ 
    System.out.println("#6 " + (a--));
	
	/**************************************
	* 3 and 1 are added with the sum of 4
	* so the value that would be displayed is 4
	**************************************/ 
    System.out.println("#7 " + (a + 1));    

    /**************************************
	* the remainder/ratio of 17 and 5 would be 3 with remainder of 2
	* so the value that would be displayed is 2 since that is the remainder
	**************************************/
    System.out.println("#8 " + (d % c));       
	
	/**************************************
	* the division of 17 and 5 would be 3 with result of integer division 
	*so the value that would be displayed is 3 
	**************************************/
    System.out.println("#9 " + (d / c));       
	
	/**************************************
	* the remainder/ratio of 17 and 4 would be 4 with the remainder of 1
	* so the value that would be displayed is 1 since that is the remainder
	**************************************/
    System.out.println("#10 " + (d % b));       
	
	/**************************************
	* the division of 17 and 4 would be 4 with the result of integer division 
	* so the value that would be displayed is 4 
	*************************************/
    System.out.println("#11 " + (d / b));      
	/**************************************
	* since division has higher precedence 3 and 17 would be 0 with integer division 
	* from left to right 17 is added into 0 with the sum of 17
	* and 17 is added into 4 with the total sum of 21
	* so the value that would be displayed is 21
	**************************************/
    System.out.println("#12 " + (d + a / d + b));   
    
	/**************************************
	* since parentheses has higher precedences d+a and d+b is added in order
	* from left to right 17 is added with 3 with the sum of 20 
	* 17 is added with 4 to make the sum of 21
	* and then divide by 20 and 21 to make the sum of 0 with the integer division
	* so the value that would be displayed is 0
	**************************************/
    System.out.println("#13 " + ((d + a) / (d + b))); 
	
	/**************************************
	* since 4 is square rooted the sum would be 2
	* the value that would be displayed is 2
	**************************************/
    System.out.println("#14 " + (Math.sqrt(b)));      

    /**************************************
    * this uses the exponent operations as 3 with the power of 4 as the sum is 81
    * the value that would be displayed is 81
    **************************************/	
    System.out.println("#15 " + (Math.pow(a, b)));       
	
	/**************************************
	* this uses the absolute value of -3 into 3 
	* the value that would be dsiplayed is 3
	**************************************/
    System.out.println("#16 " + (Math.abs(-a)));
	
	/**************************************
	* this uses the max method from 3 and 4 into 3,4 
	* this return the max 4 
	* so that value that would be displayed is 4
	**************************************/
    System.out.println("#17 " + (Math.max(a, b)));    
  } 
} 

public class VariableDefinitions {
	public static void main(String[] args) {
	
	/***************************************
	* initial declaration of numPeople variable
	***************************************/
	byte numPeople = 3;
	
	/***************************************
	* initial declaration of priceItem variable
	***************************************/
	double priceItem = 32.23;
	
	/***************************************
	* initial declaration of classNum 
	***************************************/
	short classNum = 207;
	
	/***************************************
	* initial declaration of priceDinner
	**************************************/
	float priceDinner = 30.0F;
	
	//statement to print out name 
	System.out.println (" The numPeople variable has a value of " + numPeople); 
    System.out.println (" The priceItem variable has a value of " + priceItem); 
    System.out.println (" The classNum variable has a value of " + classNum); 
    System.out.println (" The priceDinner variable has a value of " + priceDinner); 
		
	/***************************************
	* modified value of the numPeople variable
	***************************************/
		numPeople=6;
		
    /***************************************
	* modified value of the priceItem variable
	***************************************/
        priceItem=40.34; 

    /***************************************
	* modified value of the classNum variable
	***************************************/
        classNum=250; 

    /***************************************
	* modified value of the priceDinner variable
	***************************************/
		priceDinner=60.0F;
		
	//statement to print out name 
	System.out.println (" The numPeople variable now has a value of " + numPeople); 
    System.out.println (" The priceItem variable now has a value of " + priceItem); 
    System.out.println (" The classNum variable now has a value of " + classNum); 
    System.out.println (" The priceDinner variable now has a value of " + priceDinner); 
		
	
	/************************************** 
	*initial declaration of numPeople constant
	**************************************/
	final int count = 42; 
	
	/************************************** 
	*initial declaration of priceItem constant
	**************************************/
	final double total = 50.25; 
	
	/************************************** 
	*initial declaration of classNum constant
	**************************************/
	final short littleNum = 300; 
	
	/************************************** 
	*initial declaration of priceDinner constant
	**************************************/
	final long reallyBigNumber = 34919445514L; 
	
	
	//changing assignment from constant
	//count=50; 
	
	/**************************************
	* the error are causes from cannot assign a value to final variable count, since it been final 
	**************************************/
		
		
		
	}
}
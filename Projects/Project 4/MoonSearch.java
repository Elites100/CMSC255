/***********************************************************************************************************************************************************************************
* MoonSearch.java
************************************************************************************************************************************************************************************
* project four - moon search
************************************************************************************************************************************************************************************
* Project description 
* exploring the moon of mars and other planet to determine to establish any of the moons
* Kevin Phung
* 10-16-2021
* CMSC-255-004
************************************************************************************************************************************************************************************/

import java.util.Scanner;
public class MoonSearch {
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		/************************************++
		 * Entire array as listed by radii, density, distance, and moon
		 **************************************/
		/***************************************
		 *  the array as radius
		 **************************************/
		double[] radiiArray = { 11.3,6.2,68.9,33.6,71.2,26.8,255.9,47.4 };
		/***************************************
		 *  the array as density
		 ***************************************/
		double[] densityArray = {1.8,1.4,14.2,33.3,16.4,68.1,121.3,38.2};
		/****************************************
		 *  the array as distance
		 ****************************************/
		double[] distanceArray = {3.7, 23.4, 550391.6, 227894.9, 778893.6, 143323.5, 287223.5, 449655.1};
		/****************************************
		 * the array as string of names
		 ****************************************/
		String[] moonArray = {"Phobus","Deimos","Andrasta","Aitne", "Amalthea","Ananke","Aoede","Arche"};

		/*****************************************
		 *  the radius average using method
		 *****************************************/
		calcAvg(radiiArray);
		double radii = calcAvg(radiiArray);
		System.out.printf("The average radius is: %.1f\n", radii);



		/*****************************************
		 *  the density average using method
		 *****************************************/
		calcAvg(densityArray);
		double density = calcAvg(densityArray);
		System.out.printf("The average density is: %.1f\n", density);

		/*****************************************
		 *  the highest radius using the method
		 *****************************************/
		findHighValue(radiiArray);
		double highRadii = findHighValue(radiiArray);
		System.out.printf("The highest radius is: %.1f\n", highRadii);



		/*****************************************
		 * the lowest distance using the method
		 ****************************************/
		findLeastValue(distanceArray);
		double lowDistance = findLeastValue(distanceArray);
		System.out.printf("The lowest distance is: %.1f\n", lowDistance);



		/*****************************************
		 * the highest 2 moons using the methods
		 *****************************************/
		findHighestTwo(moonArray, radiiArray);
		String[] hig = findHighestTwo(moonArray, densityArray);
		/************************************++
		 * The result return the array of names and then print out (largest 2)
		 **************************************/
		System.out.print("The highest two moons for radii are:");
		System.out.println();
		System.out.println("\t" + hig[1]);
		System.out.println("\t" + hig[2]);




		/*****************************************
		 *  the lowest 2 moons using the methods
		 *****************************************/
		findLeastTwo(moonArray,densityArray);
		String[]ans = findLeastTwo(moonArray, densityArray);
		/************************************++
		 * the result return an array of names and print out (smallest 2)
		 **************************************/
		System.out.print("The lowest two moons for density are:");
		System.out.println();
		System.out.println("\t"+ ans[1]);
		System.out.println("\t"+ans[2]);








		/*****************************************
		 *  true and false statment when answering the question
		 *****************************************/
		System.out.print("Enter a moon:");
		System.out.println();
		String answer = input.nextLine();
        findMoon(moonArray,answer);
		boolean results = findMoon(moonArray,answer);
		/************************************++
		 * if the user input true then it would print
		 **************************************/
		if (results){
			System.out.print(answer + " is a moon in the array." );
		}
		/************************************++
		 * if the user input false then it would print
		 **************************************/
		else{
			System.out.print(answer + " is not a moon in the array." );
		}




	}
    /*****************************************
	 *  method for find the averages values
	 *****************************************/
	public static double calcAvg(double[] array) {
		/*************************************
		 *  sum of all the number and divide by the array length to average radii or density
		 **************************************/
		double total = 0;
		double avgTotal =0;
		for (double v : array) {
			total += v;
			avgTotal = total / array.length;
		}
		return avgTotal;
	}

    /*****************************************
	 *  method for finding the highest value
	 ****************************************/
	public static double findHighValue(double[] values){
		/************************************++
		 * calculate the largest value in array and store it
		 **************************************/
		double largest = values[0];
		for (double value : values) {
			if (value > largest)
				largest = value;
		}
		return largest;

	}

	/*****************************************
	 * method for finding the lowest value
	 ******************************************/
	public static double findLeastValue(double[] values){
		/************************************++
		 * calculate smallest array value and store it
		 **************************************/
		double smallest = values[0];
		for (double value : values) {
			if (value < smallest)
				smallest = value;
		}
		return smallest;

	}

	/*****************************************
	 *  method for finding the first and second lowest values and return the name of that moon
	 ******************************************/
	public static String[]findHighestTwo(String[] names, double[] values) {
		/***************************************
		 *  creating a new array to return back to the main method
		 ***************************************/
		String[] hig = new String[8];
		/****************************************
		 * creating to find the first and second the highest values
		 ***************************************/
		double highOne=0;
		double highTwo=0;
		for(double i: values){
			if(highOne < i){
				highTwo=highOne;
				highOne=i;
			}
			else if (highTwo<i){
				highTwo = i;
			}
		}
		/*****************************************
		 * the if else statement for finding the value of that highOne value to names of moon
		 *****************************************/
		if (highOne == values[0]){
			hig[1]= names[0];
		}
		else if (highOne == values[1]){
			hig[1] = names[1];
		}
		else if (highOne == values[2]){
			hig[1] = names[2];
		}
		else if (highOne == values[3]){
			hig[1] = names[3];
		}
		else if (highOne == values[4]){
			hig[1] = names[4];
		}
		else if (highOne == values[5]){
			hig[1] = names[5];
		}
		else if (highOne == values[6]){
			hig[1] = names[6];
		}
		else if (highOne == values[7]){
			hig[1] = names[7];
		}
		else if (highOne == values[8]){
			hig[1] = names[8];
		}
		/*****************************************
		 *  the if else statement for finding the value of that highTwo value to names of moon
		 *****************************************/
		if (highTwo == values[0]){
			hig[2] = names[0];
		}
		else if (highTwo == values[1]){
			hig[2] = names[1];
		}
		else if (highTwo == values[2]){
			hig[2] = names[2];
		}
		else if (highTwo == values[3]){
			hig[2] = names[3];
		}
		else if (highTwo == values[4]){
			hig[2] = names[4];
		}
		else if (highTwo == values[5]) {
			hig[2] = names[5];
		}
		else if (highTwo == values[6]){
			hig[2] = names[6];
		}
		else if (highTwo == values[7]) {
			hig[2] = names[7];
		}
		else if (highTwo == values[8]){
			hig[2] = names[8];

		}
		/**********
		 *  returing the hig to the main method with hig[1] and hig[2]
		 ***********/
		return hig;
	}



    /*****************************************
	 *  method for finding the first and second lowest moon and return the name of that moon
	 ******************************************/
	public static String[] findLeastTwo(String[] names, double[] values) {
		/*****************************************
		 *  creating a new array here to return back to main method
		 *****************************************/
		String[] ans = new String[8];
		/*****************************************
		 * creating to find the first and second the lowest values
		 *****************************************/
		double lowOne= Double.MAX_VALUE;
		double lowTwo= Double.MAX_VALUE;
		for(double i: values){
			if (lowOne > i){
				lowTwo = lowOne;
				lowOne = i;
			}
			else if (lowOne > i && lowTwo < i){
				lowTwo=i;
			}
		}
		/*****************************************
		 *  the if else statement for finding the value of that lowOne value to names of moon
		 *****************************************/
		if (lowOne == values[0]){
			ans[1]= names[0];
		}
		else if (lowOne == values[1]){
			ans[1] = names[1];
		}
		else if (lowOne == values[2]){
			ans[1] = names[2];
		}
		else if (lowOne == values[3]){
			ans[1] = names[3];
		}
		else if (lowOne == values[4]){
			ans[1] = names[4];
		}
		else if (lowOne == values[5]){
			ans[1] = names[5];
		}
		else if (lowOne == values[6]){
			ans[1] = names[6];
		}
		else if (lowOne == values[7]){
			ans[1] = names[7];
		}
		else if (lowOne == values[8]){
			ans[1] = names[8];
		}
		/*****************************************
		 *  the if else statement for finding the value of that lowOne value to names of moon
		 *****************************************/
		if (lowTwo == values[0]){
			ans[2] = names[0];
		}
		else if (lowTwo == values[1]){
			ans[2] = names[1];
		}
		else if (lowTwo == values[2]){
			ans[2] = names[2];
		}
		else if (lowTwo == values[3]){
			ans[2] = names[3];
		}
		else if (lowTwo == values[4]){
			ans[2] = names[4];
		}
		else if (lowTwo == values[5]) {
			ans[2] = names[5];
		}
		else if (lowTwo == values[6]){
			ans[2] = names[6];
		}
		else if (lowTwo == values[7]) {
			ans[2] = names[7];
		}
		else if (lowTwo == values[8]){
			ans[2] = names[8];
			return ans;
		}
		/**********
		 * returning the ans to the main method with ans[1] and ans[2]
		 **********/
		return ans;
	}
	/*****************************************
	 *  method for finding the moon and check if answer is true or false
	 *****************************************/
	public static boolean findMoon(String[] names, String moon){
		boolean results = false;
			for(String element : names){
				if (element.equals(moon)){
					results = true;
					break;
				}
			}

	return results;
	}



}

package Labs.Lab_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *   DaysPerMonth
 *   VCU - Computer Science Department
 *   A program that prompts the user for a month and year (both as integers)
 *   then displays the number of days in that month.
 **/

public class DaysPerMonth {

    public static void main(String[] args){
        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);
        try {
            processFile(inputFile,outputFile);
        }
        catch (FileNotFoundException e) {
          System.out.print("Bad File Name");
        }
       /* catch (NoSuchElementException e){
            System.out.print("Outputs line missing");
        }*/


    }


    public static void processFile(File inputFile, File outputFile) throws FileNotFoundException {
        Scanner in = new Scanner(inputFile);
        PrintWriter writer = new PrintWriter(outputFile);
        // variable declares on month, year, and days
        int Month;
        int Years;
        int days;

        while(in.hasNextLine()) {
            // read a line from the file
            String line = in.nextLine();

            // split the line into an array of Strings
            String[] tokens = line.split(",");
            //both variables month and year
            Month=0;
            Years=0;
            // if there is a number exception
            boolean thrown = false;

            try{
                Month = (Integer.parseInt(tokens[0]));
                Years =(Integer.parseInt(tokens[1]));
            }
            catch (NumberFormatException e){
               System.out.println("Not an integer");
                writer.println("Not an integer");
                // if there is a number exception it is thrown
                thrown = true;
            }

           // if there is a number exception then it does not continue
            if(!thrown) {
                if (Month > 12) {
                    System.out.println("Month must be between 1 and 12");
                    writer.println("Month must be between 1 and 12");
                } else if (Years < 0) {
                    System.out.println("Year cannot be negative");
                    writer.println("Year cannot be negative");
                } else {
                    days = getDays(Month, Years);
                    writer.println("There are " + days + " days in this month.");
                }
            }
        }

        in.close();
        writer.close();
    }



    /**
     * method to determine the days for the given month and year
     **/
    private static int getDays(int mon, int yr) {
        int numDays = 0;

        switch(mon) {
            case 2: // February
                numDays = 28;
                if (yr % 4 == 0) {
                    numDays = 29;
                    if (yr % 100 == 0 && yr % 400 != 0) {
                        numDays = 28;
                    }
                }
                break;

            case 4:   //April
            case 6:   // June
            case 9:   // September
            case 11:  // November
                numDays = 30;
                break;

            default: numDays = 31;  // all the rest
        }
        return numDays;
    }

}

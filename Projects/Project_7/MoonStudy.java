package Projects.Project_7;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/***********************************************************************************************************************************************************************************
 * MoonStudy.java
 ************************************************************************************************************************************************************************************
 * project seven - moon study
 ************************************************************************************************************************************************************************************
 * Project description
 * analysing the data of the moons' radius, distance and density
 * Kevin Phung
 * 11-30-2021
 * CMSC-255-004
 ***********************************************************************************************************************************************************************************/

public class MoonStudy {
    public static void main (String[] args) {
        /* Creating the input and output File */
        File inputFile = new File("MoonGoodData.txt");
        File outputFile = new File("SummaryMoonData.txt");

        /* creating the Arraylist of String of all moons for openFile() */
        ArrayList<String> transfer = null;

        /* try and catch block for input files that does not open and has error */
        try {
            /* method of storing the data of txt file in inputFile as in arrayList */
            openFile(inputFile);
            transfer = openFile(inputFile);
        } catch (FileNotFoundException e) {
            System.out.print("Incorrect file input name");
        }

        /* moon array would be stored here after createObjects (Arraylist<Moon>) */
        ArrayList<Moon> moonData = createObjects(transfer);

        /* the method for finding the mean of radius/distance/density from moonData (double) */
        findMean(moonData, "radius");
        double avgMean = findMean(moonData, "radius");

        /* the method of the highest moon of radius/distance/density from moonData (double) */
        findHighValue(moonData, "density");
        double highValue = findHighValue(moonData, "density");

        /* method of the mean of the moon of radius/distance/density from moonData (Moon) */
        findMeanMoon(moonData, "radius", avgMean);
        Moon meanMoon = findMeanMoon(moonData, "radius", avgMean);

        /* method of the moon below the mean of radius/distance/density from moonData (arraylist) */
        findLowestMoons(moonData, avgMean, "radius");
        ArrayList<Moon> leastMoons = findLowestMoons(moonData, avgMean, "radius");






       /* creating the PrintWriter */
        PrintWriter out = null;

        /* printing the results/outputs on the outputFile */
        /* try and catch block for output files that does not open and has error */
        try {
            /* creating the new PrintWriter outputFile */
            out = new PrintWriter(outputFile);
            /* outputToFiles method would print to the output txt file and close */
            outputToFile("The mean of radii is", avgMean, out);
            outputToFile("The highest density value is", highValue, out);
            outputToFile("The moon closest to mean is", meanMoon, out);
            outputToFile("The moons below the mean value for radii are: ", leastMoons, out);
            out.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Incorrect Output File");
        }


    }




    /* creating the method for opening the input files */
    public static ArrayList<String> openFile(File inputFile) throws FileNotFoundException {
        /* creating a new arrayList of strings to be stored */
        ArrayList<String> list = new ArrayList<String>();
        /* Scan the inputFile data */
        Scanner in = new Scanner(inputFile);
        /* using a while loop would go through all data and store it in a arrayList */
        while(in.hasNextLine()) {
            list.add(in.nextLine());
        }
        /* return the arrayList containing the data of the txt inputfile */
        return list;
    }

    /* method for creating the object and setting up position of the data in txt file */
    public static ArrayList<Moon> createObjects(ArrayList<String> lines) {
        /* creating the arrayList that will be stored and return */
        ArrayList<Moon> samples = new ArrayList<>();

        /* looping through all the info from the arraylist of string (the open input files) */
        for (int i = 0; i < lines.size(); i++){
            /* splitting the values using the array by a while loop for the arrayList */
            String[] moonInfo = lines.get(i).split("\t");

           /* creating the moon object and later setting the values */
            Moon temp = new Moon();

            /* the setting of the values on the moon object -->  name, radius, density, distance */

            /* setting the first position as the name */
            temp.setName(moonInfo[0]);

            /* try and catch block for the values in txt file and an exception would cause a setting to 0 */
            try{
                /* setting the second position as the radius */
                temp.setRadius(Double.parseDouble(moonInfo[1]));
            }
            catch(NumberFormatException ex) {
               /*  all values in the radius position not a number set to 0 */
                temp.setRadius(0);
            }
            try{
               /*  setting the third position as the density */
                temp.setDensity(Double.parseDouble(moonInfo[2]));
            }
            catch(NumberFormatException ex) {
               /*  all values in the density position not a number set to 0 */
                temp.setDensity(0);
            }
            try{
                /* setting the fourth position as the distance */
                temp.setDistance(Double.parseDouble(moonInfo[3]));
            }
            catch(NumberFormatException ex) {
               /*  all values in the density position not a number set to 0 */
                temp.setDistance(0);
            }

            /* if any of the values for the Moon is negative then the value is defaulted to 0 */

            if(temp.getRadius() < 0 ){
                temp.setRadius(0);
            }

            if(temp.getDensity() < 0 ){
                temp.setRadius(0);
            }

            if(temp.getDistance() < 0 ){
                temp.setRadius(0);
            }

           /* adding the moon temp object to the arrayList */
            samples.add(temp);
        }
        /* returning the Moon arrayList with the data in the correct position */
        return samples;
    }

    /* a method for finding the mean of all the moons' radius, distance, or density */
    public static double findMean(ArrayList<Moon> moons, String attribute){
        /* variable for finding the total of the moons attribute */
        double avg = 0;
        /* variable for finding the number of moons */
        int count = 0;

        /* if and else statement for finding the exact attribute (radius, density, or distance) */
        if(attribute.equals("radius")){
            /* looping through the ArrayList of moons */
            for(int i = 0; i < moons.size(); i++){
                /* adding the radius of all moons into avg */
                avg += moons.get(i).getRadius();
                /* increase the count (number of moons looped) */
                count++;
            }
            /* calculating by total / number of moons and store into avg */
            avg = avg / count;
        }

        /* if and else statement for finding the exact attribute (radius, density, or distance) */
        else if(attribute.equals("density")){
            /* looping through the ArrayList of moons */
            for(int i = 0; i < moons.size(); i++){
                /* adding the density of all moons into avg */
                avg += moons.get(i).getDensity();
                /* increase the count (number of moons looped) */
                count++;
            }
            /* calculating by total / number of moons and store into avg */
            avg = avg / count;
        }

        /* if and else statement for finding the exact attribute (radius, density, or distance) */
        else if (attribute.equals("distance")){
            /* looping through the ArrayList of moons */
            for(int i = 0; i < moons.size(); i++){
                /* adding the radius of all moons into avg */
                avg += moons.get(i).getRadius();
                /* increase the count (number of moons looped) */
                count++;
            }
            /* calculating by total / number of moons and store into avg */
            avg = avg / count;
        }
        /* returning the mean of an attribute back to the main */
        return avg;
    }

    /* a method for finding the highest value of the moons' radius, distance, or density */
    public static double findHighValue(ArrayList<Moon> moons, String attribute){
        /* variable for the highest value */
        double highValue = 0;

        /* if and else statement for finding the exact attribute (radius, density, or distance) */
        if (attribute.equals("radius")) {
            /* for loop to all the moon and then the moon radius */
            for (Moon c : moons) {
                /* if statement is the current radius > initial and declare as highvalue */
                if (c.getRadius() > highValue){
                    highValue = c.getRadius();
                }
            }

        }

        /* if and else statement for finding the exact attribute (radius, density, or distance) */
        else if (attribute.equals("density")) {
            /* for loop to all the moon and then the moon density */
            for (Moon c : moons) {
                /* if statement is the current density > initial and declare as highvalue */
                if (c.getDensity() > highValue) {
                    highValue = c.getDensity();
                }
            }
        }

       /*  if and else statement for finding the exact attribute (radius, density, or distance) */
        else if (attribute.equals("distance")) {
            /* for loop to all the moon and then the moon distance */
            for (Moon c : moons) {
                /* if statement is the current distance > initial and declare as highvalue */
                if (c.getDistance() > highValue){
                    highValue = c.getDistance();
                }
            }
        }

        /* returning the high value of an attribute to the main */
        return highValue;
    }

    /* method for finding value with the closest mean value of radius, density, or distance */
    public static Moon findMeanMoon (ArrayList<Moon> moons, String attribute, double meanValue){

         /* the variable that would store the value of mean, and position */
        double mean = meanValue;
        int position = 0;


        /*  if and else statement for finding the exact attribute (radius, density, or distance) */
        if (attribute.equals("radius")){
            // initial radius of the first moon with - mean
            double smallestRadius = Math.abs(moons.get(0).getRadius() - mean);

            // looping through the radius of moons
            for(int i =0; i < moons.size(); i++){
                // all moon's radius would be - mean to result in closet
                double currentRadius = Math.abs(moons.get(i).getRadius() - mean);
                if (currentRadius < smallestRadius){
                    smallestRadius = currentRadius;
                    position = i;
                }
            }
        }

        /*  if and else statement for finding the exact attribute (radius, density, or distance) */
        else if(attribute.equals("density")){
            double smallestDensity = Math.abs(moons.get(0).getDensity() - mean);
            for(int i = 0; i < moons.size(); i++){
                /* all moon's density would be - mean to result in closet */
                double currentDensity = Math.abs(moons.get(i).getDensity() - mean);
                /* determine the closets and store that data each time */
                if (currentDensity < smallestDensity){
                    smallestDensity = currentDensity;
                    position = i;
                }

            }

        }

        /* if and else statement for finding the exact attribute (radius, density, or distance) */
        else if(attribute.equals("distance")){
            double smallestDistance = Math.abs(moons.get(0).getDistance() - mean);
            for(int i = 0; i < moons.size(); i++){
                /* all moon's distance would be - mean to result in closet */
                double currentDistance = Math.abs(moons.get(i).getDistance() - mean);
                /* determine the closets and store that data each time */
                if (currentDistance < smallestDistance){
                    smallestDistance = currentDistance;
                    position = i;
                }

            }

        }
        /* returning the object of moon that has the closest value */
        return moons.get(position);
    }

    /* a method for finding all the Lowest moons of the moons' radius, distance, or density */
    public static ArrayList<Moon> findLowestMoons (ArrayList<Moon> moons, double values, String attribute){
      /*creating a ArrayList for all moon lowest in the attribute*/
        ArrayList<Moon> leastMoons = new ArrayList<>();

        /* if and else statement for finding the exact attribute (radius, density, or distance) */
        if (attribute.equals("radius")){
            /* looping through the arrayList of moons */
            for(int i = 0 ; i <  moons.size() ; i++ ){
                /* adding all moons lower than the radius into the arraylist */
                if (moons.get(i).getRadius() < values){
                    leastMoons.add(moons.get(i));
                }
            }
        }

        /* if and else statement for finding the exact attribute (radius, density, or distance) */
        else if (attribute.equals("density")){
            /* looping through the arrayList of moons */
            for(int i = 0 ; i <  moons.size() ; i++ ){
                /* adding all moons lower than the density into the arraylist */
                if (moons.get(i).getDensity() < values){
                    leastMoons.add(moons.get(i));
                }
            }
        }

        /* if and else statement for finding the exact attribute (radius, density, or distance) */
        else if (attribute.equals("distance")){
            /* looping through the arrayList of moons */
            for(int i = 0 ; i <  moons.size() ; i++ ){
                /* adding all moons lower than the distance into the arraylist */
                if (moons.get(i).getDistance() < values){
                    leastMoons.add(moons.get(i));
                }
            }
        }
       /* returning the ArrayList of lowestMoon back to the main */
        return leastMoons;
    }


    /* method for outputting double to the output into the file (print the output into file) */
    public static void outputToFile(String outputMessage, double value, PrintWriter out) throws FileNotFoundException{
        /* if and else statement for the mean of the attribute and the highest value */
        if (outputMessage.equals("The mean of radii is")) {
            /* printing the message */
            out.print(outputMessage);
            /* printing the results with nextline */
            out.printf(String.valueOf(value));
            out.println("\n");

        }
        else {
            /* printing the message */
            out.print(outputMessage);
            /* printing the results with nextline */
            out.printf(String.valueOf(value));
            out.println("\n");
        }
    }

    /* method for outputting arrayList of moons to the output into the file (print the output into file) */
    public static void outputToFile(String outputMessage,ArrayList<Moon> moons,PrintWriter out)throws FileNotFoundException{
         /* printing the message */
        out.print(outputMessage);

        /* looping through the arrayList of moons and printing into the file */
        for(int i = 0; i < moons.size(); i++){
            out.print(moons.get(i) + " ");

        }
    }

    /* method for outputting the object of moons to the output into the file (print the output into file) */
    public static void outputToFile(String outputMessage,Moon moons,PrintWriter out) throws FileNotFoundException{
        /* printing the message */
        out.print(outputMessage);
        /* printing the results with nextline */
        out.print(moons);
        out.println("\n");
    }


}


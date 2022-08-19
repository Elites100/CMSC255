package Labs.Lab_13;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Lab13 {
    public static void main (String[] args) {
        //file for SoccerStats.txt here (place holders)
        File inputFile = new File(args[0]);
        //File for the summary.txt here (place holders)
        File outputFile = new File(args[1]);

        //Try and catch block if the file don't open or
        try {
            processFile(inputFile, outputFile);
        } catch (FileNotFoundException e) {
            System.out.println("input does not exist");
        }
    }

    public static void processFile(File inputFile, File
            outputFile)throws FileNotFoundException{
        // using the object team.java
        Team team;
        // initialize minTeam, maxTeam to null as in strings
        Team minTeam = null, maxTeam = null;
        // initialize total number of shots and total number of teams to 0
        double totalShots = 0;
        int numTeams = 0;
        // declaring the variable Line for line in file later
        String line;

        // open the input and output file
        Scanner in = new Scanner(inputFile);
        PrintWriter writer = new PrintWriter(outputFile);

        // loop to read next input
        while(in.hasNextLine()) {
            // read a line from the file
            line = in.nextLine();
            // split the line into an array of Strings
            String[] tokens = line.split(",");

            // create a Team object from the file listed (from left is name, numGoals, and numShots)
            team = new Team(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2]));

            // update minTeam if read team is the minimum goal team or this is the first team read
            if (minTeam == null || minTeam.getNumGoals() > team.getNumGoals())
                minTeam = team;

            // update maxTeam if read team is the maximum goal team or this is the first team read
            if (maxTeam == null || maxTeam.getNumGoals() < team.getNumGoals())
                maxTeam = team;


            // add total shots by this team to totalShots (later for average)
            totalShots += team.getNumShots();


            // increment number of teams for the next team in the text file
            ++numTeams;
        }
        // close the input file
        in.close();


        // output the team name and goals for maximum and minimum goal team
        writer.println("Maximum goals Scored: "+maxTeam.getName()+" "+maxTeam.getNumGoals());
        writer.println("Minimum goals Scored: "+minTeam.getName()+" "+minTeam.getNumGoals());
        // calculate and output the average shots per game
        writer.printf("Average shots per game: %.3f",(totalShots/numTeams));

        // close the output file
        writer.close();
    }




}








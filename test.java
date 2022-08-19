import java.util.Arrays;

public class test {
    public static void main(String[] args) {


        double[][] score = {
                {8.3, 4.5, 6.7, 2.3, 12.5, 4.5},
                {3.9, 1.8, 34.7, 23.5, 1.2, 14.3},
                {6.7, 7.4, 1.5, 18.4, 7.2, 23.7},
                {23.4, 5.6, 2.9, 18.5, 39.5, 18.2},
                {15.4, 5.3, 27.4, 9.8, 3.8, 27.4}};

        double[][] losts = {
                {8.3, 4.5, 6.7, 2.3, 12.5, 4.5},
                {3.9, 1.8, 34.7, 23.5, 1.2, 14.3},
                {6.7, 7.4, 1.5, 18.4, 7.2, 1},
                {23.4, 5.6, 2.9, 18.5, 39.5, 100},
                {15.4, 5.3, 27.4, 9.8, 3.8, 100}};

        double[][] samples = {
                {19.3, 16.75, 33.6, 45.9, 55.3, 85.4},   // Sample 1
                {.75, 1, .5, .8, .5, .6},               // Sample 2
                {75.6, 45.5, 32, 83.3, 93.4, 54.2},    // Sample 3
        };

        /*double[][] samples = {
                {19.3, 16.75, 33.6, 45.9, 55.3, 85.4},   // Sample 1
                {.75, 1, .5, .8, .5, .6},               // Sample 2
                {75.6, 45.5, 32, 83.3, 93.4, 54.2},    // Sample 3
        };*/


        //samples = score;
        double sum = 0;
        double[][] data = samples;
        // array that has the same length of sample to send back to main method
        int[] answers = new int[data.length-1];
        // storing the sum of the total
        // running through the columns to calculate the formula
        for (int i = 0 ; i < data.length; i++) {
            sum = 0;
            sum = ((8 * data[i][0]) + (2 * data[i][1]) + data[i][2] + (4 * data[i][3]) + data[i][4] + (5 * data[i][5]));

            if(sum >= 350){
                answers[1] = (i+1);
            }
            else if (sum >= 350){
                answers[2] = (i+1);
            }

            //answers[i] = answers[0] + answers[1];




        }
        System.out.println("the rows are highest is " + answers[1] + answers[2]);

        }


        }





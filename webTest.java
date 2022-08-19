import java.util.Arrays;

public class webTest {
    public static void main(String[] args) {


            double[][] score = {
                    {8.3 , 4.5 , 6.7 , 2.3 , 12.5 , 4.5},
                    {3.9, 1.8, 34.7, 23.5, 1.2, 14.3},
                    {6.7, 7.4, 1.5, 18.4, 7.2, 23.7},
                    {23.4, 5.6, 2.9, 18.5, 39.5, 18.2},
                    {15.4, 5.3, 27.4, 9.8, 3.8, 27.4} };
        for (int i = 0; i < 1 ; i++) { // i should be your column
            double max = score[0][i];// assign 1st value of the column as max
            for (int j = 0; j < score.length; j++){ // j is your row
                if (score[j][i] > max){ // check the column elements instead of row elements
                    max = score[j][i];// get the column values
                }
            }
            System.out.println( max + "      ");
        }











    }
}
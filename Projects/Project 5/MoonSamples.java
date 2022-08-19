import java.util.Arrays;
import java.util.Scanner;

/***********************************************************************************************************************************************************************************
 * MoonSearch.java
 ************************************************************************************************************************************************************************************
 * project five - moon sample
 ************************************************************************************************************************************************************************************
 * Project description
 * analysing the soils of Mars
 * Kevin Phung
 * 10-16-2021
 * CMSC-255-004
 ***********************************************************************************************************************************************************************************/
public class MoonSamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* for string element */
        String element = "carbon-dioxide,magnesium,sodium,potassium,chloride,water";
        /* for samples array of data */
        String samples = "8.3,4.5,6.7,2.3,12.5,4.5<>3.9,1.8,34.7,23.5,1.2,14.3<>6.7,7.4,1.5,18.4,7.2,23.7<>23.4,5.6,2.9,18.5,39.5,18.2<>15.4,5.3,27.4,9.8,3.8,27.4";
        // testing 2d arrays
        /*double[][] sample = {

                {8.3, 4.5, 6.7, 2.3, 12.5, 4.5},
                {3.9, 1.8, 34.7, 23.5, 1.2, 14.3},
                {6.7, 7.4, 1.5, 18.4, 7.2, 23.7},
                {23.4, 5.6, 2.9, 18.5, 39.5, 18.2},
                {15.4, 5.3, 27.4, 9.8, 3.8, 27.4}
        };*/

        /* obtaining the element */
        getElements(element);
        String[] arrayElement = getElements(element);
        System.out.println(Arrays.toString(arrayElement));

        /* obtaining the double of samples data */
        getSamples(samples);
        double[][] arraySample = getSamples(samples);
        System.out.print(Arrays.deepToString(arraySample));
        System.out.println();

        /* obtaining the sample array of more than 350 */
        searchForLife(arraySample);
        int[] answer = searchForLife(arraySample);
        /* checking for if the 2 samples becomes 0 is removed */
        if (answer[2] == 0){
            System.out.print("The sample that contains life are: " + answer[1]);
        }
        /* checking for if the 2 samples has a number sample is added */
        else
            System.out.print("The sample that contains life are: " + answer[1] +"," + answer[2]);
        System.out.println();


        /* obtaining the highest sample number and returning the element */
        searchHighestElements(arraySample,arrayElement,1);
        String newElement = searchHighestElements(arraySample,arrayElement,1);
        System.out.print("The highest elements for sample 1 are " + newElement);
        System.out.println();

        /* obtaining the highest sample of an element and returning the sample number */
        searchHighestSample(arraySample,arrayElement,"water");
        int sampleNum = searchHighestSample(arraySample,arrayElement,"water");
        System.out.print("The sample with the highest value of the element water is " + (sampleNum));
        System.out.println();

    }



    /* obtaining the array of string and splicing it and returning to main method */
    public static String[] getElements(String inputElementString) {

        String element = inputElementString;

        String[] elementArray = new String[]{element};
        /* splitting of the "," with spaces */
        String[] newElement = element.split(",");


        return newElement;
    }

    /* getting the string of samples and transferring it to a double and returning to main method */
    public static double[][] getSamples(String inputSamplesString) {
        String samples = inputSamplesString;
        /* the splitting of columns in the data */
        String[] newSamples = samples.split("<>");
        /* creating the new array for those data */
        double[][] s1 = new double[newSamples.length][6];

        /* going to set all numbers that were split */
        for (int i = 0; i < newSamples.length; i++) {
            /* for removing of white spaces */
            newSamples[i] = newSamples[i].trim();
            /* for splitting the comma in all numbers by rows */
            String[] singleDouble = newSamples[i].split(",");
            /* assigning the numbers and converting it to a double */
            for (int j = 0; j < singleDouble.length; j++) {
                s1[i][j] = Double.parseDouble(singleDouble[j]);
            }
        }
        return s1;
    }

    /* finding the samples number that has more than 350 using the formula and returning that number */
    public static int[] searchForLife(double[][] samples) {
        /* renaming the samples to data */
        double[][] data = samples;
        /* array that has the decreased length of sample to send back to main method */
        int[] answers = new int[data.length-1];
        /* storing the sum of the total */
        double sum = 0;
        /* running through the columns to calculate the formula */
        for (int i = 0; i < data.length; i++) {
            sum = 0;
            sum = ((8 * data[i][0]) + (2 * data[i][1]) + data[i][2] + (4 * data[i][3]) + data[i][4] + (5 * data[i][5]));

            /* finding which values are larger than 350 */
                if(sum >= 350){
                    answers[1] = (i+1);
                }
                else if (sum>= 350){
                    answers[2] = (i+1);
                }

        }

        return answers;
    }

    // finding the highest samples and returning the string (name of element in that row)
    public static String searchHighestElements(double[][] samples, String[] elements, int sampleNum) {
        /* correction of rows for correct row */
        int num = (sampleNum - 1);
        /* both element would be stored here */
        String elementOne = null;
        String elementTwo = null;



        /* the switching of sample to max and the 2nd max then storing it (go through the 2d array) */
        for (int i = num; i < num + 1; i++) {
            double maxNumber = samples[i][0];
            double maxNumber2 = samples[i][0];
            for (int j = 0; j < samples[i].length; j++) {
                if (maxNumber < samples[i][j]) {
                    maxNumber2=maxNumber;
                    maxNumber = samples[i][j];
                } else if (maxNumber2 < samples[i][j]) {
                    maxNumber2 = samples[i][j];
                }

            }
            /* finding which first max number is in which element */
            if (maxNumber == samples[num][0]) {
                elementOne = elements[0];
            } else if (maxNumber == samples[num][1]) {
                elementOne = elements[1];
            } else if (maxNumber == samples[num][2]) {
                elementOne = elements[2];
            } else if (maxNumber == samples[num][3]) {
                elementOne = elements[3];
            } else if (maxNumber == samples[num][4]) {
                elementOne = elements[4];
            } else if (maxNumber == samples[num][5]) {
                elementOne = elements[5];
            }
            /* end of the maxNumber and continuing on the 2nd largest number */
            if (maxNumber2 == samples[num][0]) {
                elementTwo = elements[0];
            } else if (maxNumber2 == samples[num][1]) {
                elementTwo = elements[1];
            } else if (maxNumber2 == samples[num][2]) {
                elementTwo = elements[2];
            } else if (maxNumber2 == samples[num][3]) {
                elementTwo = elements[3];
            } else if (maxNumber2 == samples[num][4]) {
                elementTwo = elements[4];
            } else if (maxNumber2 == samples[num][5]) {
                elementTwo = elements[5];
            }
        }
        return (elementOne + " and " + elementTwo);


    }

     /* finding the highest sample that the sample's data are in */
    public static int searchHighestSample(double[][] samples, String[] elements, String element) {
        /* storing the rows or j the highest samples are in */
        int maxRow = 0;


        /* finding the element of only water columns */
        if (elements[5].equals(element) ) {

            for (int i = 5;i < samples[0].length; i++) {
                double max = samples[0][i];
                maxRow = 0;
                for (int j = 0; j < samples.length; j++) {
                    if (samples[j][i] > max) {
                        max = samples[j][i];
                        if (samples[j][i] == max) {
                            maxRow = (j);
                            break;

                        }
                    }
                }


            }

        }
        /* finding the element of only carbon-dioxide columns */
        else if (elements[0].equals(element)){
            for (int i = 0;i < samples[0].length - 5; i++) {
                double max = samples[0][i];
                 maxRow = 0;
                for (int j = 0; j < samples.length; j++) {
                    if (samples[j][i] > max) {
                        max = samples[j][i];
                        if (samples[j][i] == max) {
                            maxRow = (j);
                            break;

                        }
                    }
                }


            }

        }
        /* finding the element of only magnesium columns */
        else if (elements[1].equals(element)) {
            for (int i = 1;i < samples[0].length - 4; i++) {
                double max = samples[0][i];
                maxRow = 0;
                for (int j = 0; j < samples.length; j++) {
                    if (samples[j][i] > max) {
                        max = samples[j][i];
                        if (samples[j][i] == max) {
                            maxRow = (j);
                            break;

                        }
                    }
                }


            }

        }
        /* finding the element of only sodium columns */
        else if (elements[2].equals(element)) {
            for (int i = 2;i < samples[0].length - 3; i++) {
                double max = samples[0][i];
                maxRow = 0;
                for (int j = 0; j < samples.length; j++) {
                    if (samples[j][i] > max) {
                        max = samples[j][i];
                        if (samples[j][i] == max) {
                            maxRow = (j);

                            break;
                        }
                    }
                }

            }

        }
        /* finding the element of only potassium columns */
        else if (elements[3].equals(element)) {
            for (int i = 3 ;i < samples[0].length - 2; i++) {
                double max = samples[0][i];
                maxRow = 0;
                for (int j = 0; j < samples.length; j++) {
                    if (samples[j][i] > max) {
                        max = samples[j][i];
                        if (samples[j][i] == max) {
                            maxRow = (j);
                            break;

                        }
                    }
                }

            }

        }
        /* finding the element of only chloride columns */
        else if (elements[4].equals(element)) {
            for (int i = 4;i < samples[0].length -1; i++) {
                double max = samples[0][i];
                maxRow = 0;
                for (int j = 0; j < samples.length; j++) {
                    if (samples[j][i] > max) {
                        max = samples[j][i];
                        if (samples[j][i] == max) {
                            maxRow = (j);
                            break;

                        }
                    }
                }


            }

        }
        /* returning maxRow with a increase of one */
        return (maxRow + 1);
    }


}








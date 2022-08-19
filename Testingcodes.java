
public class Testingcodes {
    public static void main(String[] args) {
        String purchaser = "Jeffery";
        int lotNumber = 27;
        double squareFootage = 144.448;
        String bedRooms = "ONE_BED";
        String baths = "ONE_BATHS";
        String colors = "WHiTE";

        String i =String.format("\t\n%s \t\n%d \n\t%.2f \n\t%s \n\t%s \n\t%s", purchaser, lotNumber, squareFootage, bedRooms, baths, colors );
        String r = String.format("\n\t%s \n\t%d \n\t%.2f \n\t%s \n\t%s \n\t%s", purchaser, lotNumber, squareFootage, bedRooms, baths, colors );

        System.out.print (r);




    }


}



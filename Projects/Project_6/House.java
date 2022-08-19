package Projects.Project_6;

public class House {
    /** Instance Variable purchaser of type string */
    private String purchaser;
    /** Instance Variable lotNumber of type int */
    private int lotNumber;
    /** Instance Variable squareFootage of type double */
    private double squareFootage;
    /** Instance Variable bedrooms of type string (Enums) */
    private Bedrooms bedrooms;
    /** Instance Variable baths of type string (Enums) */
    private Baths baths;
    /** Instance Variable colors of type string (Enums) */
    private Colors colors;


    /** Default constructor for House calling the Parameterized constructor */
    public House(){
        this.purchaser = null;
        this.lotNumber = 1;
        this.squareFootage = 500.00;
        this.bedrooms = Bedrooms.ONE_BEDROOM;
        this.baths = Baths.ONE;
        this.colors = Colors.WHITE;
    }

    /** Parameterized constructor for House passing in the purchaser,
     * a lotNumber, the squareFootage, the bedrooms, the baths, and the colors */
    public House(String anPurchaser, int anlotNumber, double ansquareFootage, Bedrooms anbedrooms, Baths anbaths, Colors ancolors) {
        this.purchaser = anPurchaser;
        this.lotNumber = anlotNumber;
        this.squareFootage = ansquareFootage;
        this.bedrooms = anbedrooms;
        this.baths = anbaths;
        this.colors = ancolors;
    }

    /** Method setPurchaser that assigns a new value to the purchaser of the House */
    public void setPurchaser(String thePurchser){
        this.purchaser = thePurchser;
    }

    /** Method setLotNumber that assigns a new value to the lotNumber of the House */
    public void setLotNumber (int theLotNumber) {
        this.lotNumber = theLotNumber;
    }

    /** Method setSquareFottage that assigns a new value to the squareFootage of the development */
    public void setSquareFootage (double theSquareFootage) {
        this.squareFootage = theSquareFootage;
    }

    /** Method setBedrooms that assigns a new value to the bedrooms of the development */
    public void setBedrooms(Bedrooms theBedroom) {
        this.bedrooms = theBedroom;
    }

    /** Method setBaths that assigns a new value to the baths of the development */
    public void setBaths(Baths theBath) {
        this.baths = theBath;
    }

    /** Method setColors that assigns a new value to the color of the development */
    public void setColors(Colors theColor) {
        this.colors = theColor;
    }

    /** Method getPurchaser that returns the Purchaser of the House */
    public String getPurchaser() {
        return purchaser;
    }

    /** Method getLotNumber that returns the lotNumber of the House */
    public int getLotNumber() {
        return lotNumber;
    }

    /** Method getSquareFootage that returns the squareFootage of the House */
    public double getSquareFootage() {
        return squareFootage;
    }

    /** Method getBaths that returns the baths of the House */
    public Baths getBaths() {
        return baths;
    }

    /** Method getBedrooms that returns the bedrooms of the House */
    public Bedrooms getBedrooms() {
        return bedrooms;
    }

    /** Method getColors that returns the colors of the House */
    public Colors getColors() {
        return colors;
    }


    @Override
    /** Method toString that returns a String output for the House */
    public String toString() {
     return String.format("\n\t%s\n\t%d\n\t%.2f\n\t%s\n\t%s\n\t%s%n",purchaser,lotNumber,squareFootage,bedrooms,baths,colors);
    }
}

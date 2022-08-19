package Labs.Lab_12;
// fourth class created that goes to IDcard
public class DriversLicense extends IDCard{
    // the variables with the enums
    private int expirationYear;
    private Month expirationMonth;

    // the default constructor calls in super class default ("Jane smith" and idnumber of 0)
    public DriversLicense() {
    super();
    this.expirationYear = 1969;
    this.expirationMonth = Month.JANUARY;
}
    // the argument constructor or parameter
    public DriversLicense(String aName, int aidNumber, int aexpirationYear, Month aexpirationMonth){
    super(aName, aidNumber);
    this.expirationYear = aexpirationYear;
    this.expirationMonth = aexpirationMonth;
}
    // the toString method and concatenation with the IDcard.java toString --> Card.java
    public String toString() {
        String concat = super.toString() + " Expiration Month & Year: ";
        return concat + expirationMonth + " " + expirationYear;
        //return super.toString() + " Expiration Month & Year: " + expirationMonth + " " + expirationYear;
    }

}

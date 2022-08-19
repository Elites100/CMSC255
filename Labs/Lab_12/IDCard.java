package Labs.Lab_12;
//third class created onto here
public class IDCard extends Card {
   // the variable
    private int idNumber;

    // the default constructor
    public IDCard(){
    super("Jane Smith");
    this.idNumber = 0;
}
    // the argument constructor or parameter
    public IDCard(String anName, int anidNumber){
    super(anName);
    this.idNumber=anidNumber;
}
    // the toString method that have the toString for Card.java (add on)
    public String toString() {
        return super.toString() + " ID Number: " + idNumber;
    }
}

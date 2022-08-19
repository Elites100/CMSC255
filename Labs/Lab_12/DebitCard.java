package Labs.Lab_12;
//second class created onto here
//class of DebitCard that extends to card.java
public class DebitCard extends Card {
    // the variables
    private int cardNumber;
    private int pin;

    // the default constructor with the superclass listed in Jane Doe
    public DebitCard(){
    super("Jane Doe");
    this.cardNumber = 00000000;
    this.pin = 0;
}
    // the parameters or argument constructor
    public DebitCard(String aname, int acardNumber, int apin){
    super(aname);
    this.cardNumber=acardNumber;
    this.pin=apin;
}

    // the toString method for debit cards with the previous class toString
    public String toString() {
        return super.toString() + " Card Number: " + cardNumber;
    }
}

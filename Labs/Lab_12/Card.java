package Labs.Lab_12;

// first class created start here
public class Card {
    //the variable
    private String name;

    // the default constructor
    public Card() {
        this.name = "";
    }
    // the argument constructor
    public Card(String name) {
        this.name = name;
    }
    // the toString for name of card holder
    public String toString() {
        return "Card Holder: " + name;
    }

}

package Projects.Project_6;
import java.util.ArrayList;



public class Development {
    /** Instance Variable name of type string */
    private String name;
    /** Instance Variable location of type string */
    private String location;
    /** Instance Variable yearEst of type int */
    private int yearEst;
    /** Instance Variable numLots of type int */
    private int numLots;
    /** Instance Variable houses of type ArrayList */
    private ArrayList <House> houses;

    /** Default constructor for development calling the Parameterized constructor */
    public Development() {
        this.name = null;
        this.location = null;
        this.yearEst = 0;
        this.numLots = 0;
        this.houses = new ArrayList<>();
    }

    /** Parameterized constructor for development passing in the name,
     * a location, the yearEst, and the numLots */
    public Development(String name, String location, int yearEst, int numLots){
        this.name = name;
        this.location = location;
        this.yearEst = yearEst;
        this.numLots = numLots;
        this.houses = new ArrayList<>();
    }

    /** Method setName that assigns a new value to the name of the development */
    public void setName(String name) {
        this.name = name;
    }

    /** Method setLocation that assigns a new value to the location of the development */
    public void setLocation(String location) {
        this.location = location;
    }

    /** Method setYearEst that assigns a new value to the yearEst of the development */
    public void setYearEst(int yearEst) {
        this.yearEst = yearEst;
    }

    /** Method setNumLots that assigns a new value to the numLots of the development */
    public void setNumLots(int numLots) {
        this.numLots = numLots;
    }

    /** Method getName that returns the Name of the development */
    public String getName() {
        return name;
    }

    /** Method getLocation that returns the location of the development */
    public String getLocation() {
        return location;
    }
    /** Method getYearEst that returns the yearEst of the development */
    public int getYearEst() {
        return yearEst;
    }
    /** Method getNumLots that returns numLots of the development */
    public int getNumLots() {
        return numLots;
    }

    /** Method addHouse that places a house object into the array list of
     * house for the development */
   public void addHouse(House aHouse){
       this.houses.add(aHouse);

   }
    /** Method getNumHouses that returns the number of houses in the development */
   public int getNumHouses(){
        return houses.size();
   }

    /** Method getHouses that returns the array list of houses at the development */
   public ArrayList<House> getHouses(){
        return houses;
   }



    @Override
    /** Method toString that returns a String output for the development */
    public String toString(){
        String results = name + "\n" + location + "\n" + yearEst + "\n" + numLots + "\n";
        results += "Houses:\n";
        for(House house : houses)
            results += house.toString();
        return results;
}




}

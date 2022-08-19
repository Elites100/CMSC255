package Labs.Lab_13;

public class Team {
    private String name;
    private int numGoals;
    private double numShots;


    public Team(){
        this.name = "";
        this.numGoals = 0;
        this.numShots = 0;
    }

    public Team(String name, int numGoals, double numShots){
        this.name = name;
        this.numGoals = numGoals;
        this.numShots = numShots;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumShots() {
        return numShots;
    }

    public void setNumShots(double numShots) {
        this.numShots = numShots;
    }

    public int getNumGoals() {
        return numGoals;
    }

    public void setNumGoals(int numGoals) {
        this.numGoals = numGoals;
    }



}

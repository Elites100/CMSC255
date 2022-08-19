package Projects.Project_7;

/***********************************************************************************************************************************************************************************
 * Moon.java
 ************************************************************************************************************************************************************************************
 * project seven - moon study
 ************************************************************************************************************************************************************************************
 * Project description
 * class for analysing the data of the moons' radius, distance and density
 * Kevin Phung
 * 11-30-2021
 * CMSC-255-004
 ***********************************************************************************************************************************************************************************/

public class Moon {
    /** Instance Variable name of type string */
    private String name;
    /** Instance Variable radius of type double */
    private double radius;
    /** Instance Variable density of type double */
    private double density;
    /** Instance Variable distance of type double */
    private double distance;

    /** Default constructor for Moon calling the Parameterized constructor */
    public Moon(){
    this.name = null;
    this.radius = 0.0;
    this.density = 0.0;
    this.distance = 0.0;
    }

    /** Parameterized constructor for Moon passing in the name,
     * a radius, the density, and the distance */
    public Moon(String name, double radius, double density, double distance){
        this.name = name;
        this.radius=radius;
        this.density = density;
        this.distance = distance;

    }

    /** Method getDistance that returns the Distance of the Moon */
    public double getDistance() {
        return distance;
    }

    /** Method setDistance that assigns a new value to the Distance of the Moon */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /** Method getDensity that returns the Density of the Moon */
    public double getDensity() {
        return density;
    }

    /** Method setDensity that assigns a new value to the Density of the Moon */
    public void setDensity(double density) {
        this.density = density;
    }

    /** Method getRadius that returns the Radius of the Moon */
    public double getRadius() {
        return radius;
    }

    /** Method setRadius that assigns a new value to the Radius of the Moon */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Method getName that returns the Name of the Moon */
    public String getName() {
        return name;
    }

    /** Method setName that assigns a new value to the Name of the Moon */
    public void setName(String name) {
        this.name = name;
    }

    /** Method toString that returns a String output for the Moon */
    @Override
    public String toString() {
        return name +" "+ String.format("%.2f", radius) + " "+ String.format("%.2f", density) + " " + String.format("%.2f", distance);
    }
}

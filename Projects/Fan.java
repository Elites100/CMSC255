 // Seperate classes realating to the FanTest
public class Fan {
    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;


    //construct a fan with default values
    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;

    }

    //construct a fan with another set of values
    public Fan(){
        this(SLOW,false,5,"blue");
    }

    // getter and setters listed form speed,on,radius,color
    // setting the new speed to the speed
    public void setSpeed(int newSpeed) {

        this.speed = newSpeed;
    }
    // returning the speed from getter
    public int getSpeed() {
        return speed;
    }
    // setting the boolean on to on
    public void setOn(boolean on) {
       this.on = on;
    }
    // retuning the boolean on
    public boolean isOn() {
        return on;
    }


    // getting setting the radius of the new radius
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }
    // returning the radius
    public double getRadius() {
        return radius;
    }
    // getting the color of the new color
    public void setColor(String newColor) {
        this.color = newColor;
    }

    // returning the color
    public String getColor() {
        return color;
    }
    // retuning the print out of toString
    public String toString(){

        if (on == true){
             return "fan is "+ getSpeed() + ", " + color + ", and size " + radius;
        }
        else{
            return "fan is off";
        }
    }
}






public class FanTest{
    public static void main(String[] args) {
        final int SLOW = 1;		// Fan speed slow
        final int MEDIUM = 2;	// Fan speed medium
        final int FAST = 3;		// Fan speed fast

        // Create two Fan objects
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        // Assign maximum speed, radius 10, color yellow,
        // and turn it on to the first object
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Assign medium speed, radius 5, color blue,
        // and turn it off to the second object
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(20);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Display the objects by invoking their toString method
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}

class Fan {
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

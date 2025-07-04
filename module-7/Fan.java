/*William Stearns
 * 6-21-25
 * CSD402
 * This program will create a fan class with methods to set and get the speed, power, radius, and color.*/
public class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private int radius;
    private String color;

    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }
    public Fan(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { //Test for valid speed values
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        } else {
            throw new IllegalArgumentException("Invalid speed value");
        }
    }
    public boolean isOn() { return on; }
    public void powerButton() { this.on = !this.on; } //instead of set decide to turn on or off
    public int getRadius() { return radius; }
    public void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius must be positive");
        }
    }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    //I wanted to display the speed and power status as strings in the toString method.
    public String speedToString() {
        switch (speed) {
            case STOPPED: return "STOPPED";
            case SLOW: return "SLOW";
            case MEDIUM: return "MEDIUM";
            case FAST: return "FAST";
            default: return "UNKNOWN";
        }
    }
    private String onToString() {
        return on ? "ON" : "OFF";
    }
    @Override
    public String toString() {
        return "fan is " + color + " with a " + radius + " foot radius.\n" +
                "It is turned "  + onToString() + " and set to " + speedToString();
    }
}
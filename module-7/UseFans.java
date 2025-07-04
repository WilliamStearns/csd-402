/*William Stearns
 * 7-1-25
 * CSD402
 * This creates a class to demonstrate the use of the Fan class..*/
import java.util.ArrayList;

public class UseFans {

    // Method to display a single Fan object without using toString()
    public static void displayFan(Fan fan) {
        System.out.println("Fan Details:");
        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Power: " + (fan.isOn() ? "ON" : "OFF"));
        System.out.println("Speed: " + fan.speedToString());
        System.out.println();
    }

    // Method to display a collection of Fan objects without using toString()
    public static void displayFanCollection(ArrayList<Fan> fans) {
        int count = 1;
        for (Fan fan : fans) {
            System.out.println("Fan #" + count + ":");
            displayFan(fan);
            count++;
        }
    }

    public static void main(String[] args) {
        // Create a collection of Fan instances
        ArrayList<Fan> fanList = new ArrayList<>();

        Fan fan1 = new Fan(Fan.SLOW, true, 8, "blue");
        Fan fan2 = new Fan(Fan.FAST, false, 10, "red");
        Fan fan3 = new Fan(); // uses default constructor

        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);

        // Display each fan using the single-fan method
        System.out.println("Displaying each fan individually:");
        for (Fan fan : fanList) {
            displayFan(fan);
        }

        // Or, display them all using the collection method
        System.out.println("Displaying all fans using collection method:");
        displayFanCollection(fanList);
    }
}
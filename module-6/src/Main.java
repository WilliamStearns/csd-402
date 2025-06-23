/*William Stearns
 * 6-21-25
 * CSD402
 * This program tests the Fan class.*/
import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Create two Fan objects and display their status
    Fan officeFan = new Fan();
    Fan bedroomFan = new Fan(3, true, 10, "red");
    out.println("\nI have two fans. Last night they were likes this:\n");
    fanStatus(officeFan, bedroomFan);
    //Change the status of the Fans and display their status
    bedroomFan.setSpeed(0);
    bedroomFan.powerButton();
    officeFan.powerButton();
    officeFan.setSpeed(2);

    out.println("This morning it's different. \n");
    fanStatus(officeFan, bedroomFan);
    }
    //method to display the status of the fans
    public static void fanStatus(Fan fan1, Fan fan2) {
        out.println("My office " + fan1.toString() + "\n");
        out.println("My bedroom " + fan2.toString() + "\n");
    }
}
/*William Stearns
 * 7-6-25
 * CSD402
 * This prompts the user for an integer until 0 and returns the maximum value entered.*/
import java.util.ArrayList;
import java.util.Scanner;


public class WillArrayListTest {
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        
        Integer maxValue = list.get(0);
        for (Integer value : list) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
    
    // Gets integers from user until 0 is entered; returns the list (including 0)
    public static ArrayList<Integer> getUserInput() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter integers (enter 0 to stop):");
        
        while (true) {
            System.out.print("Enter a number: ");
            try {
                Integer input = scanner.nextInt();
                numbers.add(input);
                
                if (input == 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
                continue; // Skip to the next iteration
            }
        }
        scanner.close();
        return numbers;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> userList = getUserInput();
        System.out.println("ArrayList contents: " + userList);
        Integer maxValue = max(userList);
        System.out.println("Maximum value: " + maxValue);
    }
}

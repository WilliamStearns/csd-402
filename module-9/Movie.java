/* William Stearns
 * 7-7-25
 * CSD402
 * This displays a list and then prompts the user for a string input to select a movie by index.
 * It demonstrates a for-each loop, try/catch with "Out of Bounds" message, and autoboxing/unboxing.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> movies = new ArrayList<>();
        movies.add("The Shawshank Redemption");
        movies.add("Titanic");
        movies.add("The Curious Case of Benjamin Button");
        movies.add("Snakes on a Plane");
        movies.add("The Dark Knight");
        movies.add("Superstar");
        movies.add("Wicked");
        movies.add("Titanic 2");
        movies.add("The Shining");
        movies.add("Avatar");

        displayList(movies);

        System.out.print("\nEnter the number of the movie you want to see again (1–" + movies.size() + "): ");
        String userInput = scanner.nextLine();  // Get String input

        try {
            Integer boxedIndex = Integer.parseInt(userInput); // Autoboxing
            int index = boxedIndex - 1; // Auto-unboxing + convert to 0-based index

            String selectedMovie = movies.get(index);
            System.out.println("\nYou selected: " + selectedMovie);
        } catch (Exception e) {
            System.out.println("Out of Bounds");  // Required message
        } finally {
            scanner.close();
        }
    }

    // Display movie list using a for-each loop
    private static void displayList(ArrayList<String> movies) {
        System.out.println("Here are the available movies:");
        int count = 1;
        for (String movie : movies) {  // for-each loop
            System.out.println("Movie #" + count + ": " + movie);
            count++;
        }
    }
}

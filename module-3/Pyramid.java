//William Stearns
//6-20-25
//CSD402
//This program displays a pyramid of numbers.

public class Pyramid {
    public static void main(String[] args) {

        int maxRows = 7;
        for (int row = 0; row < maxRows; row++) {

            // Indent the pyramid by the number of rows remaining to be printed
            int indentCount = maxRows - 1 - row;
            System.out.print("    ".repeat(indentCount));

            // Print ascending powers of 2
            for (int i = 0; i <= row; i++) {
                System.out.printf("%4d", 1 << i);
            }

            // Print descending powers of 2
            for (int i = row - 1; i >= 0; i--) {
                System.out.printf("%4d", 1 << i);
            }

            // Add space for the symbol and newline
            System.out.print("    ".repeat(indentCount));
            System.out.printf("%4s", "   @\n\n");
        }
    }
}

//William Stearns
//6-21-25
//CSD402
//This program will find the largest and smallest int or deouble in a 2D array.


public class MoreArrays {
    public static void main(String[] args) {
        int [][] array = {
            { 16, 2, 3, 4, 5 },
            { 4, 10, 1, 12, 75 },
            { 7, 89, 9, 54, 111 }
           };
        double [][] array2 = {
            { 7.1, 2.2, 3.3 },
            { 4.4, 9.5, 6.6 },
            { 9.7, 8.8, 10.9 }
           };
        // Call methods to locate largest and smallest elements
        int [ ] largestInt = locateLargest(array);
        int [ ] largestDouble = locateLargest(array2);
        int [ ] smallestInt = locateSmallest(array);
        int [ ] smallestDouble = locateSmallest(array2);
        // Print results
        System.out.println("Largest Integer's index is (" + largestInt[0] + ", " + largestInt[1]+ ")");
        System.out.println("Largest Double's index is (" + largestDouble[0] + ", " + largestDouble[1]+ ")");
        System.out.println("Smallest Integer's index is (" + smallestInt[0] + ", " + smallestInt[1]+ ")");
        System.out.println("Smallest Double's index is (" + smallestDouble[0] + ", " + smallestDouble[1] + ")");
    }
    public static int[] locateLargest(double[][] arrayParam) {
        double largest = arrayParam[0][0];
        int row = 0, col = 0;
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[] {row, col};
    }
    public static int[] locateLargest(int[][] arrayParam) {
        int largest = arrayParam[0][0];
        int row = 0, col = 0;
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[] {row, col};
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        double smallest = arrayParam[0][0];
        int row = 0, col = 0;
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[] {row, col};
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int smallest = arrayParam[0][0];
        int row = 0, col = 0;
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[] {row, col};
    }
}
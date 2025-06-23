//William Stearns
//6-21-25
//CSD402
//This program will display the use of overloaded methods with different data types in an array.

public class Arrays {
    public static void main(String[] args) {
        short[] shortArray = {-32768, 1, 3268};
        int[] intArray = {1, 2, 3, 4, 5};
        long[] longArray = {-32768, 1, 327635, 45,};
        double[] doubleArray = {1.5, 2.8, 6.3, 9.4, 1.5, 6.7};

        average(shortArray);
        average(intArray);
        average(longArray);
        average(doubleArray);
    }

    static void average (short [] array) {
        System.out.println("Short Array:");
            short sum = 0;
            short average = 0;
            for (short i : array) {
                System.out.print(i + ", ");
            }
            for (short i=0; i<array.length; i++) {
                sum += array[i];
            }
        average = (short) (sum / array.length);
        System.out.println("\nAverage: " + average + "\n");
    }
    static void average (int [] array) {
        System.out.println("Int Array:");
        int sum = 0;
        int average = 0;
        for (int i : array) {
            System.out.print(i + ", ");
        }
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        average = (int) (sum / array.length);
        System.out.println("\nAverage: " + average + "\n");
    }
    static void average(long[] array) {
        System.out.println("Long Array:");
        long sum, average;
        sum = 0;
        for (long i : array) {
            System.out.print(i + ", ");
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = (long) (sum / array.length);
        System.out.println("\nAverage: " + average + "\n");
    }
    public static void average(double[] array) {
        System.out.println("Double Array:");
        double sum = 0;
        double average = 0;
        for (double i : array) {
            System.out.print(i + ", ");
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        System.out.println("\nAverage: " + average + "\n");
    }
}
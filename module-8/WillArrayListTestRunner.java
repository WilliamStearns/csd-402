import java.util.ArrayList;

public class WillArrayListTestRunner {
    public static void main(String[] args) {
        System.out.println("=== WillArrayListTest: Manual Tests ===");

        // Test 1: Normal values
        ArrayList<Integer> testList1 = new ArrayList<>();
        testList1.add(10);
        testList1.add(20);
        testList1.add(30);
        System.out.println("Test list 1: " + testList1);
        System.out.println("Max: " + WillArrayListTest.max(testList1));

        // Test 2: Empty list
        ArrayList<Integer> testList2 = new ArrayList<>();
        System.out.println("\nTest list 2 (empty): " + testList2);
        System.out.println("Max: " + WillArrayListTest.max(testList2));

        // Test 3: Negative numbers
        ArrayList<Integer> testList3 = new ArrayList<>();
        testList3.add(-5);
        testList3.add(-10);
        testList3.add(-2);
        System.out.println("\nTest list 3 (negatives): " + testList3);
        System.out.println("Max: " + WillArrayListTest.max(testList3));

        // Test 4: All zeros
        ArrayList<Integer> testList4 = new ArrayList<>();
        testList4.add(0);
        testList4.add(0);
        testList4.add(0);
        System.out.println("\nTest list 4 (zeros): " + testList4);
        System.out.println("Max: " + WillArrayListTest.max(testList4));

        // Test 5: Single value
        ArrayList<Integer> testList5 = new ArrayList<>();
        testList5.add(42);
        System.out.println("\nTest list 5 (single value): " + testList5);
        System.out.println("Max: " + WillArrayListTest.max(testList5));
    }
}
/* William Stearns
   7-27-25
   CSD402
   This class provides a method to calculate the yearly service cost based on different parameters.
*/

public class YearlyService {
    private static final double BASE_COST = 99.99; // Base cost for yearly service
    private static final double TAX_RATE = 0.07;   // Tax rate for services

    // Method 1: Base service only
    public static double yearlyService() {
        return BASE_COST;
    }

    // Method 2: Base + oil change
    public static double yearlyService(OilType oilType) {
        return BASE_COST + oilType.getPrice();
    }

    // Method 3: Base + oil change + tire rotation
    public static double yearlyService(OilType oilType, double tireRotationFee) {
        return BASE_COST + oilType.getPrice() + tireRotationFee;
    }

    // Method 4: Base + oil change + tire rotation - coupon
    public static double yearlyService(OilType oilType, double tireRotationFee, double couponAmount) {
        double subTotal = BASE_COST + oilType.getPrice() + tireRotationFee - couponAmount;
        return Math.max(subTotal, 0); // Avoid negative totals
    }

    public static double addTax(double subTotal) {
        return subTotal + (subTotal * TAX_RATE);
    }

    public static void printCost(String label, double cost) {
        System.out.printf("%s: $%.2f%n", label, addTax(cost));
    }

    public static void main(String[] args) {
        // Test Method 1 twice
        printCost("Test 1 - Base Service", yearlyService());
        printCost("Test 2 - Base Service", yearlyService());

        // Test Method 2 with two oil types
        printCost("Test 3 - Regular Oil Change", yearlyService(OilType.REGULAR));
        printCost("Test 4 - Synthetic Oil Change", yearlyService(OilType.SYNTHETIC));

        // Test Method 3 with tire rotation
        printCost("Test 5 - Regular Oil + Tire Rotation", yearlyService(OilType.REGULAR, 20.00));
        printCost("Test 6 - Synthetic Oil + Tire Rotation", yearlyService(OilType.SYNTHETIC, 25.00));

        // Test Method 4 with coupon
        printCost("Test 7 - Regular Oil + Tire - $10 Coupon", yearlyService(OilType.REGULAR, 20.00, 10.00));
        printCost("Test 8 - Synthetic Oil + Tire - $15 Coupon", yearlyService(OilType.SYNTHETIC, 25.00, 15.00));
    }
}
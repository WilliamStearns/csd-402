/* William Stearns
   7-27-25
   CSD402
   Enum for storing oil change types and their prices */
public enum OilType {
    REGULAR(30.00),
    SYNTHETIC(40.00);

    private double price;

    OilType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
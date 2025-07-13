public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String name, int accountNumber, String state) {
        super(name, accountNumber);
        this.state = state;
    }
  

    @Override
    public void display() {
        System.out.println("Domestic Division: " + super.getName() + 
                           ", Account Number: " + super.getAccountNumber() + 
                           ", State: " + state);
    }
}

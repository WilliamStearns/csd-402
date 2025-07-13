public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String name, int accountNumber, String country, String language) {
        super(name, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + super.getName() + 
                           ", Account Number: " + super.getAccountNumber() + 
                           ", Country: " + country + 
                           ", Language: " + language);
    }
}

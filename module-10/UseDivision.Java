public class UseDivision {
    public static void main(String[] args) {
        // Domestic Divisions
        DomesticDivision dom1 = new DomesticDivision("Retail West", 101, "California");
        DomesticDivision dom2 = new DomesticDivision("Retail East", 102, "New York");

        // International Divisions
        InternationalDivision intl1 = new InternationalDivision("Global Sales", 201, "Germany", "German");
        InternationalDivision intl2 = new InternationalDivision("Asia-Pacific Ops", 202, "Japan", "Japanese");

        // Display all divisions
        dom1.display();
        dom2.display();
        intl1.display();
        intl2.display();
    }
}

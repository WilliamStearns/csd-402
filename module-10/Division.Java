public abstract class Division {
    private String name;
    private int accountNumber;

    public Division(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public abstract void display();
}

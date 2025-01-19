package Access_Modifier.BankAccountManagement;

public class BankAccount {
    // Public: accessible from any class
    public String accountNumber;

    // Protected: accessible within the same package and subclasses
    protected String accountHolder;

    // Private: only accessible within this class
    private double balance;

    // Constructor to initialize bank account
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify the balance
    public void deposit(double amount) {
        balance += amount;
    }

    // Public method to withdraw balance
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

 class SavingsAccount extends BankAccount {

    // Constructor to initialize SavingsAccount
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);  // Calling the parent class constructor
    }

    // Method to access public accountNumber and protected accountHolder
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

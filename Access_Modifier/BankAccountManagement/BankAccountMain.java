package Access_Modifier.BankAccountManagement;

public class BankAccountMain {
    public static void main(String[] args) {
        // Creating a BankAccount instance
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);
        
        // Accessing and modifying the balance using public methods
        System.out.println("Initial Balance: $" + account.getBalance());
        account.deposit(500.0);
        System.out.println("Balance after deposit: $" + account.getBalance());
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: $" + account.getBalance());
        
        // Creating a SavingsAccount instance
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Jane Smith", 2000.0);
        
        // Displaying account details using subclass method
        savingsAccount.displayAccountDetails();
    }
}

package Day_03.Level_1;
import java.util.*;

public class BankAccount {
	// static variable for storing bankname.
    static String bankName="\"State Bank Of India\"";
	//Fianl keyword foe accountNumber variable.
    final long accountNumber;
    String accountHolderName;
	
	// static count variable.
    static int count=0;

    // Parameterised Constructor
    BankAccount( String accountHolderName, long accountNumber){

        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        count++;
    }
	//Static method for getTotalAccounts.
    static void getTotalAccounts(){
        System.out.println("The total number accounts: "+count);
    }
	// method for  display the accountDetails.
    void accountDetails(){
        System.out.println("The Bank Account Name: "+bankName);
        System.out.println("The account holder name: "+accountHolderName);
        System.out.println("The account number: "+accountNumber);
    }

    public static void main(String[]args){
       // Creating the scanner class object.
        Scanner input= new Scanner(System.in);

        // taking user input.
        System.out.println("Enter the account holder name: ");
        String accountHolderName =input.nextLine();
        System.out.println("Enter the account number: ");
        long accountNumber=input.nextLong();
        BankAccount holder1= new BankAccount(accountHolderName, accountNumber);
        
		// to clear buffer
        input.nextLine(); 

        System.out.println("Enter the second  account holder name: ");
        String accountHolderName2 =input.nextLine();
        System.out.println("Enter the second account number: ");
        long accountNumber2=input.nextLong();
        BankAccount holder2= new BankAccount(accountHolderName2, accountNumber2);
            
			// calling the accountDetails method.
            holder1.accountDetails();
            holder2.accountDetails();
        
		// Display the total accounts.
        BankAccount.getTotalAccounts();
    }
}



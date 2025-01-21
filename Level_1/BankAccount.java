package Day_03.Level_1;
import java.util.*;

public class BankAccount {
    static String bankName="\"State Bank Of India\"";
    final long accountNumber;
    String accountHolderName;
    static int count=0;

    // Parameterised Constructor
    BankAccount( String accountHolderName, long accountNumber){

        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        count++;
    }
    static void getTotalAccounts(){
        System.out.println("The total number accounts: "+count);
    }
    void accountDetails(){

        System.out.println("The Bank Account Name: "+bankName);
        System.out.println("The account holder name: "+accountHolderName);
        System.out.println("The account number: "+accountNumber);
    }

    public static void main(String[]args){

        Scanner input= new Scanner(System.in);

        System.out.println("Enter the account holder name: ");
        String accountHolderName =input.nextLine();
        System.out.println("Enter the account number: ");
        long accountNumber=input.nextLong();
        BankAccount holder1= new BankAccount(accountHolderName, accountNumber);

        input.nextLine(); // to clear buffer

        System.out.println("Enter the second  account holder name: ");
        String accountHolderName2 =input.nextLine();
        System.out.println("Enter the second account number: ");
        long accountNumber2=input.nextLong();
        BankAccount holder2= new BankAccount(accountHolderName2, accountNumber2);

            holder1.accountDetails();
            holder2.accountDetails();

        BankAccount.getTotalAccounts();
    }
}



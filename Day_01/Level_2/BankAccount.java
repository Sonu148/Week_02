package Day_01.Level_2;
import java.util.*;
class AtmStimulation{

   private String accountHolder;
   private long accountNumber;
   private float balance;


   //Create constructor.
   public AtmStimulation(String accountHolder, long accountNumber, float balance){
     this.accountHolder=accountHolder;
     this.accountNumber=accountNumber;
     this.balance=balance;
   }

   //Method for deposit the amount.
   public float deposit(int amount){
     if(amount>0){
        balance+=amount;
     }
       return balance;
   }
   
   //Method for the withdrawl of amount.
   public float withdrawl(int amount){
      if(amount>balance){
         System.out.println("Insufficient balance ");
      }
      else if(amount<0){
        System.out.println("Invalid type re-type again ");
      }
      else{
         balance-=amount;
      }
      return balance;
   }
   //Method for the calculate the current balance. 
  public void currentBalance(){
    System.out.println("The current balance is "+balance);

  }
  public void displayDetails(){
   System.out.println("The account holder name is "+ accountHolder);
   System.out.println("The account number is "+accountNumber);
  }
}
public class BankAccount {
    public static void main(String[]args){
    Scanner input =new Scanner(System.in);


    AtmStimulation account= new AtmStimulation("Sohan", 45682634882l, 2344);

     account.currentBalance();

     System.out.print("Enter the  amount you want to deposit: ");
     int amountDeposit= input.nextInt();
     account.deposit(amountDeposit);

     account.currentBalance();    

     System.out.print("Enter the  amount you want to withdraw: ");
     int amountWithdraw= input.nextInt();
     account.withdrawl(amountWithdraw);
 
     account.currentBalance(); 
     
     account.displayDetails();
     input.close(); 
    }
}

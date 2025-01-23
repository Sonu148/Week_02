package day_04.objectmodeling.bankandaccountholder;

public class Customer {

    private String customerName;
    private long accountNumber;
    private double balance;

   public Customer(String customerName, long accountNumber, double balance){
       this.customerName=customerName;
       this.accountNumber=accountNumber;
       this.balance=balance;
   }

   /* public String getCustomerName() {
        return customerName;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }*/

    public void displayCustomerDetails(){
        System.out.println("The customer name "+customerName+" and account number is: "+accountNumber+" and balance is "+balance);
    }


}

package day_04.objectmodeling.bankandaccountholder;

public class BankCustomerManagement {
    public static void main(String[]args){

        //Creating the objects of the
        Bank bank1=new Bank("State Bank of India");
        Bank bank2= new Bank("Hdfc Bank");

         // creating customer class objects
        Customer customer1= new Customer("\"sohan\"", 833891761, 51424.11);
        Customer customer2=new Customer("\"Mohan\"", 746287462, 32214.231);

        // addding the customer details to the bank
        bank1.addCustomers(customer1);
        bank2.addCustomers(customer2);

         // display the customer bank account  details.
        bank1.customerBankDetails();
        bank2.customerBankDetails();
    }
}

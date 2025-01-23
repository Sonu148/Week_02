package day_04.objectmodeling.bankandaccountholder;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    // declare the string of bankname.
    private String bankName;

    //list to store the customer list.
    List<Customer> customers;

    // create  constructor
    public Bank(String bankName){
        this.bankName=bankName;
        this.customers= new ArrayList<>();
    }
    //adding new customer.
    public void addCustomers(Customer customer){
        customers.add(customer);
    }
    // display the bank customer details.
    public void customerBankDetails (){
        System.out.println("The bank name is :"+bankName);
        for(Customer customer: customers){
            customer.displayCustomerDetails();
        }
    }

}

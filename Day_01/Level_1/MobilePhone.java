package Day_01.Level_1;

class MobilePhoneDetails{
   private String brand;
   private String model;
   private long price;

  // Create a parametrised constructor.
  public MobilePhoneDetails(String brand, String model, long price){
    this.brand=brand;
    this.model=model;
    this.price=price;
  }

  //Create a method for dispaly the mobile phone details.
  public void displayPhoneDetails(){
    System.out.println("The brand name is: "+brand);
    System.out.println("The model name is: "+model);
    System.out.println("The price of the phone is: "+price);

  }
}

class MobilePhone {
    
  public static void main(String[]args){

    MobilePhoneDetails mobile1= new MobilePhoneDetails("Realme", "Narzo 70 Pro", 23000);
    MobilePhoneDetails mobile2= new MobilePhoneDetails("Samsung", "23 Ultra", 28999);
    
    System.out.println("The details of the Mobile Phone \"1\" is: ");
     mobile1.displayPhoneDetails();
    System.out.println("The details of the Mobile Phone \"2\" is: "); 
      mobile2.displayPhoneDetails();
  }
}

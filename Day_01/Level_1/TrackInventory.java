package Day_01.Level_1;

// Creating the class of name Item.
class Item{
    private  int itemCode;
    private String itemName;
    private double price;
    private int quantity=10;

  // Create a Construcor.
  public Item(int itemCode, String itemNmae, double price){
     this.itemCode=itemCode;
     this.itemName=itemNmae;
     this.price=price;  
  }

  // Method for display the details of item.
  public void diplayItemDetails(){
    System.out.println("The code of the item is "+itemCode);
    System.out.println("The name of the item is "+itemName);
    System.out.println("The price of the item is "+price);
    calculateCost();
  }

  // Methods for calculate the total cost of the item.
  public void calculateCost(){
     double cost= quantity*price;
    System.out.println("The cost of item "+itemName+" is "+cost);
  }
}
class TrackInventory{
   public static void main(String[]args){

    // Creating the object of the class Item.
     Item item1= new Item(234, "Cake", 399);
     Item item2= new Item(876, "Milk", 64);
     Item item3= new Item(98, "panner", 89);
    
     // Dipplay the item details.
    System.out.println("The details of item1:- ");
    item1.diplayItemDetails();
    System.out.println("The details of item2:- ");
    item2.diplayItemDetails();
    System.out.println("The details of item3:- ");
    item3.diplayItemDetails();
     

   }
}
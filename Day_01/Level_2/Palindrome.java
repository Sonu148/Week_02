package Day_01.Level_2;

import java.util.*;

class PalindromeCheck {
  private String str;

  // Create a constructor.
  public PalindromeCheck(String str) {
    this.str = str;
  }

  // Check if the string is a palindrome
  public boolean check(String str) {
    str = str.replaceAll("\\s+", "").toLowerCase();
    String reversed = new String();
    
    // Reverse the string 
    for (int i = str.length() - 1; i >= 0; i--) {
      reversed += str.charAt(i);
    }

    return str.equals(reversed);
  }

  // Display the palindrome result.
  public void displayDetails() {
    if (check(str)) {
      System.out.println("The above string is palindrome");
    } else {
      System.out.println("The above string is not a palindrome");
    }

  }
}

public class Palindrome {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("The string is: ");
    String str = input.nextLine();
    
    // Create an instance of PalindromeCheck and display the result
    PalindromeCheck str1 = new PalindromeCheck(str);
    str1.displayDetails();
    input.close();
  }
}

/*
 * This program takes one annual income and outputs the taxx bracket 
 * that the income is in
 */

import java.util.Scanner;

public class IncomeTax {
  public static void main(String[] args) {
    // Create and initialize variables
    double userIncome = 0;
    int taxBracket = 0;
    boolean err = false;
    Scanner scanner = new Scanner(System.in);

    // run code in try block to handle user error
    try {
      System.out.print("Enter annual income to nearest dollar: ");
      userIncome = Math.round(scanner.nextDouble());
      // Inform user if number is negative
      if (userIncome < 0) {
        System.out.println("Invalid data range!");
        err = true;
      }
    } catch (Exception e) {
      // Inform user is data entered isn't a number
      System.out.println("Invalid data entered!");
      err = true;
    }

    // Run code if no errors came up
    if (!err) {
      // Nested if statement to select the correct tax bracket
      if (userIncome <= 50000) {
        taxBracket = 5;
      } else if (userIncome <= 100000) {
        taxBracket = 15;
      } else if (userIncome <= 150000) {
        taxBracket = 20;
      } else if (userIncome <= 250000) {
        taxBracket = 30;
      } else if (userIncome <= 500000) {
        taxBracket = 35;
      } else {
        taxBracket = 50;
      }
      // Output values
      System.out.printf("For the income entered: $%.2f%n", userIncome);
      System.out.println("The tax bracket is: \t" + taxBracket + "%");
    }

    // close scanner
    scanner.close();
  }
}

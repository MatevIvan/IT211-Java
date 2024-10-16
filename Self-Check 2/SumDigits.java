/*
 * This program adds up the individual digits on a number
 */

import java.util.Scanner;

public class SumDigits {
  public static void main(String[] args) {
    //Create and Initialize variables
    int number = 0;
    boolean err = false;
    
    // Create and initialize scanner
    Scanner scanner = new Scanner(System.in);

    // Use try block to handle user input errors
    try {
      System.out.print("Enter a number between 1 and 999: ");
      number = scanner.nextInt();
      scanner.nextLine();
      if (number < 1 || number > 999) {
        System.out.println("Number entered is out of bounds.");
        err = true;
      }
    } catch (Exception e) {
      System.out.println("Invalid input.");
      err = true;
    }

    // If no errors
    if (!err) {
      // Add the one's digit to the total
      int total = number % 10;
      // if the number has at least 2 digits, extract the 2nd digit and add to total
      if (number > 9) {
        total += (number / 10) % 10;
      }
      // if the number has 3 digits, extract the hundred's digit and add to total
      if (number > 99) {
        total += (number / 100);
      }
      //print total
      System.out.println("The sum of the digit of your input is: " + total);
    }
    //close scanner
    scanner.close();
  }
}

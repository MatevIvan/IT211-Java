
/*
 * This simple program takes a number and outputs whether the number
 * is positive, negative, or zero
 */
import java.util.Scanner;

public class CheckNumber {
  public static void main(String[] args) {

    // Create a new scanner
    Scanner scanner = new Scanner(System.in);

    // run code in try block to handle user error
    try {
      System.out.print("Enter any number: ");
      // Create and assign user number
      double userNumber = scanner.nextDouble();
      scanner.nextLine();
      // use simple logic to find if the number is positive, negative, or zero
      if (userNumber < 0) {
        System.out.println("You entered a negative number.");
      } else if (userNumber == 0) {
        System.out.println("You entered the number zero.");
      } else if (userNumber > 0) {
        System.out.println("You entered a positive number.");
      }
    } catch (Exception e) {
      // Print if bad user input
      System.out.println("Invalid entry!");
    }

    // Close scanner
    scanner.close();
  }
}

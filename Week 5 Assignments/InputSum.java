/*
 * Ivan Matev
 * 07/17/2024
 * This program takes a bunch of user numbers and adds them together
 */

import java.util.Scanner;

public class InputSum {
  public static void main(String[] args) {

    // create a scanner to scan user input
    Scanner scanner = new Scanner(System.in);
    // give user instructions
    System.out.println(
        "Enter a set of positive integers (hit enter after every number). Enter \"-1\" to calculate the some of the numbers.");
    // create x and assign next int to x
    int x = scanner.nextInt();
    // create total and set it to 0
    int total = 0;
    // Create a String that will keep record values entered by user
    String text = "The numbers you entered are: \t";
    // run loop until user enters any negative number
    while (x > -1) {
      // add to the total the new user input
      total += x;
      // add a comma and a space to the text
      text += x + ", ";
      // look for next int
      x = scanner.nextInt();
    }
    // remove the comma and space at the end
    text = text.substring(0, text.length() - 2);
    // print the text
    System.out.println(text);
    // print the sum
    System.out.println("The sum of the numbers is: \t" + total);
    // close the scanner
    scanner.close();
  }
}

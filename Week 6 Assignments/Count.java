/*
 * Ivan Matev
 * 07/18/2024
 * This program looks for a specific character in a string
 */

import java.util.Scanner;

public class Count {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    // This is the test run for the count method using "Welcome" as the string and
    // 'e' as the character
    System.out.println("\nThis is a test run for the count method, it has " + "\"" + "Welcome" + "\""
        + " as the string and 'e' as the character");
    System.out
        .println("The string " + "\"" + "Welcome" + "\"" + " has 'e' appear " + count("Welcome", 'e') + " times\n");

    // Output to show the test program has ended and the user may try out the
    // program for themselves below.
    System.out.println(
        "You may try out the count method program for yourself below by putting your input after the 'Enter a string' below\n");

    // Prompt user for string input
    System.out.print("Enter a string: ");
    // Store input string in variable
    String inputString = scan.nextLine();
    // Convert inputString to lower case so all letters will be same for comparision
    // in if statement in count method
    String inputStringToLower = inputString.toLowerCase();
    // Prompt user for character input
    System.out.print("Enter the character you want to find: ");
    // Store character input in variable
    String inputChar = scan.next();
    // Convert input string to lower for comparision
    String inputCharToLower = inputChar.toLowerCase();
    // Convert lowercase string to character
    char inputCharConvert = inputCharToLower.charAt(0);

    // Output results for user to see with call to count method
    System.out.println("Your string " + "\"" + inputString + "\"" + " has " + "\'" + inputChar + "\'" + " appears "
        + count(inputStringToLower, inputCharConvert) + " time(s)\n");

    scan.close();
  }

  public static int count(String input, char letter) {
    // set counter equal to 0
    int counter = 0;
    // this for loop goes through an array
    // the input string has been truned into a char array
    for (char a : input.toCharArray()) {
      // if the current letter is the same as the letter we're looking for, add one to
      // the counter
      if (a == letter) {
        counter++;
      }
    }
    return counter;// return the counter value
  }
}// end main

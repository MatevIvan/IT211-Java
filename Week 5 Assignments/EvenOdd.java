/*
 * Ivan Matev
 * 07/17/2024
 * This program takes a number range and separates numbers between 
 * even and odd
 */

public class EvenOdd {
  public static void main(String[] args) {
    // Craete and initialize starting number
    int startingNum = 50;
    // create and initialize ending number
    int endingNum = 100;
    // set x to the starting number - x will be changed in the while loop
    int x = startingNum;
    // create and initialize string for even numbers
    String evenText = "Even numbers between " + startingNum + " and " + endingNum + ": \t";
    // create and initialize string for odd numbers
    String oddText = "Odd numbers between " + startingNum + " and " + endingNum + ": \t";

    // check if the starting number is less that the ending number
    if (startingNum < endingNum) {
      // continue through loop while x is less than ending number
      while (x <= endingNum) {
        if (x % 2 == 0) { // number is even
          evenText += x + ", "; // update string text
        } else {// number is odd
          oddText += x + ", "; // update string text
        }
        x++; // add to x at the end of each loop
      }
      // remove last comma and space from output strings
      evenText = evenText.substring(0, evenText.length() - 2);
      oddText = oddText.substring(0, oddText.length() - 2);
      // print out strings
      System.out.println("\n" + evenText + "\n");
      System.out.println(oddText + "\n");
    } else {
      // if the starting number isn't less than the ending number
      System.out.println("\nStarting number needs to be less than ending number.\n");
    }
  }
}

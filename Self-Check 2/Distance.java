/*
 * This java program calculates the distance of 2 points on a 2d plane
 */

import java.util.Scanner;

public class Distance {

  public static void main(String[] args) {
    // Create and initialize variables 
    double x1 = 0, y1 = 0;
    double x2 = 0, y2 = 0;
    double distance = 0;
    boolean err = false;

    // Create and initialize scanner
    Scanner scanner = new Scanner(System.in);

    // Nested try/catch block so that one error will break out of the chain
    try {
      // Request position information 
      System.out.println("Enter a value for x1 and y1 (separated by a space): ");
      // Store first double
      x1 = scanner.nextDouble();
      // Store second double
      y1 = scanner.nextDouble();
      // Clear cache before asking for next position
      scanner.nextLine();
      try {
        System.out.println("Enter a value for x2 and y2 (separated by a space): ");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        scanner.nextLine();
      } catch (Exception e) {
        err = true;
      }
    } catch (Exception e) {
      err = true;
    }
    // if error, print error message
    if (err) {
      System.out.println("Invalid input.");
    } else {
      // if no error, compute and print results
      distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
      System.out.println("The distance between the points is: " + distance);
    }
    // Close scanner
    scanner.close();
  }
}
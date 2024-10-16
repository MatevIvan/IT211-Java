/*
 * This program calculates the total cost of a trip 
 */

import java.util.Scanner;

public class DrivingCost {
  public static void main(String[] args) {
    // Create and initialize variables
    double distance = 0;
    double fuelEffciency = 0;
    double fuelCost = 0;
    boolean err = false;

    // Create and initialize scanner
    Scanner scanner = new Scanner(System.in);

    // Nested try/catch block so that one error will break out of the chain
    try {
      System.out.print("Enter total distance traveled: \t\t");
      distance = scanner.nextDouble();
      scanner.nextLine();

      try {
        System.out.print("Enter the fuel efficiency of your car: \t");
        fuelEffciency = scanner.nextDouble();
        scanner.nextLine();

        try {
          System.out.print("Enter the cost of fuel per gallon: \t");
          fuelCost = scanner.nextDouble();
          scanner.nextLine();

        } catch (Exception e) {
          err = true;
        }
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
      //if no errors do calculations
      double totalCost = (distance / fuelEffciency) * fuelCost;
      //format the totalCost and print
      System.out.printf("The total cost of your trip is: \t$%.2f%n", totalCost);
    }

    // Close scanner
    scanner.close();
  }  
}

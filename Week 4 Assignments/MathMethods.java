/*
 * Ivan Matev
 * 7/15/2024
 * Assignment 4
 * This simple program uses several different math functions.
 */

import java.util.Scanner;

public class MathMethods {
  public static void main(String[] args) {
    // Create a scanner that will be used throughout the assignment
    Scanner scanner = new Scanner(System.in);

    // -----Part A: Finding the absolute value of an int-----
    System.out.print("------Enter a negative int: ");
    int negativeInt = scanner.nextInt();
    scanner.nextLine();
    if (negativeInt >= 0) {
      // If value is not negative, let user know
      System.out.println("The number you entered is not negative.");
    } else {
      // If value is negative, take the absolute value of it
      System.out.println("A) The absolute value of your number: \t" + Math.abs(negativeInt));
    }

    // -----Part B Finding sin, cos, and tan of a number-----
    System.out.print("------Enter a number (in degrees) representing an angle: ");
    double angleInDegrees = scanner.nextDouble();
    scanner.nextLine();
    // convert value into radians
    double angleInRad = Math.toRadians(angleInDegrees);
    // Do math and display values
    System.out.printf("B) The sine of your angle is: \t\t%.2f%n", Math.sin(angleInRad));
    System.out.printf("B) The cosine of your angle is: \t%.2f%n", Math.cos(angleInRad));
    System.out.printf("B) The tangent of your angle is :\t%.2f%n", Math.tan(angleInRad));

    // -----Part C Finding Floor and Ceiling of a number-----
    System.out.print("-----Enter a floating point number: ");
    double number = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("C) The floor of that number is: \t" + Math.floor(number));
    System.out.println("C) The ceiling of that number is: \t" + Math.ceil(number));

    // -----Part D Finding the exponent of 2 numbers-----
    System.out.print("-----Enter 2 (small) floating numbers seperated by a space: ");
    double number1 = scanner.nextDouble();
    double number2 = scanner.nextDouble();
    scanner.nextLine();
    System.out.printf("D) The value of x^y is: \t\t%.2f%n", Math.pow(number1, number2));

    // -----Part E Finding the square root of a number-----
    System.out.print("-----Enter a large integer: ");
    double largeInt = scanner.nextInt();
    System.out.printf("E) The square root of that number is: \t%.2f%n", Math.sqrt(largeInt));

    scanner.close();
  }
}

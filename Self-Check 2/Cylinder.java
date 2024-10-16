/*  
* This simple program takes a radius and a length of a cylinder from the user 
* and calculates the area of the top circle and the volume of the cylinder 
*/

import java.util.Scanner;

public class Cylinder {
    public static void main (String[] args){
      // Create and initialize variables
      double radius = 0;
      double length = 0;
      double area = 0;
      double volume = 0;

      boolean err = false;

      // Create s scanner looking for user input
      Scanner scanner = new Scanner(System.in);

      // Nested try/catch block so that one error will break out of the chain
      try {
        System.out.println("Please enter the radius of the circle: ");
        radius = scanner.nextDouble();
        scanner.nextLine();
        
        try {
          System.out.println("Please enter the length of the cylinder: ");
          length = scanner.nextDouble();
          scanner.nextLine();

        } catch (Exception e) {
          err = true;
        }
      } catch (Exception e) {
        err = true;
      }

      // if error, print error message
      if (err) {
        System.err.println("Invalid value entered!");
      } else {
        // if no error, compute and print results
        area = Math.PI * radius * radius;
        volume = area * length;
        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);
      }
      // Close active scanner
      scanner.close();
    }
}

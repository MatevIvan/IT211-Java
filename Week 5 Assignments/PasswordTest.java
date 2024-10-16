/*
 * Ivan Matev
 * 07/17/2024
 * This program keeps the user in a loop until they enter a 
 * password that meets all the criteria
 */

import java.util.Scanner;

public class PasswordTest {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println(
        "\nA good password will be at least 8 characters and include at least one lower-case letter, at least one upper-case letter, at least one digit, and at least one special character.");
    System.out.print("\nEnter a Password: \t");
    /*
     * Password Conditions
     * at least 8 Characters
     * Includes at least 1 lowercase letter
     * Includes at least 1 uppercase letter
     * Includes at least 1 number
     * Includes at least 1 special character
     */
    boolean validPassword = false;
    boolean goodLength = false;
    boolean hasLowercase = false;
    boolean hasUppercase = false;
    boolean hasNumber = false;
    boolean hasSpecial = false;
    // set user password once user presses enter
    String userPassword = scanner.nextLine();
    // this loop will continue until a valid password is entered
    while (!validPassword) {
      if (userPassword.length() > 7) { // length check
        goodLength = true;
        // test every char in the password
        for (char x : userPassword.toCharArray()) {
          if (Character.isLowerCase(x)) { // is char lowercase
            hasLowercase = true;
          } else if (Character.isUpperCase(x)) { // is char uppercase
            hasUppercase = true;
          } else if (Character.isDigit(x)) { // is char a number
            hasNumber = true;
          } else {
            hasSpecial = true; // char has to be a special character
          }
        }
      }

      // print user passwrod
      System.out.println("Entered Password:\t" + userPassword);
      System.out.print("Verdict:\t\t");
      // check if all conditions are true
      if (goodLength && hasLowercase && hasUppercase && hasNumber && hasSpecial) {
        validPassword = true; // if all true, password is valid
        System.out.println("Pass\n");
      } else {
        System.out.println("Invalid!\n");
        System.out.print("Please enter a new password: ");
        userPassword = scanner.nextLine(); // wait for new user password
      }
    }
    // close the scanner
    scanner.close();
  }
}

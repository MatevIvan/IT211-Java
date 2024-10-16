/*
 * Ivan Matev
 * 7/15/2024
 * Assignment 4
 * This program does simple manipulations to two Strings
 */

import java.util.Scanner;

public class StringMethods {
  public static void main(String[] args) {
    // create and initialize variables
    String string1 = "";
    String string2 = "";

    // create a new scanner
    Scanner scanner = new Scanner(System.in);

    // print prompt and save user input as string1
    System.out.print("Enter a String: ");
    string1 = scanner.nextLine();

    // print prompt and save user input as string2
    System.out.print("Enter a second String: ");
    string2 = scanner.nextLine();

    // process and print strings
    System.out.println("A) The length of the first String is: " + string1.length()); // length of string1
    System.out.println("B) The length og the second String is: " + string2.length()); // length of string2
    System.out.println("C) The two Strings concatinated is: " + string1 + " " + string2); // both strings combined
    // compares casing and char of both strings
    System.out.println("D) Are both Strings the same? " + string1.equals(string2));
    System.out.println("E) The first String in uppercase: " + string1.toUpperCase()); // Makes first string uppercase
    System.out.println("F) The second String in lowercase: " + string2.toLowerCase()); // makes second string lowercase
    // pick a random number within the first half of string1
    int begin = (int) (Math.random() * (string1.length() / 2));
    // pick a random number within the second half of string1
    int end = (int) ((Math.random() * (string1.length() / 2)) + (string1.length() / 2));
    // print a random subset of string1
    System.out.println("G) A sub-String from within the frist String: " +
        string1.substring(begin, end));

    // close the scanner
    scanner.close();
  }
}

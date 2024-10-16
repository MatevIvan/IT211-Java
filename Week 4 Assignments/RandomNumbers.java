/*
 * Ivan Matev
 * 7/15/2024
 * Assignment 4
 * This simple program generates random numbers within a range
 */

public class RandomNumbers {
  public static void main(String[] args) {
    int randomNumber = (int) (Math.random() * 21) + 30;
    System.out.println("A) A random number between 30 and 50: \t  " + randomNumber);
    randomNumber = (int) (Math.random() * 41) - 20;
    System.out.println("B) A random number between -20 and 20: \t  " + randomNumber);
    randomNumber = (int) ((Math.random() * 41) + 20) * -1;
    System.out.println("C) A random number between -60 and -20:   " + randomNumber);
    double randomFloat = Math.random() * 16;
    System.out.printf("D) A random number between 0 and 15.9999: %.4f%n", randomFloat);
  }
}

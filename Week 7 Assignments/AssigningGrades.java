/*
 * Ivan Matev
 * 7/20/2024
 * This program allows the user to enter in the number of students they have
 * and enter grades for each student. 
 * The score and grade of the student will be displayed.
 * The user will be allowed to change all the grades if they want to
 */

import java.util.Scanner;

public class AssigningGrades {

  public static void main(String[] args) {

    // create scanner
    Scanner scanner = new Scanner(System.in);
    // create boolean that will allow for the program to run over and over
    boolean changeGrades = true;

    // this loop will only end if the user wants to exit out
    while (changeGrades) {
      System.out.print("\nEnter the number of students: ");
      // store the number of students into a total students variable
      int totalStudents = scanner.nextInt();
      // create a new int array to be the length of the total students
      int grades[] = new int[totalStudents];

      System.out.print("Enter " + totalStudents + " scores: ");
      // run a loop to store all the values
      for (int i = 0; i < grades.length; i++) {
        grades[i] = scanner.nextInt();
      }
      scanner.nextLine(); // clear any left over numbers

      System.out.println();// Add an empty line of space

      int highScore = highScore(grades);
      for (int i = 0; i < grades.length; i++) {
        System.out.println("Student " + (i + 1) + " score is " + grades[i] + " and grade is "
            + letterGrade(grades[i], highScore));
      }

      System.out.println("\nWould you like to change all the grades?");
      System.out.println("\"1\" to change grades. \"0\" to exit.");
      if (scanner.nextInt() == 0) {
        changeGrades = false;
      }
    }
    System.out.println();// Add empty line of space
    scanner.close();
  }

  // This method compares the current score with the best score to return a letter
  // value
  public static String letterGrade(int grade, int highScore) {
    if (highScore - grade <= 10) {
      return "A";
    }
    if (highScore - grade <= 20) {
      return "B";
    }
    if (highScore - grade <= 30) {
      return "C";
    }
    if (highScore - grade <= 40) {
      return "D";
    }
    return "F";
  }

  // this method finds the highest score in an int array
  public static int highScore(int[] grades) {
    int highScore = grades[0];

    for (int currentGrade : grades) {
      if (currentGrade > highScore) {
        highScore = currentGrade;
      }
    }
    return highScore;
  }
}
import java.util.Scanner;

public class ValueRep {
  public static void main(String[] args) {
    // create length and area variables
    int length = 0;
    int area = 0;

    boolean err = false;

    // create scanner
    Scanner scanner = new Scanner(System.in);

    // Give prompt for user
    System.out.print("Enter a value to be the side of the square: ");

    try {
      // Check for valid user input
      length = scanner.nextInt();
      // If value is negative set err to true
      if (length <= 0) {
        err = true;
      }
    } catch (Exception e) {
      // if value is outside int length or type, set err to true
      err = true;
    }

    if (err) {
      // if err, display error message
      System.err.println("That is not a valid input!");
    } else {
      // if no input errors, calulate area
      area = length * length;
      // Display all information
      System.out.println("The length of one side is: \t" + length);
      System.out.println("The area of the square is: \t" + area);
      System.out.println("The perimeter of the square is: " + 4 * length);
    }

    // close the scanner
    scanner.close();
  }
}

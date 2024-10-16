import java.util.Scanner;

public class Practice_2_3 {
  public static void main(String[] args) {
    // create all variables
    byte byte_value = 0;
    short short_value = 0;
    int int_value = 0;
    long long_value = 0;
    float float_value = 0;
    double double_value = 0;
    boolean err = false;

    // create scanner
    Scanner scan = new Scanner(System.in);

    // Handle Bytes
    System.out.print("Enter a (byte (Max number is 127)) number: ");
    try {
      // check for correct value type and assign value
      byte_value = scan.nextByte();
      // if no errors, set err to false
      err = false;
    } catch (Exception e) {
      // if error, notify user
      System.err.println("That value is not a byte!");
      // set err to true
      err = true;
    }
    // clear scanner cache
    scan.nextLine();
    if (!err) {
      // if no errors, print user value
      System.out.println("You entered: " + byte_value);
    }

    // Shorts
    System.out.print("Enter a (short (Max number is 32,767)) number: ");
    try {
      short_value = scan.nextShort();
      err = false;
    } catch (Exception e) {
      System.err.println("That value is not a short!");
      err = true;
    }
    scan.nextLine();
    if (!err) {
      System.out.println("You entered: " + short_value);
    }

    // int
    System.out.print("Enter a (int (Max number is 2.1m)) number: ");
    try {
      int_value = scan.nextInt();
      err = false;
    } catch (Exception e) {
      System.err.println("That value is not an int!");
      err = true;
    }
    scan.nextLine();
    if (!err) {
      System.out.println("You entered: " + int_value);
    }

    // long
    System.out.print("Enter a (long (Max number is 9.2m)) number: ");
    try {
      long_value = scan.nextLong();
      err = false;
    } catch (Exception e) {
      System.err.println("That value is not a long!");
      err = true;
    }
    scan.nextLine();
    if (!err) {
      System.out.println("You entered: " + long_value);
    }

    // float
    System.out.print("Enter a (float (Max number is 3.4028235E38)) number: ");
    try {
      float_value = scan.nextFloat();
      err = false;
    } catch (Exception e) {
      System.err.println("That value is not a float!");
      err = true;
    }
    scan.nextLine();
    if (!err) {
      System.out.println("You entered: " + float_value);
    }

    // double
    System.out.print("Enter a (double (Max number is 1.7976931348623157E308)) number: ");
    try {
      double_value = scan.nextDouble();
      err = false;
    } catch (Exception e) {
      System.err.println("That value is not a double!");
      err = true;
    }
    scan.nextLine();
    if (!err) {
      System.out.println("You entered: " + double_value);
    }

    // close scanner
    scan.close();
  }
}

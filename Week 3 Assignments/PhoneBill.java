import java.util.Scanner;

public class PhoneBill {
  public static void main(String[] args) {
    // Create and initialize variables
    String userInput = "A";
    String userAccountNumber;
    String serviceType = "";
    int userTalkTime = 0;
    int totalTalkTime = 0;
    double cost = 0;
    boolean err = false;

    Scanner scanner = new Scanner(System.in);

    // Allow user to put in any account number
    System.out.print("Enter account number: ");
    userAccountNumber = scanner.nextLine();

    try {
      System.out.println("Please enter \"R\" for Regular service.\nPlease enter \"P\" for Premium service.");
      userInput = scanner.next();
      userInput = userInput.toUpperCase();
      scanner.nextLine();
    } catch (Exception e) {
      err = true;
    }

    if (userInput.equals("R")) { // Regular service
      serviceType = "Regular";
      try {
        System.out.println("How many minutes was this service used? ");
        userTalkTime = scanner.nextInt();
        scanner.nextLine();
        // Do math for regular service
        cost = 10;
        if (userTalkTime <= 0) {
          err = true;
        } else if (userTalkTime > 50) {
          cost = 10 + (userTalkTime - 50) * 0.2;
        } else
          System.err.println("Somehow landed here..."); // this code should never execute
      } catch (Exception e) {
        err = true;
      }
      totalTalkTime = userTalkTime; // Set total talk time equal to user talk time

    } else if (userInput.equals("P")) {// Premium Service
      serviceType = "Premium";
      try {

        // Day time rates
        System.out.println("How many minutes was this service used for during the DAY? (6AM to 6PM)");
        userTalkTime = scanner.nextInt();
        scanner.nextLine();
        cost = 25;
        if (userTalkTime < 0) {
          err = true;
        } else if (userTalkTime > 75) {
          cost += (userTalkTime - 75) * 0.1;
        }
        totalTalkTime += userTalkTime; // add user talk time to total

        // Night time rates
        System.out.println("How many minutes was this service used for during the NIGHT? (6PM to 6AM)");
        userTalkTime = scanner.nextInt();
        scanner.nextLine();
        if (userTalkTime < 0) {
          err = true;
        } else if (userTalkTime > 100) {
          cost += (userTalkTime - 100) * 0.05;
        }
        totalTalkTime += userTalkTime; // add user talk time to total
      } catch (Exception e) {
        err = true;
      }

    } else {
      err = true;
    }

    if (err) {
      System.out.println("Invalid input!");
    } else {
      // Print bill
      System.out.println("Your account number is: \t" + userAccountNumber);
      System.out.println("The account service type: \t" + serviceType);
      System.out.println("The total amount of minutes: \t" + totalTalkTime);
      System.out.printf("The total amount due: \t\t$%.2f%n", cost);
    }

    // close Scanner
    scanner.close();
  }
}
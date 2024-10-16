import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    // create and initailize variables
    boolean playAgain = true;
    int userInput = 0;
    int robotInput = (int) (Math.random() * 3);
    int robotWins = 0, userWins = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.print("rock(1), paper(2), scissors(3): ");

    while (playAgain) {

      try {
        userInput = scanner.nextInt();
        scanner.nextLine(); // reset the scanner

      } catch (Exception e) {
        System.out.println("Invalid input!");
        playAgain = false;
      }

      if (userInput > 0 && userInput < 4) { // game logic
        System.out.println();// create some space
        if (robotInput == 0) {// robot picked rock
          if (userInput == 1) {// user picked rock
            System.out.println("-----It's a TIE!!-----");
          } else if (userInput == 2) {// user picked paper
            System.out.println("-----Congrats!! You WON!-----");
            userWins += 1;
          } else if (userInput == 3) {// user picked scissors
            System.out.println("-----Too bad, you LOST this time!-----");
            robotWins += 1;
          }
        } else if (robotInput == 1) {// robot picked paper
          if (userInput == 1) {// user picked rock
            System.out.println("-----Robot won this round!-----");
            robotWins += 1;
          } else if (userInput == 2) {// user picked paper
            System.out.println("-----It's a TIE!-----");
          } else if (userInput == 3) {// user picked scissors
            System.out.println("-----VICTORY is yours!-----");
            userWins += 1;
          }
        } else if (robotInput == 2) {// robot picked scissors
          if (userInput == 1) {// user picked rock
            System.out.println("-----Great! You BEAT the robot!!-----");
            userWins += 1;
          } else if (userInput == 2) {// user picked paper
            System.out.println("-----Oh no, you LOST!-----");
            robotWins += 1;
          } else if (userInput == 3) {// user picked scissors
            System.out.println("-----Yup, it's a DRAW!-----");
          }
        }
        System.out.println();// create some space
      } else
        System.out.println("Invalid input range!");

      // handle post game
      System.out.print("Press \"1\" to play again: ");
      try {
        userInput = scanner.nextInt();
        scanner.nextLine();
        if (userInput == 1) {
          System.out.print("rock(1), paper(2), scissors(3): ");
          robotInput = (int) (Math.random() * 3);
          playAgain = true;
        } else
          playAgain = false;
      } catch (Exception e) {
        playAgain = false;
      }

    }
    // Display score card
    System.out.println("\n-----Score Card -----");
    System.out.println("User Wins: \t" + userWins);
    System.out.println("Robot Wins: \t" + robotWins + "\n");

    scanner.close();
  }
}

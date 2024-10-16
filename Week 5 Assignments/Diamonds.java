/*
 * Ivan Matev
 * 07/17/2024
 * This program creates diamonds in the console
 */
public class Diamonds {
  public static void main(String[] args) {
    int diamondsSize = 19;// number needs to be odd
    int spacing = (diamondsSize / 3);
    if (diamondsSize % 2 == 1) {
      System.out.println();// Print empty line for spacing
      for (int i = 1; i <= diamondsSize; i += 2) {
        // Top half of the first diamond
        for (int j = 0; j < (diamondsSize - i) / 2; j++) {
          System.out.print("I");
        }
        for (int j = 1; j <= i; j++) {
          System.out.print("*");
        }
        // top half for the second diamond
        for (int j = 0; j < spacing; j++) {
          System.out.print(" ");
        }
        for (int j = 0; j < diamondsSize - i + 1; j++) {
          System.out.print("*");
        }
        System.out.println();
      }

      for (int i = 1; i < diamondsSize; i += 2) {
        // Bottom half of the first Diamond
        for (int j = 1; j <= i / 2 + 1; j++) {
          System.out.print(" ");
        }
        for (int j = 1; j < diamondsSize - i; j++) {
          System.out.print("*");
        }
        // bottom half of the second diamond
        for (int j = 0; j < spacing; j++) {
          System.out.print(" ");
        }
        for (int j = 0; j < i + 2; j++) {
          System.out.print("*");
        }

        System.out.println();
      }
      System.out.println();// Print empty line for spacing
    } else {
      // Let user know if an even number was entered
      System.out.println("\nDiamond size needs to be odd!\n");
    }
  }
}

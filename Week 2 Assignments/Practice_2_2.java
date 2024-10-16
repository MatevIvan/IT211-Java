public class Practice_2_2 {
  public static void main(String[] args) {
    // Create a new array containing 10 integers
    float[] variables = new float[5];

    // Initialize additional variables
    float sum = 0, diff = 0, mult = 0;

    // create a loop that will itterate for the length of the variables array
    for (int i = 0; i < variables.length; i++) {
      // Randomly populate each variable with a number between 0 and 10
      variables[i] = (float) (Math.random() * 10);
      // Print out each variable as it's populated
      System.out.println("The value of variable " + i + " is: " + variables[i]);
      // Add to the total as new variables are craeted
      sum += variables[i];

      if (i == 0) {
        // If the first variable is being populated, copy it
        diff = variables[i];
        mult = variables[i];
      } else {
        // Do math if second or more variable
        diff -= variables[i];
        mult = mult * variables[i];
      }
    }
    // Print out statements
    System.out.println("\nThe sum of the variables is: " + sum);
    System.out
        .println("The difference of the variables (starting with the first one and subtracting the rest) is: " + diff);
    System.out.println("The product of all the variables is: " + mult);
    System.out.println();
  }
}

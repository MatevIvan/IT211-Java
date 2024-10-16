public class Practice_2_1 {

  public static void main(String[] args) {

    // Create a new array containing 10 integers
    int[] variables = new int[10];

    // Declare additional variables
    int total = 0;
    int average;

    // create a loop that will itterate for the length of the variables array
    for (int i = 0; i < variables.length; i++) {
      // Randomly populate each variable with a number between 0 and 100
      variables[i] = (int) (Math.random() * 100);
      // Print out each variable as it's populated
      System.out.println("The value of variable " + i + " is: " + variables[i]);
      // Add to the total as new variables are craeted
      total += variables[i];
    }
    // Calculate the average
    average = total / variables.length;

    // print the average value
    System.out.println("The average of all the variables is: " + average);
  }
}
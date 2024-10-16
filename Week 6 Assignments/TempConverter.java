/*
 * Ivan Matev
 * 07/18/2024
 * This program uses methods to calculate Celius to Fahrenheit and 
 * vice versa
 */
public class TempConverter {
  public static void main(String[] args) {
    // Create variables
    double celsius1, celsius2, fahrenheit1, fahrenheit2;
    // print header
    System.out.println("\nCelsius \tFahrenheit\t|\tFahrenheit\tCelsius");
    System.out.println("--------------------------------|--------------------------------");

    // create for loop to repeat many times
    for (int i = 0; i < 10; i++) {
      // assign and calculate values
      celsius1 = 40 - i;
      fahrenheit1 = celsiusToFahrenheit(celsius1);
      fahrenheit2 = 120 - 10 * i;
      celsius2 = fahrenheitToCelsius(fahrenheit2);

      System.out.printf("%.1f \t\t%.1f\t\t|\t%.2f\t\t%.2f%n",
          celsius1, fahrenheit1, fahrenheit2, celsius2);
    }
    System.out.println(); // empty line of space
  }

  public static double celsiusToFahrenheit(double celsius) {
    // do calculation and return value
    return celsius * 9 / 5 + 32;
  }

  public static double fahrenheitToCelsius(double fahrenheit) {
    // do calculation and return value
    return (fahrenheit - 32) * 5 / 9;
  }
}

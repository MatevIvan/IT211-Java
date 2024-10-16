public class Practice_1_5 {
  public static void main(String[] args) {
    int miles = 75;
    int time = 50;

    double km = miles * 1.6;
    double avgSpeed = 60 * (km/time);

    System.out.println("The average speed in km/hr is: " + avgSpeed);
  }
}

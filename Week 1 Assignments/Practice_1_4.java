// Class:       IT 211

// Term:        Sum24

// Name:        Ivan Matev

// Instructor:  Dr. North

// Assignment:  1

 import java.util.Scanner;

public class Practice_1_4
{
    public static void main(String args[])
    {
        // Create a new scanner named s
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        // Wait for user to press enter and process the input 
        // and save it as a string
        String name = s.nextLine();
        System.out.println("Hello " + name + "!");
        // Close the scanner
        s.close();
    }
}

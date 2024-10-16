/*
 * Ivan Matev
 * 7/31/2024
 * This exercise helps understand classes and inheritance
 */

public class DemoBook {
  // Main class was provided by Instructor
  public static void main(String[] args) {
    Book book1 = new Book();
    TextBook book2 = new TextBook();

    book1.setTitle("The Shining");
    book1.setPages(450);
    book2.setTitle("Arithmetic");
    book2.setPages(200);
    book2.setGradeLevel(4);

    System.out.println();// Blank line for spacing
    System.out.println("Book 1 is " +
        book1.getTitle() + " with " +
        book1.getPages() + " pages.");
    System.out.println("Book 2 is " +
        book2.getTitle() + " with " +
        book2.getPages() +
        " pages. It is for grade level " +
        book2.getGradeLevel() + ".");
    System.out.println();// Blank line for spacing
  }
}

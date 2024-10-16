
public class Book {
  // Create private variables that cannot be directly changed
  private String title;
  private int numOfPages;

  // Constructor with title and pages
  public Book(String title, int pages) {
    this.title = title;
    this.numOfPages = pages;
  }

  // Constructor with only title
  public Book(String title) {
    this.title = title;
    this.numOfPages = 0;
  }

  // Blank consttructor
  public Book() {
    this.title = "No Title";
    this.numOfPages = 0;
  }

  // Set title
  public void setTitle(String title) {
    this.title = title;
  }

  // Set pages
  public void setPages(int pages) {
    this.numOfPages = pages;
  }

  // get title
  public String getTitle() {
    return title;
  }

  // get pagesx
  public int getPages() {
    return numOfPages;
  }

}

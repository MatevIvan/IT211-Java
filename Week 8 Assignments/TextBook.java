public class TextBook extends Book {
  // create private variable
  private int gradeLevel;

  // constructor with grade level input
  public TextBook(int gradeLevel) {
    this.gradeLevel = gradeLevel;
  }

  // blank constructor
  public TextBook() {
    return;
  }

  // set the grade level
  public void setGradeLevel(int gradeLevel) {
    this.gradeLevel = gradeLevel;
  }

  // get the grade level
  public int getGradeLevel() {
    return gradeLevel;
  }
}

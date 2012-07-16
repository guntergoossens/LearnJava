// Write a program that fully includes and calls the storage() method defined as a code fragment in this chapter
public class ArgumentList {
  int storage(String s) {
    return s.length() * 2;
  }
  public static void main (String args []) {
    ArgumentList a = new ArgumentList();
    System.out.println(a.storage("what I want to test"));
  }
}


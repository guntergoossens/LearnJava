//: c04:Overloading.java
// Demonstration of both constructor
// and ordinary method overloading.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import java.util.*;

/** This is a private class demonstrating the overloading principle in Java
	* @author Bruce Eckel 
	*/

class Tree {
	/** the height of a tree */
  int height;

	/** constructor of the tree (planting a seed) */
  Tree() {
    System.out.println("Planting a seedling");
    height = 0;
  }

	/** non-default constructor that plants a tree with a height 
		* @param i height of the tree 
		*/
	Tree(int i) {
    System.out.println("Creating new Tree that is "
      + i + " feet tall");
    height = i;
  }

	/** information of the tree */
  void info() {
    System.out.println("Tree is " + height + " feet tall");
  }

	/** information of the tree, but with a leading string.
		* @param s String that has to be printed before the tree info is printed
		*/
  void info(String s) {
    System.out.println(s + ": Tree is "
      + height + " feet tall");
  }
}


/** public class to demonstrate overloading principle 
	* @author Bruce Eckel
	*/
public class Overloading {

	/** this is where the magic happens 
		* @param args command line arguments
	  */
  public static void main(String[] args) {
    for(int i = 0; i < 5; i++) {
      Tree t = new Tree(i);
      t.info();
      t.info("overloaded method");
    }
    // Overloaded constructor:
    new Tree();
  }
} ///:~

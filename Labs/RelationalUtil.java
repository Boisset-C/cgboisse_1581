//Cosme Boisset - Lab05 - Problem 4: Logical Util

/*
 (API design) Java provides the basic relational operations: < (greater than), <= (greater than or equal), > (less than), >= (less than or equal). From these basic relational operators, there are often more complex forms of relational expressions that are commonly needed. You're tasked to implement a Relational Utility class for Java that includes the following API (Application Programming Interface). Utility classes are typically helper classes that contain a collection of related static methods. For example, Math is a utility class.
 */

public class RelationalUtil {

  //Returns true if x is smaller than y and y is smaller than z, exclusive
  public static boolean isIncreasing(int x, int y, int z) {
    if (x < y && y < z) {
      return true;
    } else
    return false;
  }

  //Returns true if x is larger than y and y is larger than z, exclusive
  public static boolean isDecreasing(int x, int y, int z) {
    if (x > y && y > z) {
      return true;
    } else
    return false;
  }

  //Returns true if y is between x and z, inclusive 
  public static boolean isBetween(int x, int y, int z) {
    if (x > y && y > z || x < y && y < z ) {
      return true;
    } else
    return false;
  }

  //Returns true if the number is positive
  public static boolean isPositive(int x, int y, int z) {
    if (x > 0 && y > 0 && z > 0) {
      return true;
    } else
    return false;
  }

  //Returns true if the number is negative
  public static boolean isNegative(int x, int y, int z) {
    if (x < 0 && y < 0 && z < 0) {
      return true;
    } else
    return false;
  }

  //Returns true if two line segments, min to max, overlap with one another 
  public static boolean overlaps(int min1, int max1, int min2, int max2) {
    if (min1 <= min2 || max1 <= max2) {
      return true;
    } else
    return false;
  }

}

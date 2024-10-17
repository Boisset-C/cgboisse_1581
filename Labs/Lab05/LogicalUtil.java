package Lab05;
//Cosme Boisset - Lab05 - Problem 3: Logical Util

/*
 (API design) Java provides the basic logical operations: and (&&), or (||), exclusive-or (^), not (!). From these basic logical operators, there are often more complex forms of logical expressions that are commonly needed. You're tasked to implement a Logical Utility class for Java that includes the following API (Application Programming Interface). Utility classes are typically helper classes that contain a collection of related static methods. For example, Math is a utility class.
 */

public class LogicalUtil {

//Returns true if at least one condition is true
public static boolean thereExists(boolean p, boolean q, boolean r) {
 if (p || q || r) {
  return true;
 } else {
  return false;
 }
}

//Returns true only if all conditions are true
public static boolean forAll(boolean p, boolean q, boolean r) {
  if (p && q && r) {
    return true;
  } else {
    return false;
  }
}

//Returns true only if a majority of the conditions are true
public static boolean majority(boolean p, boolean q, boolean r) {
  if (p && q || p && r || q && r) {
    return true;
  } else {
    return false;
  }
}

public static boolean minority(boolean p, boolean q, boolean r) {
  int trueCount = 0;

  if (p) trueCount++;
  if (p) trueCount++;
  if (p) trueCount++;

  //returns true because 0 or 1 works as boolean in java
  return trueCount < 2;
}

// Returns true unless p is true and q is false. This is: p implies q 
public static boolean implies(boolean p, boolean q) {
  if (p && q) {
    return true;
  } else {
    return false;
  }
}

//Returns true unless both p,q are true and r is false. This is: p implies q implies r
public static boolean implies(boolean p, boolean q, boolean r) {
  if (p && q && r) {
    return true;
  } else {
    return false;
  }
}
  
}

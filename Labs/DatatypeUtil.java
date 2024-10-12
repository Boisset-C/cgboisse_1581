//Cosme Boisset - Lab05 - Problem 1: Datatype Util Class

/*
 (API design) Java contains several primitive data types built into the programming language. All
algorithms fundamentally rely on these types to model all possible software objects. You're tasked to create a Datatype utility class that allows a developer to get the type of data for any primitive value. Recall that Java is an extensible language, which means you can expand the programming language with new functionality by adding new classes. Utility classes are typically helper classes that contain a collection of related static methods. For example, Math is a utility class. 
 */

public class DatatypeUtil {

  public static String getType(double data) {
    return "double";
  }

   public static String getType(float data) {
    return "float";
  }

   public static String getType(int data) {
    return "int";
  }

  public static String getType(long data) {
    return "long";
  }

   public static String getType(char data) {
    return "char";
  }

   public static String getType(boolean data) {
    return "boolean";
  }

   public static String getType(String data) {
    return "String";
  }

}
package Lab05;
//Cosme Boisset - Lab05 - Problem 2: Datatype Util Class

/*
(API design) In mathematical numeral systems, the radix or base is the number of unique digits, including the digit zero, used to represent numbers in a positional numeral system. For example, in the decimal system (base 10), uses ten digits from 0 through 9. But it is not uncommon in computer science to also use base 2, base 8, base 16 numbers. You're tasked to implement a Radix Utility class for Java that includes the following API (Application Programming Interface). Recall that Java is an extensible language, which means you can expand the programming language with new functionality by adding new classes. Utility classes are typically helper classes that contain a collection of related static methods. For example, Math is a utility class. 
 */

public class RadixUtil {

  //Returns decimal integer value given a String with a binary representation
  public static int base2(String binary) {
    return Integer.parseInt(binary,2);
  }

  //Returns a String with binary representation given a decimal integer value
   public static String base2(int decimal) {
    return Integer.toBinaryString(decimal);
  }

  //Returns decimal integer value given a String with a octal representation
  public static int base8(String octal) {
    return Integer.parseInt(octal, 8);
  }

  //Returns a String with octal representation given a decimal integer value
  public static String base8(int octal) {
    return Integer.toOctalString(octal);
  }

  //Returns decimal integer value given a String with a hexadecimal representation
  public static int base16(String hexadecimal) {
    return Integer.parseInt(hexadecimal, 16);
  }

  //Returns a String with hexadecimal representation given a decimal integer value
  public static String base16(int hexadecimal) {
    return Integer.toString(hexadecimal, 16);
  }

}

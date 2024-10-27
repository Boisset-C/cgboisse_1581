//Cosme Boisset - Lab06 - Problem 1 - 6: Cooking

public class ArrayUtil {

  //Problem 1: Reverse the array
  public static String[] reverse(String[] array) {
    String[] reverseArray = new String[array.length];
    int newIndex = 0;

    for(int i = array.length - 1; i >= 0; i++) {
      reverseArray[newIndex] = array[i];
      newIndex++;
    }

    return reverseArray;
  }

  //Problem 2: resize
  public static String[] resize(String[] array) {
    int doubleLength = array.length * 2;

    String[] doubledTheSizeArray = new String[doubleLength];

    for (int i = 0; i < array.length; i++) {
      doubledTheSizeArray[i] = array[i];

    }

    return doubledTheSizeArray;
  }

  //Problem 3: add
  public static String[] add(String element, String[] array) {

    for (int i = 0; i < array.length; i++) {
      if (array[i] == null) {
        array[i] = element;
        return array;
      } 
    }

    String[] resultArray = new String[array.length * 2];


    for (int j = 0; j < array.length;j++) {
        resultArray[j] = array[j];
    }

    resultArray[array.length] = element;


    return resultArray;

  }


  //Problem 4: contains
  public static boolean contains(String element, String[] array) {
    int counter = 0;
    String[] elementArray = element.split("");
    boolean containesElement = false;

    while (counter <= array.length) {
      if (elementArray[counter].equals(array[counter]) ) {
        containesElement = true;
        counter++;
        break;
      }

    }

    return containesElement;
  }



}
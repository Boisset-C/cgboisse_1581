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
    int startFrom = 0;
    int totalArray = element.length() + array.length;
    String[] resultArray = new String[totalArray];
    String[] elementArray = element.split("");

    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(null)) {
        startFrom += i;
        break;
      }
    }

    int currentIndexElementArray = 0;

    for (int j = startFrom; j < element.length(); j++) {
      resultArray[j] = elementArray[currentIndexElementArray]; 
      currentIndexElementArray++;
    }


    return elementArray;

  }


  //Problem 4: contains
  public static boolean contains(String element, String[] array) {
    int counter = 0;
    String[] elementArray = element.split("");
    boolean containesElement = false;

    while (counter <= array.length) {
      if (elementArray[counter].equals(array[counter]) ) {
        containesElement = true;
        break;
      }

    }

    return containesElement;
  }



}
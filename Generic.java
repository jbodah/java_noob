public class Generic {
  // Generic method printArray
  public static <E> void printArray(E[] inputArray) {
    for(E element : inputArray) {
      System.out.printf("%s ", element);
    }
    System.out.println();
  }

  public static void main(String args[]) {
    Integer[] intArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
    Character[] charArray = {'h', 'e', 'l', 'l', 'o'};

    System.out.println("Array intArray: ");
    printArray(intArray);

    System.out.println("Array doubleArray: ");
    printArray(doubleArray);

    System.out.println("Array charArray: ");
    printArray(charArray);
  }
}

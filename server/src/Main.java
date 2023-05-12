public class Main {
    public static void main(String[] args) {
      int[] array = {1,2,3,4,5};
      doubleNum(array);
      for (int value: array) {
        System.out.println(value);
      }
    }

    private static void doubleNum(int[] array) {
      for (int i = 0; i < array.length; i++) {
        array[i] *= 2;
      }
    }
}
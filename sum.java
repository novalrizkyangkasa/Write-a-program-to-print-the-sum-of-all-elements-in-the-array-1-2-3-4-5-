public class Sum {
  public static void main(String[] args) {

    int[] number = new int[] { 1, 2, 3, 4, 5 };
    int sum = 0;

    for (int i = 0; i < number.length; i++) {
      sum = sum + number[i];
    }
    System.out.println("sum of all elements in the array: " + sum);
  }
}

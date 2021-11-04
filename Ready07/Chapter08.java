public class Chapter08 {
  public static void main(String[] args) {
    String border = "-------------------------------------------------";
    // while文
    int int1 = 1;
    while (int1 < 5) {
      System.out.println(int1 * int1);
      int1++;
    }
    System.out.println(border);

    // for文
    int[] int2 = {1, 4, 14, 25};
    for (int number1 = 0; number1 < int2.length; number1++) {
      System.out.println(int2[number1]);
    }

    System.out.println(border);
    // 拡張for文
    for (int number2 : int2) {
      if (number2 % 2 == 0) {
        continue;
      }
      System.out.println(number2);
    }
  }
}
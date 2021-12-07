public class Chapter08 {
  public static void main(String[] args) {
    int number = 1;
    // while文
    while (number < 5) {
      System.out.println("While = " + number);
      number++;
    }
    // for文
    int[] array = {1, 22, 36, 44};
    for (int number1 = 0; number1 < array.length; number1++) {
      System.out.println("配列の要素 = " + array[number1]);
    }
    // 拡張for文
    for (int i : array) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.println("奇数のみ出力 = " + i);
    }
  }
}
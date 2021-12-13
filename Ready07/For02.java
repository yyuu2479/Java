public class For02 {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };
    // 拡張for文(Rubyのeachっぽい)
    for (int number : array) {
      System.out.println("出力結果 = " + number);
    }
  }
}
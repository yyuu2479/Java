public class Continue01 {
  public static void main(String[] args) {
    for (int number = 0; number < 5; number++) {
      // continueは条件式が一致部分だけ飛ばして処理を再開する
      if (number == 2) {
        continue;
      }
      System.out.println("number = " + number);
    }
  }
}
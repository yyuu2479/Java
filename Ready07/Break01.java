public class Break01 {
  public static void main(String[] args) {
    for (int number = 1; number < 5; number++) {
      // breakは処理の途中で抜け出す
      if (number == 3) {
        break;
      }
      System.out.println("number = " + number);
    }
  }
}
public class Continue01 {
  public static void main(String[] args) {
    for (int number = 0; number < 5; number++) {
      if (number == 2) {
        continue;
      }
      System.out.println("number = " + number);
    }
  }
}
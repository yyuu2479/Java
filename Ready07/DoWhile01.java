public class DoWhile01 {
  public static void main(String[] args) {
    int number1 = 100;
    do {
      number1 *= 2;
      System.out.println("number1 = " + number1);
    } while (number1 < 50);
  }
}
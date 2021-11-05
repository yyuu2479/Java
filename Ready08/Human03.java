public class Human03 {
  // static変数
  static public int humanCount = 0;
  public String name;
  // 定数
  public static final String GREETING = "こんにちは";

  public Human03(String name) {
    this.name = name;
    Human03.humanCount++;
  }

  static public void staticMethodPrint() {
    System.out.println("人の数は" + Human03.humanCount);
  }

  public void instanceMethodPrint() {
    System.out.println("名前は" + name);
  }
}
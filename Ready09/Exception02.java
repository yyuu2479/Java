public class Exception02 {
  public static void main(String[] args) {
    // try-catch文の開始
    try {
      // tryブロック: 例外が発生する可能性がある処理を記述
      System.out.println("100 + 0は？");
      // ArithmeticExceptionが発生(例外)
      int result = 100 / 0;
      System.out.println("計算結果は" + result);
      // ArithmeticExceptionクラスの例外が発生した場合の例外処理
    } catch (ArithmeticException e) {
      // 例外発生時の処理(例外が発生しない限り出力されない)
      System.out.println("例外が発生");
    } finally {
      // 例外が発生しようが、しなかろうが絶対に出力
      System.out.println("プログラムが終了");
    }
  }
}
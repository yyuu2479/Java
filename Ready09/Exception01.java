public class Exception01 {
  public static void main(String[] args) {
    System.out.println("100 ÷ 0 は？");
    // ０で割算するので、例外が発生(RuntimeExceptionクラス)
    int result = 100 / 0;
    // 例外が発生した以降の処理は実行されない
    System.out.println("計算結果" + result);
    System.out.println("プログラム終了");
  }
}
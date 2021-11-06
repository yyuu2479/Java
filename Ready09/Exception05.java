// 独自の例外クラス
public class MyException extends Exception {
  // 引数なしのコンストラクタ
  public MyException() {
  }
  // エラーメッセージを受け取るコンストラクタ
  public MyException(String message) {
    super(message);
  }
  // エラーメッセージ及び発生した例外オブジェクトを受け取るコンストラクタ
  public MyException(String message, Throwable cause) {
    super(message, cause);
  }
  // エラー内容を出力するメゾット
  public void printError(String content) {
    System.out.println("エラーが発生しました;" + content);
  }
}
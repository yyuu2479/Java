public class Chapter07 {
  public static void main(String[] args) {
    // 距離を表すプログラム
    int num1 = 30;
    if (num1 <= 5){
      System.out.println("とても近いです！");
    } else if (num1 <= 10) {
      System.out.println("近いです！");
    } else if (num1 <= 15) {
      System.out.println("遠いです！");
    } else {
      System.out.println("かなり遠いです・・・");
    }
    // 信号の色を表すプログラム
    String color1 = "black";
    switch (color1) {
      case "red":
        System.out.println("赤信号です！");
        break;
      case "blue":
        System.out.println("青信号です！");
        break;
      case "yellow":
        System.out.println("黄色信号です！");
        break;
      default:
        System.out.println("信号の色ではありません・・・");
    }
  }
}

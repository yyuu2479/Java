public class premitive {
  public static void main(String[] args) {
    long number1 = 123456789423141L;
    int number2 = 54655;
    short number4 = 123;
    byte number3 = 34;
    System.out.println(number1);
    System.out.println(number2);
    System.out.println(number3);
    System.out.println(number4);

    double number5 = 1.234;
    float number6 = 1.5f;
    System.out.println(number5);
    System.out.println(number6);

    boolean boolean1 = true;
    boolean boolean2 = false;
    System.out.println(boolean1);
    System.out.println(boolean2);

    char char1 = 'あ';
    System.out.println(char1);

    String string1 = "こんにちは";
    System.out.println(string1);

    Integer integer1 = 5;
    Integer integer2 = Integer.valueOf(5);
    System.out.println(integer1);
    System.out.println(integer2);

    int int1 = integer1;
    int int2 = integer2.intValue();
    System.out.println(int1);
    System.out.println(int2);

    int[] array1 = new int[3];
    array1[0] = 10;
    array1[1] = 20;
    array1[2] = 30;
    int int3 = array1[0];
    System.out.println(int3);

    int[] array2 = { 40, 50, 60 };
    System.out.println(array2[1]);
  }
}
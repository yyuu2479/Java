public class operand {
  public static void main(String[] args) {
    int a = 15;
    int c;
    c = a + 15;
    System.out.println(c);
    c += 15;
    System.out.println(c);

    int y = 5;
    int d = y++;
    System.out.println(y);
    System.out.println(d);

    int z = 5;
    int e = ++z;
    System.out.println(z);
    System.out.println(e);

    boolean boolean1 = true;
    boolean boolean2 = false;
    boolean boolean3;

    String string1 = "100";
    String string2 = "200";
    String string3 = string1 + string2;
    System.out.println(string3);

    String apple1 = "applePie";
    String apple2 = "apple";
    String apple3 = "Pie";
    String apple_pie = apple2 + apple3;
    System.out.println(apple1 == apple_pie);
    System.out.println(apple1.equals(apple_pie));
  }
}
public class ClassMethod03 {
  public static void main(String[] args) {
    Human03 yamada = new Human03("山田");

    Human03.staticMethodPrint();

    System.out.println(Human03.GREETING);

    yamada.instanceMethodPrint();
  }
}
public class ShortIfElse {
  public static void main(String args[]) {
    int a, b;
    a = 10;
    b = (a == 1) ? 20 : 30;
    System.out.println("b = " + b);

    b = (1 == 10) ? 20 : 30;
    System.out.println("b = " + b);
  }
}

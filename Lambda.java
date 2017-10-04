public class Lambda {
  public static void main(String args[]) {
    Lambda tester = new Lambda();

    // Type decl for params
    MathOperation addition = (int a, int b) -> a + b;

    // No type decl for params
    MathOperation subtraction = (a, b) -> a - b;

    // Curlies + explicit return
    MathOperation multiplication = (int a, int b) -> { return a * b; };

    MathOperation division = (int a, int b) -> a / b;

    System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
    System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
    System.out.println("10 * 5 = " + tester.operate(10, 5, multiplication));
    System.out.println("10 / 5 = " + tester.operate(10, 5, division));

    // No parens
    GreetingService greet1 = message ->
      System.out.println("Hello " + message);

    GreetingService greet2 = (message) ->
      System.out.println("Hello " + message);

    greet1.sayMessage("Mahesh");
    greet2.sayMessage("Suresh");
  }

  interface MathOperation {
    int operation(int a, int b);
  }

  interface GreetingService {
    void sayMessage(String message);
  }

  private int operate(int a, int b, MathOperation mathOperation) {
    return mathOperation.operation(a, b);
  }
}

import java.util.List;
import java.util.ArrayList;

public class MethodRefs {
  public static void main(String args[]) {
    List<String> names = new ArrayList<String>();

    names.add("a");
    names.add("b");
    names.add("c");
    names.add("d");

    names.forEach(System.out::println);
  }
}

import java.util.*;
import java.text.*;

public class Date {
  public static void main(String args[]) {
    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
    String input = args.length == 0 ? "1818-11-11" : args[0];

    System.out.println(input + " parses as ");
    Date t;
    try {
      t = ft.parse(input);
      System.out.println(t);
    } catch (ParseException e) {
      System.out.println("Unparseable using " + ft);
    }
  }
}

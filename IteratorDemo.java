import java.io.*;

public class IteratorDemo {
  public static void main(String args[]) {
    ArrayList al = new ArrayList();

    al.add("1");
    al.add("2");
    al.add("3");
    al.add("4");

    System.out.println("contents: ");

    Iterator itr = al.Iterator();
    while(itr.hasNext()) {
      Object element = itr.next();
      System.out.println(element);
    }
  }
}

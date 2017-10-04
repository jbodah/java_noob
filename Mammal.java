package animals;

public class Mammal implements Animal {
  public void eat() {
    System.out.println("eating");
  }

  public void travel() {
    System.out.println("travel");
  }

  public int numLegs() {
    return 0;
  }

  public static void main(String args[]) {
    Mammal m = new Mammal();
    m.eat();
    m.travel();
  }
}

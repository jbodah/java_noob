# java_noob

## Differences in Java
* Classes must be marked public/private
* `.class` files are compiled for each source file
* One public class per class file
* Public member variables are directly accessible (no need to define accessors like in Ruby)
* Constructor = method with same name as class
* primitives:
  * byte, short, int, long, float, double, boolean, char
* static = class level
* final = immutable
* abstract = can't instantiate
* Access modifiers:
  * (none) - visible to package
  * private - class only
  * public - duh
  * protected - package + subclasses
* Control flow:
  * `? ... : ...` is supported
  * for `for(int i = 0; i < whatever; i++)`
  * foreach `for(int x : numbers)`
  * `while(blah)`
  * `do...while`
  * `break`/`continue`
  * `if...else`
  * `switch`
* is a...?
  * myVar instanceof String
* Inheritance:
  * `public class Car extends Vehicle`
* primitive => obj (e.g. int to Integer) == "boxing" (vice versa, "unboxing")
* No operator overloading
* Arrays are fixed ala C
* `try`/`throw`/`catch`/`finally`

## Unique bits
* `finalize()` callback is called right before GC'd
* throws must be documented in method signature: `public static void main(String args[]) throws IOException`
* Classes can be nested (inner class)
* `super` always refers to the class, not a callable function
* `final` methods can't be overridden (they are immutable)
* `MyClass implements SomeInterface`
* interfaces can extend each other
* interfaces can extend multiple interfaces
* a class can implement multiple interfaces
* `package` keyword for creating packages
* The name of the package must match the directory structure where the corresponding bytecode resides.
* `$CLASSPATH` = how packages are looked up

## Data structures
* List, Set, SortedSet, Map, Map.Entry, SortedMap, Iterator, LinkedList, ArrayList, HashSet,
LinkedHashSet, TreeSet, TreeMap, HashMap, WeakHasMap, LinkedHashMap, IdentityHashMap,
Vector, Dictionary, ...

## Generics
* `public static <E> void printArray(E[] inputArray)`
* Must specify the template type
* Only works with reference types, not primitives
* Can specify what it excepts (e.g. `public static <T extends Comparable<T>>`)
* Can make generic classes:

```java
public class Box<T> {
  private T t;

  public void add(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }
}
```

## Anonymous classes

https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html

## Anonymous functions

```
interface Safety { boolean test(); }
Safety safe = () -> true;
Safety unsafe = () -> false;

safe.test();
unsafe.test();
```

```
System.out.println("Print even nums:");
eval(list, n -> n % 2 == 0);


public static void eval(List<Integer> list, Predicate<Integer> predicate) {
  for(Integer n : list) {
    if(predicate.test(n)) {
      System.out.println(n + " ");
    }
  }
}
```

## Method refs

`names.forEach(System.out::println)`

## Default / Static interface helpers

```
public interface vehicle {
  default void print(){
    System.out.println("I am a vehicle!");
  }

  static void blowHorn(){
    System.out.println("Blowing horn!!!");
  }
}
```


## Tips
* char array => string `new String(charArray)`
* define char array `char[] helloArray = {'h', 'e', 'l', 'l', 'o'};`
* define new empty array `dataType[] arr = new dataType[size]`
* Variable number of args `doThing(String... strs)`
* fill-in types on generics to make compiler happy
* `java.util.Function` has a bunch of pre-def functional interfaces

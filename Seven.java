class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public void greet() {
    System.out.println("Hello, my name is " + name + "!");
  }
}
public class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Alice", 30);
    person1.greet();
  }
}

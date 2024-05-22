public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Jagadek", 21);

        person1.display();
    }
}

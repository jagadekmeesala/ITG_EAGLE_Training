public class MyClass {
    private int value;
    private String message;

    public MyClass() {
        this(000, "First Message");
    }
    public MyClass(int value, String message) {
        this.value = value;
        this.message = message;
    }
    public MyClass(int value) {
        this(value, "Second Message " + value);
    }
    public void display() {
        System.out.println("Value: " + value);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        obj1.display();
        MyClass obj2 = new MyClass(100);
        obj2.display();
        MyClass obj3 = new MyClass(200, "Third Message");
        obj3.display();
    }
}

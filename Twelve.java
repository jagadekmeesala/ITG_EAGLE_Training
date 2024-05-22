public class MyClass {
    private int value;

    public MyClass() {
        this.value = 1210;
    }
    public void display() {
        System.out.println("Value: " + value);
    }
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}

public class MyClass {
    private int value;
    
    public MyClass() {
        this.value = 0; 
    }
    public MyClass(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        System.out.println("Value of obj1: " + obj1.getValue());

        MyClass obj2 = new MyClass(10);
        System.out.println("Value of obj2: " + obj2.getValue());
    }
}

public class Nine
{
	public static void greet() {
        System.out.println("Hello!");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        greet();
        greet("Meesala");

        int sum = add(221, 31);
        System.out.println("Sum: " + sum);
    }
}

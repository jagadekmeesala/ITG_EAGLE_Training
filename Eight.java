public class Main
{
	public static int add(int a, int b) {
        return a + b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
    public static void main(String[] args) {
        int sum = add(5, 3);
        System.out.println("Sum = " + sum);

        double result = divide(10.0, 2.0);
        System.out.println("Division = " + result);

        String greeting = greet("Jagadek Meesala");
        System.out.println(greeting);
    }
}

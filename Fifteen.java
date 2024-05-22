public class Fibonacci {
    public static void main(String[] args) {
        int n = 1001; 
        int a = 0, b = 1;
        
        System.out.println("Fibonacci series up to " + n + ":");
        
        while (a <= n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}

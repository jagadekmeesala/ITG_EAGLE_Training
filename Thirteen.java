public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 6;
        int factorial = 1; 
        if (n <= 0){
            System.out.println("Factorial can't be calculated for Negative numbers");
        } else {
            for (int i = 1; i <= n; i ++){
                factorial = factorial * i;
            }
        }
        System.out.println(factorial);
    }
}

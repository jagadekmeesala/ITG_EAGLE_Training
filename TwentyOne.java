public class Main {
    public static void main(String args[]) {
        int n = 1234;
        int last = 0;

        last = n % 10;
        int first = 0;
        while (n >= 10) {
            n /= 10;
        }
        first = n;
        int sum = first + last;
        System.out.println(sum);
    }
}

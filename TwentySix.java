public class PerfectNumbers {
    public static void main(String[] args) {
        for (int num = 21; num <= 82194; num++) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}

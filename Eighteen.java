public class AlternateDigitSum {
    public static void main(String[] args) {
        int number = 123456;
        int sum = 0;
        boolean add = false;
        while (number != 0) {
            int digit = number % 10;
            if (add) {
                sum += digit;
            }
            add = !add;
            number /= 10;
        }
        System.out.println("The sum of alternate digits in " + number + " is: " + sum);
    }
}

public class AddEvenOddDigits {
    public static void main(String[] args) {
        int number = 123456; // Example number
        
        int evenSum = 0;
        int oddSum = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            number /= 10;
        }

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
    }
}

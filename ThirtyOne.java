public class ArmstrongNumberRange {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i))
                System.out.println(i + " is an Armstrong number.");
        }
    }
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = 0;

        while (originalNumber != 0) {
            originalNumber /= 10;
            numberOfDigits++;
        }
        originalNumber = number;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, numberOfDigits);
            originalNumber /= 10;
        }
        return sum == number;
    }
}

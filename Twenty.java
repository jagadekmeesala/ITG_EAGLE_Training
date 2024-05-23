public class Main {
    public static void main(String[] args) {
        int number = 11211; 
        if (areAllDigitsEqual(number)) {
            System.out.println("All digits in the number are equal.");
        } else {
            System.out.println("Not all digits in the number are equal.");
        }
    }

    public static boolean areAllDigitsEqual(int number) {
        int lastDigit = number % 10;
        while (number > 0) {
            int digit = number % 10;
            if (digit != lastDigit) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}

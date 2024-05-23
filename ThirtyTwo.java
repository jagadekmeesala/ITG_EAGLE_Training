public class SmallestNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 8;

        int small = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);

        System.out.println(small);
    }
}

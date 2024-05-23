public class AlternateDigitSum {
    public static void main(String[] args) {
        int n = 66667;
        int digit = 6;
        int count = 0;
        while(n !=  0){
            int lastdigit = (n%10);
            if (lastdigit == digit){
                count++;
            }
        n = n/10;
        }
        System.out.println(count);
    }
}

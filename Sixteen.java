public class LargestNumber{
    public static void main(String[] args) {
        int n = 299917;
        int largest = 0;
        while(n!=0){
            int r = n % 10;
            largest = Math.max(r, largest);
            n = n/10;
        }
        System.out.println(largest);
    }
}

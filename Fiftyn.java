public class Pattern{
    public static void main(String args[]){
        int n = 6;
        char A = 'A';
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(A + j-1) + " ");
            }
            System.out.println(); 
        }
    }
}

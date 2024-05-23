public class Pattern{
    public static void main(String args[]){
        int c = 1;
        int n = 5;
        for (int i = 5; i >= n-i*4; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
    }
}

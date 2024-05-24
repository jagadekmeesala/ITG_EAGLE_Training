public class Main{
    public static void main(String args[]){
        double i, s = 0.0;
        int n = 5;
        for (i =1; i<=n; i++){
            double A = Math.pow(2,i-1);
            s = s + (1/A);
        }
        System.out.println(s);
    }
}

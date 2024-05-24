public class GetFact{
    public static int factorial(int n){
        int fac = 1;
        for (int i =1; i<n; i++){
            fac = fac * i;
        }
        return fac;
    }
}
public class Main{
    public static void main(String args[]){
        int n = 5;
        int p = 0;
        for (i =0; i<=n; i++){
            p = p + (1/GetFact.factorial(i));
        }
        System.out.println(p);
    }
}

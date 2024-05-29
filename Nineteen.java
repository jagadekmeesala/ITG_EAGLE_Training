public class Main {
  public static void main(String[] args) {
    String s = "IamIronMan";
    char [] car = s.toCharArray();
    int len =s.length();
    int mid = len/2;
    for (int i =0; i<mid;i++){
        char temp = car[i];
        car [i] = car[len-1-i];
        car[len-1-i] = temp;
        
    }
        String reverse = new String (car);
        for(char rev : reverse.toCharArray()){
            System.out.println(rev);
        }
  }
}

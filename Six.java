public class Main{
  public static void main (String[] args) 
  {
    String res = " ";
    String str = "Let me welcome you to the Miracle";
    
    String[] words = str.split(" ");
    for(String w : words) {
      res += w.substring(0, 1).toUpperCase() + w.substring(1) + " " ;
    }
    System.out.println("Converted String is :" + res);
  }
}

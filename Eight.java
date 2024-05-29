public class Main {
  public static void main(String[] args) {
    String s = "Jagadek Meesala";
    int length = 0;
    for (char charArray : s.toCharArray()) {
      length++; 
    }
    System.out.println("String length: " + length);
  }
}

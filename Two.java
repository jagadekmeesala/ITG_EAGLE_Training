public class Main {
  public static void main(String[] args) {
    String s = "Hello World!";
    int length = 0;
    for (char c : s.toCharArray()) {
      length++; 
    }
    
    char[] charArray = s.toCharArray();
    int clen = charArray.length;
    int middle = charArray.length / 2;
    for (int i = 0; i < middle; i++) {
      char temp = charArray[i];
      charArray[i] = charArray[clen - 1 - i];
      charArray[clen - 1 - i] = temp;
    }
    String reversedString = new String(charArray); 
    System.out.println("Original string length: " + length);
    System.out.println("Reversed string: " + reversedString);
  }
}

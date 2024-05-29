public class Main {

  public static void main(String[] args) {
    String s = "Hello all this is a 1234569!&*^ in a life of $%#**";
    int wordCount= 0;
    int vowelCount = 0;
    int consonantCount = 0;
    int numberCount = 0;
    int specialCharCount = 0;
      
    boolean inWord = false;
    for (char ch : s.toCharArray()) {
      if (Character.isLetter(ch)) {
        inWord = true;
          wordCount++;
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
          vowelCount++;
        } 
        else {
          consonantCount++;
        }
      } 
      else if (Character.isDigit(ch)) {
        numberCount++;
      } 
      else if (!Character.isWhitespace(ch)) {  
        specialCharCount++;
      } 
      else {
        inWord = false;
        if (inWord) { 
          wordCount++;
        }
      }
    }
    System.out.println("Word count: " + wordCount);
    System.out.println("Vowel count: " + vowelCount);
    System.out.println("Consonant count: " + consonantCount);
    System.out.println("Number count: " + numberCount);
    System.out.println("Special character count: " + specialCharCount);
  }
}

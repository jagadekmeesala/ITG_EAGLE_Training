public class Main {

  public static void main(String[] args) {
    String s = "H1A@";
    int wordCount= 0;
    int vowelCount = 0;
    int consonantCount = 0;
      
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
  }
}

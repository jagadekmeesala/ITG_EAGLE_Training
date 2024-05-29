import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String text = "@! 12 wer"; 
    String withoutSpaces = " ";
    String lettersOnly = " ";

    for (char ch : text.toCharArray()) {
      if (ch != ' ') {
        withoutSpaces += ch;
      }
    }
    for (char ch : withoutSpaces.toCharArray()) {
      if (Character.isLetter(ch)) {
        lettersOnly += ch;
      }
    }

    System.out.println("Original String: " + text);
    System.out.println("String without spaces: " + withoutSpaces);
    System.out.println("String with only letters: " + lettersOnly);
  }
}

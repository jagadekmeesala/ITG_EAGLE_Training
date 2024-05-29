public class Main {
  public static void main(String[] args) {
    String s = "Hellooo1! Worldoo9i";
    char remove = 'o';
    String result = removeChar(s, remove);
    System.out.println(result);
  }

  public static String removeChar(String s, char remove) {
    StringBuilder newString = new StringBuilder();
    for (char ch : s.toCharArray()) {
      if (ch != remove) {
        newString.append(ch);
      }
    }
    return newString.toString();
  }
}

public class Main{

  public static void main(String[] args) {
    String text = "This is a string with an old substring.";
    String oldSubstr = "Amazon";
    String newSubstr = "new";

    if (text.contains(oldSubstr)) {
      String replacedText = text.replace(oldSubstr, newSubstr);
      System.out.println("Replaced substring from '" + text + "' with '" + newSubstr + "' Result is - '" + replacedText + "'");
    } else {
      System.out.println("The old substring '" + oldSubstr + "' is not found in the given string '" + text + "'");
    }
  }
}

public class Main {
    public static void main(String[] args) {
    String text = "I want to be in the leadership position at Miracle"; 
    String searchWord = "Amazing";

    if (text.contains(searchWord)) {
      System.out.println("The word '" + searchWord + "' is found in the string.");
    } else {
      System.out.println("The word '" + searchWord + "' is not found in the string.");
    }
  }
}

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    String text = "B A D C E F I Z"; 
    char[] arr = text.toLowerCase().toCharArray();
    Arrays.sort(arr);
    String sortedString = new String(arr);

    StringBuilder reversedString = new StringBuilder();
    for (int i = arr.length-1; i >= 0; i--) {
      reversedString.append(arr[i]);
    }

    System.out.println("Alphabetical Order: " + sortedString);
    System.out.println("Reverse Alphabetical Order: " + reversedString);
  }
}

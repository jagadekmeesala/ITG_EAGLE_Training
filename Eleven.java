import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    String[ ] names = {"AII", "Boo", "Cha", "Danush", "Alex", "Meraj", "Michigan"};
    String[ ] prefixes = {"AI", "Be", "Ch", "Da", "Me", "Mi"};

    for (String name : names) {
      for (String prefix : prefixes) {
        if (name.startsWith(prefix)) {
          System.out.println("Name with prefix: " + prefix + " is " + name);
        }
      }
    }
  }
}

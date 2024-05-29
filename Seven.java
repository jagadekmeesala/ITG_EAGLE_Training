public class Main {
  public static void main(String[] args) {
    String s1 = "Hello Ram!";
    String s2 = "Hello Ran!";
    String s3 = s1.toLowerCase();
    String s4 = s2.toLowerCase();
    int A = s3.length();
    int B = s4.length();
    if (A != B) {
      System.out.println("Both strings are not the same and have different lengths");
    } else {
      boolean areSame = true;
      for (int i = 0; i < A; i++) {
        if (s3.charAt(i) != s4.charAt(i)) {
          areSame = false;
          break;
        }
      }
      if (areSame) {
        System.out.println("Both strings are same");
      } else {
        System.out.println("Both strings are not same");
      }
    }
  }
}

public class Main {

        public static void main(String[] args) {
            String text = "All hail the hall of hollow 12221!@@#....";
            int[] charCounts = new int[256]; 
            for (char ch : text.toCharArray()) {
                charCounts[ch]++;
            }
            for (int i = 0; i < charCounts.length; i++) {
                if (charCounts[i] > 0) {
                    System.out.println((char) i + ": " + charCounts[i]);
                }
            }
        }
    }
    

import java.util.Arrays;

public class Frequency {

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] frequencies = new int[arr.length];
        Arrays.fill(frequencies, -1);

        for (int i = 0; i < arr.length; i++) {
            if (frequencies[i] != 0) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        frequencies[j] = 0;
                    }
                }
                frequencies[i] = count;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (frequencies[i] != 0) {
                System.out.println(arr[i] + "    |    " + frequencies[i]);
            }
        }
    }
}

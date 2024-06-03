import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Fiss {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream("/home/miracle/Desktop/am.ml");
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
        fis.close();
    }
}

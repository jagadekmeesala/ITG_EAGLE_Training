import java.io.FileInputStream;
import java.io.IOException;

public class Readlarg {

public static void main(String[] args) throws IOException {
FileInputStream ip = new FileInputStream("/home/miracle/Desktop/xy.java");
int i;
while ((i = ip.read()) != -1) {
System.out.print((char) i);
}
System.out.println("\nRead Successfully using FIS");
ip.close(); 

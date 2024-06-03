import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropRead 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream fi = new FileInputStream("example.properties");
        Properties prop = new Properties();
        prop.load(fi);
        System.out.println("Value of Key1 is : " + prop.getProperty("key1"));
        System.out.println("Value of Key2 is : " + prop.getProperty("Key2"));
    }    
}

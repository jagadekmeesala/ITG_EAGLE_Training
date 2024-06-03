import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropWrite 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileOutputStream fo = new FileOutputStream("example.properties");
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");   
        properties.store(fo, "Saved" );
    }
}

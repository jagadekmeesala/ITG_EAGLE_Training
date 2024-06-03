import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileReader fr = new FileReader("java.txt");
        BufferedReader br = new BufferedReader(fr);
        int line_num = 3, cl = 1;
        String line;
        while ((line = br.readLine()) != null) 
        {
            if (cl == line_num) 
            {
                System.out.println("Line " + line + ": " + line);
                break;
            }
            cl++;
        }
        br.close();
        fr.close();
    }    
}

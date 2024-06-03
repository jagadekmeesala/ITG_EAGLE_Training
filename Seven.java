import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lines 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileReader fr = new FileReader("java.txt");   
        BufferedReader br = new BufferedReader(fr);
        int lines = 0;
        while (br.readLine() != null) 
            lines ++;
        System.out.println("Total lines in the file are :" + lines);
        fr.close();
        br.close();
    }    
}

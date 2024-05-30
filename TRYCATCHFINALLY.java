import java.util.Scanner;
public class Main
{
    public static void main(String ar[])
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        try 
        {
            c=a/b;
            System.out.println(c);
        } 
        catch(ArithmeticException e) 
        {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
    }
}




import java.util.Scanner;
class Main
{
    public static void main(String ar[])
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        String ss=null;

        try 
        {
            c=a/b;
            System.out.println(ss.length());
            System.out.println(c);
        } 
        catch( ArithmeticException | NullPointerException e) 
        {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
    }
}




import java.util.Scanner;
class Main
{
    public static void main(String ar[])
    {
        int a[] = new int[6];
        try 
        {
            a[6]=100;
            System.out.println("Value updated!");
        } 
        catch( ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) 
        {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
        finally
        {
            System.out.println("Done handling the exception.");
        }
    }
}

class Main
{
    public static void main(String ar[])
    {
        String s="Hello";
        try 
        {
            for(int i=0;i<=s.length();i++)
                System.out.print(s.charAt(i)+"   ");
        } 
        catch( ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException | StringIndexOutOfBoundsException e) 
        {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
        finally
        {
            System.out.println("Done handling the exception.");
        }
    }
}




import java.util.Scanner;
class Main
{
    public static void main(String ar[])
    {
        String s="Hi";
        try 
        {
            int n=Integer.valueOf(s);
            System.out.print(n);
        } 
        catch( ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException | StringIndexOutOfBoundsException | NumberFormatException e) 
        {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
        finally
        {
            System.out.println("Done handling the exception.");
        }
    }
}

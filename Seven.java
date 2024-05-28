public class CompareString{
     public static void main(String []args){
         String s1 = "I am a Human";
         String s2 = new String ("I am a Human");
         String s3 = "I am an Human";
         String s4 = "I am a Human";
         System.out.println(s1.equals(s2));
         System.out.println(s1.equals(s3));
         System.out.println(s1.equals(s4));
         System.out.println(s2.equals(s3));
         System.out.println(s2.equals(s4));
         System.out.println(s3.equals(s4));
         System.out.println(s1==s2);
         System.out.println(s1==s3);
         System.out.println(s1==s4);
         System.out.println(s2==s3);
         System.out.println(s2==s4);
         System.out.println(s3==s4);
     }
}

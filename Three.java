public class Main{
    public static void main(String args[]){
        String s = "AmazoonRainForestsinFlipkartsssozmz";
        s = s.toLowerCase();
        char ch[] = s.toCharArray();
        char ch1 = '\0';
        char ch2 = '\0';
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0; i<s.length(); i++){
            int count =1;
            if(ch[i] != '\0'){
                for(int j =i+1; j<s.length(); j++){
                if(ch[i] == ch[j]){
                    count++;
                    ch[j]= '\0';
                }
            }
            if(count>max){
                max=count;
                ch1 =ch[i];
            }
            if(count<min){
                min = count;
                ch2 = ch[i];
            }
            }
        }
        System.out.println("Max repeated word is   " + ch1 + "  " + max);
        System.out.println("Min repeated word is    " + ch2 + "  " + min);
    }
}

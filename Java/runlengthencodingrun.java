import java.util.Scanner;

public class runlengthencodingrun {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String mode = sc.next();
         String sentence = sc.next();
         String res;
         if(mode.equals("E")){
            res = encode(sentence);
         }
         else{
            res = decode(sentence);
         }
         System.out.println(res);
    }

    static String encode(String msg){
        char prev = msg.charAt(0);
        String result = "" ;
        int count = 1;
        for(int i=1;i<msg.length();i++){
            char cur = msg.charAt(i);
            if(cur==prev){
                count++;
            }
            else{
                result+=prev;
                result+=count;
                count = 1;
                prev = cur;
            }
           
        }
        result+=prev+Integer.toString(count);
        return result;
    }

    static String decode(String msg){
        String result = "";
        for(int i=0;i<msg.length();i+=2){
            char c = msg.charAt(i);
            char n = msg.charAt(i+1);
            int num = Character.getNumericValue(n);
            for(int j=0;j<num;j++){
                result+=c;
            }
        }
        return result;
    }
}

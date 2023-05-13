import java.util.*;

public class secretmessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            String n = sc.next();
            String padded = pad(n);
            int l = padded.length();
            int a = (int)Math.sqrt(l);
            char[][] table = new char[a][a];
            int count = 0;
            for(int j=0;j<a;j++){
                for(int k=0;k<a;k++){
                    table[j][k] = padded.charAt(count);
                    count++;
                }
            }
            for(int j=0;j<a;j++){
                for(int k=a-1;k>=0;k--){
                    char c = table[k][j];
                    if(c!='*'){
                        System.out.print(c);
                    }
                }
            }
            System.out.println();
        }
    }
    static String pad(String sentence){
        int l = sentence.length();
        int L = l;
        while(true){
            int s = (int)Math.sqrt(l);
            if(s*s!=l){
                l++;
            }
            else{
                break;
            }
        }
        
        for(int i=0;i<l-L;i++){
            char a = '*';
            sentence+=a;
        }
        return sentence;
    }
}

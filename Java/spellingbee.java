import java.util.HashSet;
import java.util.Scanner;

public class spellingbee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<word.length();i++){
            set.add(word.charAt(i));
        }
        char c = word.charAt(0);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            String dict = sc.next();
            boolean cor = true;
            boolean center = false;

            
            for(int j=0;j<dict.length();j++){
                if(!set.contains(dict.charAt(j))){
                    cor = false;
                    break;
                }
                if(dict.charAt(j)==c){
                    center = true;
                }
            }
            if(cor && dict.length()>=4 && center){
                System.out.println(dict);
            }
        }
    }
}

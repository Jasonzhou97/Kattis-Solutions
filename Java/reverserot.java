import java.util.ArrayList;
import java.util.Scanner;

public class reverserot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encoding = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
        ArrayList<Character> array = new ArrayList<>();

        for(int i=0;i<encoding.length();i++){
            array.add(encoding.charAt(i));
        }
        //start looping through input 
        while(true){
            int N = sc.nextInt();
            if(N==0){
                break;
            }
            String word1 = sc.next();
            StringBuilder reversedString = new StringBuilder(word1).reverse();
            String word = reversedString.toString();
            for(int i=0;i<word.length();i++){
                char c = word.charAt(i);
                int index = array.indexOf(c);
                int newIndex = (index+N)%(array.size());
                char newC = array.get(newIndex);
                System.out.print(newC);
            }
            System.out.println();
        }
    }
}

import java.util.HashSet;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String guess = sc.next();

        HashSet<Character> set = new HashSet<>();
        char[] wordArr = word.toCharArray();
        for(int i=0;i<word.length();i++){
            char alphabet = wordArr[i];
            if(!set.contains(alphabet)){
                set.add(alphabet);
            }
        }
        char[] guessArr = guess.toCharArray();
        int count = 0;
        int hang = 0;
        int length = set.size();
        for(int i=0;i<guess.length();i++){
            char alp = guessArr[i];
            if(set.contains(alp)){
                count++;
            }
            else{
                hang++;
            }
            if(hang>=10){
                System.out.println("LOSE");
                break;
            }
            if(count==length){
                System.out.println("WIN");
                break;
            }
            
        }

    }
}

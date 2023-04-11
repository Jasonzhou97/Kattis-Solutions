import java.util.Scanner;

public class tripletexting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.next();
        //get length of each word
        int wordLength = sentence.length()/3;
        //get input of each word
        String word1 = sentence.substring(0, wordLength);
        String word2 = sentence.substring(wordLength, 2 * wordLength);
        String word3 = sentence.substring(2 * wordLength, 3 * wordLength);
        
        if(word1.equals(word3)&&word2.equals(word3)){
            System.out.println(word1);
        }
        else{
            if(word1.equals(word2)){
                System.out.println(word1);
            }
            else if(word2.equals(word3)){
                System.out.println(word2);
            }
            else if(word1.equals(word3)){
                {
                    System.out.println(word1);
                }
            }
        }
    }
}

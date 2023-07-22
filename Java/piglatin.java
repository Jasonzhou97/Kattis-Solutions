import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class piglatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        while(sc.hasNextLine()){
            String[] arr = sc.nextLine().split(" ");
            ArrayList<String> latin = new ArrayList<>();

            for(String word:arr){
                String w = "";
                if(vowels.contains(word.charAt(0))){
                    w+=word;
                    w+="yay";
                }
                else{
                    String segment = "";

                    for(int i=0;i<word.length();i++){
                        if(!vowels.contains(word.charAt(i))){
                            segment+=word.charAt(i);
                        }
                        else{
                            w+=word.substring(i);
                            w+=segment;
                            w+="ay";
                            break;
                        }
                    }
                }
             latin.add(w);
            }
            for(String result:latin){
                System.out.print(result+" ");
            }
            System.out.println();

        }
    }
}

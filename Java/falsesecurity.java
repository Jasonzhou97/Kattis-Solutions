import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class falsesecurity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, String> morseCodeMap = new HashMap<>();

        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");
        morseCodeMap.put('_', "..--");
        morseCodeMap.put('.', "---.");
        morseCodeMap.put(',', ".-.-");
        morseCodeMap.put('?', "----");
         
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            ArrayList<Character> arr = new ArrayList<>();
            ArrayList<Integer> sequence = new ArrayList<>();
            for(int i=0;i<line.length();i++){
                char c = line.charAt(i);
                char[] code = morseCodeMap.get(c).toCharArray();
                for(char k:code){
                    arr.add(k);
                }
                sequence.add(code.length);
            }
            Collections.reverse(sequence);
            int prev = 0;
            String result = "";
            for(int num:sequence){
                ArrayList<Character> sublist = new ArrayList<>(arr.subList(prev, num + prev));
                prev = num+prev;
                String word = "";
                for(char c:sublist){
                    word+=c;
                }

                for(char c:morseCodeMap.keySet()){
                    if(word.equals(morseCodeMap.get(c))){
                        result+=c;
                    }
                }

            }
            System.out.println(result);
        }
    }
}

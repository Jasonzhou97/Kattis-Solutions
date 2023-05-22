import java.util.*;

public class marko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, ArrayList<Character>> t9InputTable = new HashMap<>();
        // Populate the T9 input table
        t9InputTable.put('2', new ArrayList<>(List.of('a', 'b', 'c')));
        t9InputTable.put('3', new ArrayList<>(List.of('d', 'e', 'f')));
        t9InputTable.put('4', new ArrayList<>(List.of('g', 'h', 'i')));
        t9InputTable.put('5', new ArrayList<>(List.of('j', 'k', 'l')));
        t9InputTable.put('6', new ArrayList<>(List.of('m', 'n', 'o')));
        t9InputTable.put('7', new ArrayList<>(List.of('p', 'q', 'r', 's')));
        t9InputTable.put('8', new ArrayList<>(List.of('t', 'u', 'v')));
        t9InputTable.put('9', new ArrayList<>(List.of('w', 'x', 'y', 'z')));


        int N = sc.nextInt();
        String[] arr = new String[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.next();
        }
       String S = sc.next();
       char[] num = S.toCharArray();
       int count = 0;
       for(String word:arr){
        if(word.length()!=num.length){
            continue;
        }
        boolean correct = true;
        for(int i=0;i<word.length();i++){
            char c = num[i];
            char w = word.charAt(i);
            ArrayList<Character> input = t9InputTable.get(c);
            if(!input.contains(w)){
                correct = false;
                break;
            }
        }
        if(correct){
            count++;
        }
        
       }
       System.out.println(count);
    }
}

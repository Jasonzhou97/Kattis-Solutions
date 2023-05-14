import java.util.*;

public class quickbrownfox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++){
            HashMap<Character, Integer> alphabets = new HashMap<>();
            
            for (char c = 'a'; c <= 'z'; c++) {
                alphabets.put(c, 0);
            }
            
            String sentence = sc.nextLine();
            char[] arr = sentence.toCharArray();
            for(char c:arr){
                if(Character.isLetter(c)){
                    char C = Character.toLowerCase(c);
                    int v = alphabets.get(C);
                    alphabets.put(C,v+1);
                }
            }
            ArrayList<Character> ls = new ArrayList<>();
            for(char c:alphabets.keySet()){
                
                if(alphabets.get(c)==0){
                    ls.add(c);
                }
            }
            if(ls.isEmpty()){
                System.out.println("pangram");
            }
            else{
                System.out.print("missing ");
                for(char c:ls){
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }
}

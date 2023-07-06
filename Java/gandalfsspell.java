import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class gandalfsspell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order = sc.nextLine();

        HashMap<String,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        String[] line = sc.nextLine().split(" ");
        int i=0;
        if(order.length()!=line.length){
            System.out.println("False");
            return;
        }

        for(String word:line){
            char c = order.charAt(i);
            if(map.containsKey(word)){
                if(c!=map.get(word)){
                    System.out.println("False");
                    return;
                }
            }
            else{
                if(set.contains(c)){
                    System.out.println("False");
                    return;
                }
                set.add(c);
                map.put(word, c);
            }
            i++;
        }
        System.out.println("True");
    }

}

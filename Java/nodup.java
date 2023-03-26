import java.util.*;

public class nodup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        boolean repeat = false;
        Set<String> set = new HashSet<String>();
        for(String word:words){
            if(set.contains(word)){
                repeat = true;
                break;
            }
            else{
                set.add(word);
            }
        }
        if(repeat){
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
    }
}

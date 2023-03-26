import java.util.*;

public class magictrick  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Set<Character> set = new HashSet<Character>();
        boolean y = true;
        for(char c:word.toCharArray()){
            if(set.contains(c)){
                System.out.println(0);
                y = false;
                break;
            }
            else{
                set.add(c);
            }
        }
        if(y){
            System.out.println(1);
        }
    }


}

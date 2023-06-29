import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class thegrandadventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        HashMap<Character,Character> map = new HashMap<>();
        map.put('t', '|');
        map.put('b', '$');
        map.put('j', '*');
        sc.nextLine();
        for(int i=0;i<N;i++){
            boolean failed = false;
            char[] array = sc.nextLine().toCharArray();
            Stack<Character> stack = new Stack<>();
            for(char c:array){
                if(c=='.'){
                    continue;
                }
                if(map.keySet().contains(c) && !stack.isEmpty()){
                    char item = stack.pop();
                    if(item!=map.get(c)){
                        System.out.println("NO");
                        failed = true;
                        break;
                    }
                }
                else{
                    stack.push(c);
                }
            }
            if(!failed){
                if(stack.isEmpty()){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}

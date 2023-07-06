import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class delimitersoup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();

        HashMap<String,String> map = new HashMap<>();
        map.put("(", ")");
        map.put("[", "]");
        map.put("{", "}");

        Stack<String> stack = new Stack<>();
        boolean correct = true;

        sc.nextLine();
        String line = sc.nextLine();

        for(int i=0;i<L;i++){
            char P = line.charAt(i);
            String p = String.valueOf(P);
            if(p.equals(" ")){
                continue;
            }
            if(map.keySet().contains(p)){
                stack.push(p);
            }
            else{
                if(stack.isEmpty()){
                    System.out.print(p+" "+(i));
                    correct = false;
                    break;
                }
                else{
                    String c = stack.pop();
                    String o = map.get(c);
                    if(!o.equals(p)){
                        System.out.print(p+" "+(i));
                        correct = false;
                        break;
                    }
                }
            }
        }
        if(correct){
            System.out.println("ok so far");
        }
    }
}

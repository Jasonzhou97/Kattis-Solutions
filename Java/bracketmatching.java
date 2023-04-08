import java.util.*;

public class bracketmatching {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();
        Map<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');
        ArrayList<Character> list = new ArrayList<>();
        boolean first = false;
        for(int i=0;i<input.length();i++){
            char bracket = input.charAt(i);
            if(map.values().contains(bracket)){
                list.add(bracket);
            }
            else{
                if(i==0){
                    first = true;
                    break;
                }
                char last = list.get(list.size()-1);
                if(map.get(bracket)!=last){
                    break;
                }
                else{
                    list.remove(list.size()-1);
                }
            }
        }
        if(first){
            System.out.println("Invalid");
        }
        else if(list.isEmpty()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}

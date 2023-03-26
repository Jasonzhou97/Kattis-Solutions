import java.util.ArrayList;
import java.util.Scanner;

public class smil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] array = input.toCharArray();

        ArrayList<Character> stack = new ArrayList<>();
        ArrayList<Integer> sum = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            char c = array[i];
            if(c==':'||c==';'){
                if(!stack.isEmpty()){
                    stack.clear();
                    stack.add(c);
                }
                else{
                    stack.add(c);
                }
            }
            else if(c=='-'){
                if(!stack.isEmpty()){
                    if(stack.get(0)==':'|| stack.get(0)==';'){
                        stack.add(c);
                    }
                }
            }
            else if(c==')'){
                if(!stack.isEmpty()){
                    if(stack.get(0)==':'|| stack.get(0)==';'){
                        if (stack.size() >= 2) {
                            // Check if element exists at index 2
                            if (stack.get(1) != null) {
                                // Element exists at index 2
                                if(stack.get(1)=='-'){
                                    sum.add(i-2);
                                }
                            }
                        }
                        else{
                            sum.add(i-1);
                        }
                        stack.clear();
                    }
                }
            }
            else{
                stack.clear();
            }
        }
        for(int i=0;i<sum.size();i++){
            int j = sum.get(i);
            System.out.println(j);
        }
    }
    
}

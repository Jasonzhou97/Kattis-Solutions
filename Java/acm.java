import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class acm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,ArrayList<Integer>> initial = new HashMap<>();
        HashMap<String,ArrayList<Integer>> result = new HashMap<>();
        while(true){
            int N = sc.nextInt();
            if(N==-1){
                break;
            }
            String qn = sc.next();
            String ans = sc.next();
            
            if(initial.keySet().contains(qn)){
                if(ans.equals("right")){
                    ArrayList<Integer> arr = initial.get(qn);
                    arr.add(N);
                    result.put(qn, arr);
                }
                else{
                    ArrayList<Integer> arr = initial.get(qn);
                    arr.add(20);
                    initial.put(qn, arr);
                }
            }
            else{
                if(ans.equals("right")){
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(N);
                    result.put(qn, arr);
                }
                else{
                    ArrayList<Integer> arr = new ArrayList<>();
                    arr.add(20);
                    initial.put(qn, arr);
                }
            }
        }
        int total = 0;
        int count = 0;
        for(String key : result.keySet()){
            count++;
            ArrayList<Integer> arr = result.get(key);
            for(int ans:arr){
                total+=ans;
            }
        }
        System.out.println(count+" "+total);
    }
    
}

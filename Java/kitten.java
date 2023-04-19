import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class kitten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.nextLine();
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

        //loop through input
        while(true){
            String line = sc.nextLine();
            String[] arr = line.split(" ");
            //check for last line
            if(arr[0].equals("-1")){
                break;
            }
            int a = Integer.parseInt(arr[0]);
            ArrayList<Integer> branches = new ArrayList<>();
            for(int i=1;i<arr.length;i++){
                branches.add(Integer.parseInt(arr[i]));
            }
            map.put(a, branches);

        }

        System.out.print(K+" ");
        
        //search for branches
        while(true){
            boolean found = false;
            for(int branch:map.keySet()){
                if(map.get(branch).contains(K)){
                    System.out.print(branch+" ");
                    K = branch;
                    found = true;
                }
            }
            //if it reached the ground
            if(!found){
                break;
            }
        }
    }
}

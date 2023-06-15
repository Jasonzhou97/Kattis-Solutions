import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

//not complete
public class kafkaesque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        int K = sc.nextInt();
        for(int i=0;i<K;i++){
            int num = sc.nextInt();
            map.put(num,i+1);
            arr.add(num);
        }
        Collections.sort(arr);

        int count = 0;
        ArrayList<Integer> rem = new ArrayList<>();

        while(rem.size()!=arr.size()){


                for(int i = 0;i<arr.size()-1;i++){
                    int n1 = arr.get(i);
                    int n2 = arr.get(i+1);
                    int p1 = map.get(n1);
                    int p2 = map.get(n2);
                    if(!rem.contains(p1)){
                        if(p2>p1){

                            rem.add(p1);                 
                            rem.add(p2);
                            
    
                        }
                        else{
                            rem.add(p2);
                        }
                    }

                }
                count++;
    

 
        }
        System.out.println(count);

    }
}

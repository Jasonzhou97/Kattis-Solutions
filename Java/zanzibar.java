import java.util.Scanner;
import java.util.ArrayList;

public class zanzibar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            int turtles = 0;
            ArrayList<Integer> nums = new ArrayList<>();
            while (true){
                int num = sc.nextInt();
                if (num==0){
                    break;
                }
                else{
                    nums.add(num);
                }
                

            }
            for(int j=0;j<nums.size()-1;j++){
                if(nums.get(j+1)>nums.get(j)*2){
                    turtles+=(nums.get(j+1)-(nums.get(j)*2));
                } 
            }
            System.out.println(turtles);
        }
        
        sc.close();
    }
}



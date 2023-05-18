import java.util.ArrayList;
import java.util.Scanner;

public class patuljci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int total = 0;
        for(int i=0;i<9;i++){
            int n =sc.nextInt();
            nums.add(n);
            total+=n;
        }
        //find the sum of the 2 impostor nums
        int diff = total-100;
        //find the new array with the 2 nums removed
        ArrayList<Integer> ans = twosum(nums, diff);
        for(int num:ans){
            System.out.println(num);
        }
    }
    static ArrayList<Integer> twosum(ArrayList<Integer> arr,int target){
        int n1 = 0;
        int n2 = 0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                int num1 = arr.get(i);
                int num2 = arr.get(j);
                if(num1+num2==target){
                    n1 = num1;
                    n2 = num2;
                }
            }
        }
        arr.remove(arr.indexOf(n1));
        arr.remove(arr.indexOf(n2));
        return arr;
    }
}

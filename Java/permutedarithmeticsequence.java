import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class permutedarithmeticsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int m = sc.nextInt();
            int[] arr = new int[m];


            for(int j=0;j<m;j++){
                int cur = sc.nextInt();
                arr[j] = cur;
            }

            int diff = arr[1] - arr[0];
            boolean constant = true;
            for(int j=2;j<m;j++){
                if(diff!=arr[j]-arr[j-1]){
                    constant = false;
                    break;
                }
            }
            if(constant){
                System.out.println("arithmetic");
                continue;
            }
            Arrays.sort(arr);
            diff = arr[1] - arr[0];
            boolean c = true;
            for(int j=2;j<m;j++){
                if(diff!=arr[j]-arr[j-1]){
                    c = false;
                    break;
                }
            }
            if(c){
                System.out.println("permuted arithmetic");
            }
            else{
                System.out.println("non-arithmetic");
            }

        }
    }
}

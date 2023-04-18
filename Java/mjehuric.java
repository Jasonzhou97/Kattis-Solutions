import java.util.Scanner;
import java.util.Arrays;

public class mjehuric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] correctArr = {1, 2, 3, 4, 5};
        for(int i=0;i<5;i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        
        while(!Arrays.equals(arr, correctArr)){
            for(int i=0;i<4;i++){
                int first = arr[i];
                int second = arr[i+1];
                if(first>second){
                    int temp = first;
                    arr[i] = second;
                    arr[i+1] = temp;
                    for(int j=0;j<arr.length;j++){
                        System.out.print(arr[j]+" ");
                    }
                    System.out.println();
                }
            }

        }
    }
}

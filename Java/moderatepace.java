import java.util.ArrayList;
import java.util.Scanner;

public class moderatepace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[3][n];
        for(int i=0;i<3;i++){
            for(int j=0;j<n;j++){
                int distance = sc.nextInt();
                arr[i][j] = distance;
            }
        }
        for(int i=0;i<n;i++){
        int a = arr[0][i];
        int b = arr[1][i];
        int c = arr[2][i];
        if (a >= b && a <= c || a <= b && a >= c) {
            System.out.print(a+" ");
        } else if (b >= a && b <= c || b <= a && b >= c) {
            System.out.print(b+" ");
        } else {
            System.out.print(c+" ");
        }
    }
}
}

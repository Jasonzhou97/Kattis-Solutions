import java.util.Arrays;
import java.util.Scanner;

public class shopaholic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        long discount = 0;
        for (int i = n - 1; i >= 0; i -= 3) {
            if (i - 2 < 0) {
                break;
            }
            discount += arr[i - 2];
        }
        System.out.println(discount);
    }
}

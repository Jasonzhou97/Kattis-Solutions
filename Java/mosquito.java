import java.util.Scanner;

public class mosquito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while (sc.hasNextLine()) {
            if (sc.hasNextInt()) {
                int M = sc.nextInt();
                int P = sc.nextInt();
                int L = sc.nextInt();
                int E = sc.nextInt();
                int R = sc.nextInt();
                int S = sc.nextInt();
                int N = sc.nextInt();
                int l = 0;
                int p = 0;

                for (int i = 0; i < N; i++) {
                    l = M * E;
                    p = (L / R);
                    L = l;
                    M = (P / S);
                    P = p;
                }
                System.out.println(M);
            } else {
                // Handle invalid input or end of input
                break;
            }
        }

       
    }
}

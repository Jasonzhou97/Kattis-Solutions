import java.util.Scanner;

public class mirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         
        for(int i=1;i<=T;i++){
            int R = sc.nextInt();
            int C = sc.nextInt();
            sc.nextLine();
            //2d array to represent the picture
            char[][] pic = new char[R][C];
            for(int j=0;j<R;j++){
                char[] arr = sc.nextLine().toCharArray();
                pic[j] = arr;
            }
            System.out.println("Test "+i);
            for(int j=R-1;j>=0;j--){
                for(int k=C-1;k>=0;k--){
                    System.out.print(pic[j][k]);
                }
                System.out.println();
            }

        }
    }
}

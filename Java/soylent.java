import java.util.Scanner;

public class soylent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int soylent = 400;
        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            if(N%soylent==0){
                System.out.println(N/soylent);
            }
            else{
                System.out.println((N/soylent)+1);
            }
        }
    }
}

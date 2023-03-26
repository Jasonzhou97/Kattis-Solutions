import java.util.Scanner;

public class rijeci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        //its a fibonacci sequence
        int A = fibA(N-1);
        int B = fibB(N-1);
        System.out.println(A+" "+B);
    }

    static int fibA(int N){
        int a = 0, b = 1, c;
        if(N == 0)
            return a;
        for(int i = 2; i <= N; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    
    static int fibB(int N){
        int a = 1, b = 1, c;
        if(N == 0)
            return b;
        for(int i = 2; i <= N; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    
    
}

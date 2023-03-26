import java.util.Scanner;

public class ptice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String answer = sc.next();
        String Adrian = "ABC";
        String Bruno = "BABC";
        String Goran = "CCAABB";
        int A = 0; int B = 0; int G = 0;

        for(int i=0;i<N;i++){
            char ans = answer.charAt(i);
            if(ans == Adrian.charAt(i%3)){
                A++;
            }
            if(ans == Bruno.charAt(i%4)){
                B++;
            }
            if(ans == Goran.charAt(i%6)){
                G++;
            }
        }
        int result = Math.max(A,Math.max(G, B));
        System.out.println(result);
        if(A>=B&&A>=G){
            System.out.println("Adrian");
        }
        if(B>=G&&B>=A){
            System.out.println("Bruno");
        }
        if(G>=A&&G>=B){
            System.out.println("Goran");
        }
        
    }
}

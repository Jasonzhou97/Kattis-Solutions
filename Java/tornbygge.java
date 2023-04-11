import java.util.Scanner;

public class tornbygge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        //for comparison
        int previous = sc.nextInt();
        //keeps count of tower, initial 1
        int count = 1;

        for(int i=0;i<N-1;i++){
            int next = sc.nextInt();
            if(next>previous){
                count++;
            }
            //update previous brick
            previous = next;
        }
        System.out.println(count);
    }
}

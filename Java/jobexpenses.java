import java.util.*;

public class jobexpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int expenses = 0;
        for(int i=0;i<N;i++){
            int transaction = sc.nextInt();
            if(transaction<0){
                expenses += (-transaction);
            }
        }
        System.out.println(expenses);
    }
    
}

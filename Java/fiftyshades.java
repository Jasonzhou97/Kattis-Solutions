import java.util.*;

public class fiftyshades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        sc.nextLine();
        for(int i=0;i<N;i++){
            String writing = sc.nextLine();
            writing = writing.toLowerCase();
            
            if(writing.contains("rose")||writing.contains("pink")){
                sum+=1;
            }
        }
        if(sum>0){
            System.out.println(sum);
        }
        else{
            System.out.println("I must watch Star Wars with my daughter");
        }
    }
    
}

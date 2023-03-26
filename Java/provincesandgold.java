import java.util.*;

public class provincesandgold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cards = {3,2,1};
        int sum = 0;
        for(int i=0;i<3;i++){
            int card = sc.nextInt();
            sum += card*cards[i];
        }
        if(sum>=8){
            System.out.println("Province or Gold");
        }
        else if(sum>=6){
            System.out.println("Duchy or Gold");
        }
        else if(sum>=5){
            System.out.println("Duchy or Silver");
        }
        else if(sum>=3){
            System.out.println("Estate or Silver");
        }
        else if(sum>=2){
            System.out.println("Estate or Copper");
        }
        else{
            System.out.println("Copper");
        }
    }
    
}

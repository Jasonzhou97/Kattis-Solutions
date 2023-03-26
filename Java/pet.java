import java.util.*;

public class pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int winner = 0;
        for(int i=0;i<5;i++){
            int score = 0;
            for(int j=0;j<4;j++){
                 score += sc.nextInt();
            }
            if(score>max){
                max = score;
                winner = i+1;
            }
        }
        System.out.println(winner+" "+max);

    }
}

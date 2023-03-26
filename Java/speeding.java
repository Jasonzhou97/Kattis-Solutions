import java.util.Scanner;

public class speeding {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
        int Maxspeed = 0;
        int initialTime = sc.nextInt();
        int initialDis = sc.nextInt();
        
         for(int i=0;i<N-1;i++){
            int finaltime = sc.nextInt();
            int finalDis = sc.nextInt();
            int dis = finalDis-initialDis;
            int time = finaltime-initialTime;
            int speed = dis/time;
            if(speed>Maxspeed){
                Maxspeed = speed;
            }
            initialDis = finalDis;
            initialTime = finaltime;
         }
         System.out.println(Maxspeed);
    }
    
}

import java.util.*;
public class vauvau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int[] times = new int[3];
        for(int i=0;i<3;i++){
            times[i] = sc.nextInt();
        }
        

        for(int time:times){
            int dogs = 0;
            if(time%(A+B)!=0 && time%(A+B)<=A){
                dogs++;
            }
            if(time%(C+D)!=0 && time%(C+D)<=C){
                dogs++;
            }
            if(dogs==2){
                System.out.println("both");
            }
            else if(dogs==1){
                System.out.println("one");
            }
            else{
                System.out.println("none");
            }
        }
        
    }
}

import java.util.*;

public class humancannonball2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            float v = sc.nextFloat();
            double theta = sc.nextDouble();
            float x1 = sc.nextFloat();
            float h1 = sc.nextFloat();
            float h2 = sc.nextFloat();
            double t = x1/(v*Math.cos(Math.toRadians(theta)));
            double y = v*t*(Math.sin(Math.toRadians(theta)))-(0.5*9.81*t*t);

            if((y-h1)>=1 && (h2-y)>=1){
                System.out.println("Safe");
            }
            else{
                System.out.println("Not Safe");
            }
        }
    }
}

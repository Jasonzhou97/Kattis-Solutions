import java.util.Scanner;

public class differentdistances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            double x1 = sc.nextDouble();
            if(x1==0){
                break;
            }
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            double p = sc.nextDouble();

            double a = Math.pow(Math.abs(x1-x2),p)+Math.pow(Math.abs(y1-y2),p);
            double result = Math.pow(a,1.0/p);
            System.out.println(result);
        }
    }
}

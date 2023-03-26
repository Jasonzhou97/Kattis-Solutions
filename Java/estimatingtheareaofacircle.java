import java.util.*;
import java.util.function.DoubleSupplier;

public class estimatingtheareaofacircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            double r = sc.nextDouble();
            if(r==0){
                break;
            }
            double m = sc.nextDouble();
            double c = sc.nextDouble();
            double squareArea = 4*r*r;
            double trueArea = Math.PI*r*r;
            double estimatedArea = (c/m)*squareArea;
            System.out.println(trueArea+" "+estimatedArea);
        }
    }
}

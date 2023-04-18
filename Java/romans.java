import java.util.*;
import java.lang.Math;

public class romans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double miles = sc.nextDouble();

        double paces = 1000*(5280.0/4854.0)*miles;
        int result = (int) Math.round(paces);
        System.out.println(result);
    }
}

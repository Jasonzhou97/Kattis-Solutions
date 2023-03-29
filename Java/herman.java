import java.util.Scanner;

public class herman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double euArea = Math.PI*r*r;
        double taxArea = 4*0.5*r*r;
        System.out.println(euArea);
        System.out.println(taxArea);
    }
}

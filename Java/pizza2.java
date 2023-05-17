import java.util.Scanner;

public class pizza2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double C = sc.nextDouble();

        double area = ((R-C)*(R-C))/(R*R);
        System.out.println(area*100.0);
    }
}

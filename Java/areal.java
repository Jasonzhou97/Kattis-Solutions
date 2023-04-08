import java.util.Scanner;

public class areal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area = sc.nextDouble();

        double side = Math.sqrt(area);
        System.out.println(side*4);
    }
}

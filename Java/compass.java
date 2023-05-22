import java.util.Scanner;

public class compass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int degree = Math.abs(n1 - n2);
        int direction;

        if (degree == 180){
            System.out.println(180);
        }
        else if (degree < 180) {
            direction = (n2 >= n1) ? 1 : -1; // Clockwise (1) or counterclockwise (-1)
            System.out.println(direction * degree);
        } else {
            direction = (n2 >= n1) ? -1 : 1; // Counterclockwise (-1) or clockwise (1)
            degree = 360 - degree; // Adjust the degree to the other direction
            System.out.println(direction * degree);
        }

        
    }
}

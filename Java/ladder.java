import java.util.*;
public class ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int v = sc.nextInt();
        double angle = Math.toRadians(v);
        int answer = (int)(h/(Math.sin(angle)));
        System.out.println(answer+1);

    }
    
}

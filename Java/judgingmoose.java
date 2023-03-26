import java.util.*;

public class judgingmoose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        if(l==0 && r==0){
            System.out.println("Not a moose");
        }
        else if(l==r){
            System.out.println("Even "+ l*2);
        }
        else{
            int bigger = Math.max(l, r);
            System.out.println("Odd "+bigger*2);
        }
    }
}

import java.util.*;

public class licensetolaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int least = sc.nextInt();
        int min = 0;
        if(n==1){
            System.out.println(0);
        }
        else{
            for(int i=0;i<n-1;i++){
                int junk = sc.nextInt();
                if(junk<least){
                    least = junk;
                    min = i+1;
                }
            }
            System.out.println(min);
        }
    }
}

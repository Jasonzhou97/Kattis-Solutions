import java.util.HashSet;
import java.util.Scanner;

public class boatparts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int N = sc.nextInt();
        HashSet<String> boat = new HashSet<>();
        sc.nextLine();
        int count = 0;
        boolean replace = false;
        for(int i=0;i<N;i++){
            String part = sc.nextLine();
            if(!boat.contains(part)){
                boat.add(part);
                count++;
            }
            if(count==P){
                System.out.println(i+1);
                replace = true;
                break;
            }
        }
        if(!replace){
            System.out.println("paradox avoided");
        }
        
    }
}

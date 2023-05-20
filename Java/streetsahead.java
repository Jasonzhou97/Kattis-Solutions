import java.util.HashMap;
import java.util.Scanner;

public class streetsahead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> roads = new HashMap<>();

        for(int i=0;i<n;i++){
            String road = sc.nextLine();
            roads.put(road, i);
        }

        for(int i=0;i<q;i++){
            String entered = sc.next();
            String left = sc.next();

            int num = Math.abs(roads.get(left)-roads.get(entered))-1;
            System.out.println(num);
        }
    }
}

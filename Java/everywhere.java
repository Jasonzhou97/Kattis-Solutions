import java.util.*;

public class everywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> set = new HashSet<String>();
        int counter = 0;
        for(int i=0;i<N;i++){
            int n = sc.nextInt();
            for(int j=0;j<n;j++){
                String city = sc.next();
                if(!set.contains(city)){
                    set.add(city);
                    counter++;
                }
            }
            System.out.println(counter);
            counter = 0;
        }
    }
}

import java.util.*;

public class knotknowledge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        HashSet<Integer> knots = new HashSet<>();
        for(int i=0;i<N;i++){
            int knot = sc.nextInt();
            knots.add(knot);
            }
        for(int i=0;i<N-1;i++){
            int knot = sc.nextInt();
            if(knots.contains(knot)){
                knots.remove(knot);
                }
            }

            for(int knot:knots){
                System.out.println(knot);
                break;
            }


        }
        
    
}



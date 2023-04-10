import java.util.HashMap;
import java.util.Scanner;

public class unlockpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] points = {{0,2}, {1,2}, {2,2},{0,1}, {1,1}, {2,1},{0,0}, {1,0},{2,0}};
        double totalDistance = 0.0;

        HashMap<Integer,int[]> map = new HashMap<>();

        for(int i=0;i<9;i++){
            int order = sc.nextInt();
            map.put(order, points[i]);
        }
        for(int i=1;i<9;i++){
            int[] point1 = map.get(i);
            int[] point2 = map.get(i+1);
            double distance = Math.sqrt(Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1], 2));
            totalDistance+=distance;
        
        }
        System.out.println(totalDistance);
}
}


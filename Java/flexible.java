import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class flexible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int P = sc.nextInt();
        
        int[] partition = new int[P+2];

        partition[0] = 0;
        
        for(int i=0;i<P;i++){
            partition[i+1] = sc.nextInt();
        }
        partition [partition.length-1] = W;
        HashSet<Integer> lengths = new HashSet<>();

        for(int i=0;i<partition.length;i++){
            for(int j=i+1;j<partition.length;j++){
                int diff = partition[j] - partition[i];
                if(!lengths.contains(diff)){
                    lengths.add(diff);
                }
            }

        }
        
        Integer[] lengthsArray = new Integer[lengths.size()];
        lengths.toArray(lengthsArray);
        Arrays.sort(lengthsArray);
        for (Integer len : lengthsArray) {
            System.out.print(len+" ");
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class eventplanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<H;i++){
            int p = sc.nextInt();
            for(int j=0;j<W;j++){
                int a = sc.nextInt();
                if(a>=N){
                    int cost = p*N;
                    if(cost<=B){
                        arr.add(cost);
                    }
                    continue;
                }
            }
        }
        if(arr.size()==0){
            System.out.println("stay home");
        }
        else{
            int min = arr.get(0);
            for(int i=1;i<arr.size();i++){
                min = Math.min(min, arr.get(i));
            }
            System.out.println(min);
        }
    }
}

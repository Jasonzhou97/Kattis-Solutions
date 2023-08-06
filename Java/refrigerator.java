import java.util.Scanner;

public class refrigerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pa = sc.nextInt();
        int ka = sc.nextInt();
        int pb = sc.nextInt();
        int kb = sc.nextInt();
        int n = sc.nextInt();
        int aTrip;
        if(n%ka==0){
            aTrip = n/ka;
        }
        else{
            aTrip = n/ka+1;
        }
        int bTrip = 0;
        int min = 99999999;
        int aMin = aTrip;
        int bMin = 0;
        for(int i=aTrip;i>=0;i--){
            int cost = i*pa;
            int left = n-i*ka;
            if(left>0){
                if(left%kb==0){
                    bTrip = left/kb;
                }
                else{
                    bTrip = left/kb+1;
                }
            }
            cost += bTrip*pb;
            if(cost<min){
                min = cost;
                aMin = aTrip;
                bMin = bTrip;
            }
          
        }
        System.out.println(aMin+" "+bMin+" "+min);
    }
}

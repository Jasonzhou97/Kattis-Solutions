import java.util.*;

public class statistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseID = 1;

        while(sc.hasNextLine()){
            
            int n = sc.nextInt();
            int num = sc.nextInt();
            int max=num;int min=num;int range;

            for(int j=1;j<n;j++){
                int N = sc.nextInt();
                if(N>max){
                    max = N;
                }
                if(N<min){
                    min = N;
                }
            }
            range = max-min;
            System.out.println("Case "+caseID+": "+min+" "+max+" "+range);
            caseID++;
        }   
    }
}

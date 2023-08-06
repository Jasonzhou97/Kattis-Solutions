import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class armystrengtheasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            int Ng = sc.nextInt();
            int Nm = sc.nextInt();
            ArrayList<Integer> g = new ArrayList<>();
            ArrayList<Integer> m = new ArrayList<>();
            for(int j=0;j<Ng;j++){
                g.add(sc.nextInt());
            }
            for(int j=0;j<Nm;j++){
                m.add(sc.nextInt());
            }
            Collections.sort(g);
            Collections.sort(m);
            while(true){
                if(g.size()==0&&m.size()==0){
                    System.out.println("uncertain");
                    break;
                }
                else if(g.size()==0){
                    System.out.println("MechaGodzilla");
                    break;
                }
                else if(m.size()==0){
                    System.out.println("Godzilla");
                    break;
                }
                int gSmallest = g.get(0);
                int mSmallest = m.get(0);
                if(gSmallest == mSmallest){
                    m.remove(0);
                }
                else if (gSmallest<mSmallest){
                    g.remove(0);
                }
                else{
                    m.remove(0);
                }
            }
        }
        
    }
}

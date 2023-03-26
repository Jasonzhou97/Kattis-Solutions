import java.util.*;

public class synchronizinglists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){

            int N = sc.nextInt();
            if(N==0){
                break;
            }
            ArrayList<Integer> l1 = new ArrayList<>();
            ArrayList<Integer> l2 = new ArrayList<>();
            ArrayList<Integer> l3 = new ArrayList<>();
            for(int i=0;i<N;i++){
                l1.add(sc.nextInt());
            }
            for(int i=0;i<N;i++){
                l2.add(sc.nextInt());
            }
            for(int i=0;i<l1.size();i++){
                l3.add(l1.get(i));
            }
            Collections.sort(l1);
            Collections.sort(l2);

            int[] l4 = new int[l2.size()];
            for(int i=0;i<l2.size();i++){
                l4[i] = l2.get(l1.indexOf(l3.get(i)));
            }
            for(int i=0;i<l4.length;i++){
                System.out.println(l4[i]);
            }
            System.out.println(" ");
        }

    }
    
}

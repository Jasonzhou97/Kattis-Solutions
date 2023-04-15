import java.util.ArrayList;
import java.util.Scanner;


public class sok {
    public static void main(String[] args) {
        ArrayList<Integer> juice = new ArrayList<>();
        ArrayList<Integer> ratio = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++){
            juice.add(sc.nextInt());
            
        }
        for(int i=0;i<3;i++){
            ratio.add(sc.nextInt());
            
        }

        float min = (float) juice.get(0) / ratio.get(0);

        for(int i=1;i<3;i++){
            float n = (float) juice.get(i) / ratio.get(i);
            if(min>n){
                min = n;
            }
        }
        for(int i=0;i<3;i++){
            float leftover = juice.get(i) - min*ratio.get(i);
            System.out.print(leftover+" ");
        }
        
    }
}

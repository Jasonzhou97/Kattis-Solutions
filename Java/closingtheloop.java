import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class closingtheloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int S = sc.nextInt();
            ArrayList<Integer> blue = new ArrayList<>();
            ArrayList<Integer> red = new ArrayList<>();
            for(int j=0;j<S;j++){
                String rope = sc.next();
                String num = rope.substring(0, rope.length()-1);
                char colour = rope.charAt(rope.length()-1);
                int length = Integer.parseInt(num);
                if(colour=='B'){
                    blue.add(length);
                }
                else{
                    red.add(length);
                }
            }
            int total = 0;
            
            int size = Math.min(blue.size(), red.size());
            Collections.sort(blue,Collections.reverseOrder());
            Collections.sort(red,Collections.reverseOrder());
            for(int k=0;k<size;k++){
                int r = red.get(k);
                int b = blue.get(k);
                total+=r+b;
            }
            total-=size*2;
            System.out.println("Case #"+(i+1)+": "+total);
        }
    }
}

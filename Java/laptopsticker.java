import java.util.*;

public class laptopsticker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lengths = new ArrayList<>();
        for(int i=0;i<4;i++){
            lengths.add(sc.nextInt());
        }
        if((lengths.get(0)>=lengths.get(2)+2)&&(lengths.get(1)>=lengths.get(3)+2)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}

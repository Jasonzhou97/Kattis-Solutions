import java.util.ArrayList;
import java.util.*;

public class kornislav {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            int j = sc.nextInt();
            array.add(j);
        }
        Collections.sort(array);
        int num1 = array.get(0);
        int num2 = array.get(2);
        System.out.println(num1*num2);
    }
}

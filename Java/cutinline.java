import java.util.ArrayList;
import java.util.Scanner;

public class cutinline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> line = new ArrayList<>();

        //insert name in by order of position
        for(int i=1;i<=N;i++){
             String name = sc.next();
             line.add(name);
        }

        int C = sc.nextInt();
        
        //edit the hashmap queue
        for(int i=0;i<C;i++){
            String action = sc.next();
            if(action.equals("cut")){
                String cutter = sc.next();
                String cut = sc.next();

                int position = line.indexOf(cut);
                //add the cutter
                line.add(position,cutter);
            }
            else{
                String left = sc.next();
                line.remove(left);
            }
        }
        for(int i=0;i<line.size();i++){
            String name = line.get(i);
            System.out.println(name);
        }
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class huntthewumpus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        while(set.size()!=4){
            s = s + (int) Math.floor(s / 13) + 15;
            String sStr = String.valueOf(s);
            String cood = sStr.substring(sStr.length()-2);
            set.add(cood);
        }
        int siz = set.size();
        int attempt = 0;
        int count = 0;

        while(sc.hasNextLine()){
            String d = sc.next();
            int x = Character.getNumericValue(d.charAt(0));
            int y = Character.getNumericValue(d.charAt(1));
            attempt++;
            if(set.contains(d)){
                count++;
                System.out.println("You hit a wumpus!");
                set.remove(d);
            }
            if(count==siz){
                System.out.println("Your score is "+attempt+" moves.");
                break;
            }
            int mini = calc(x, y, set);
            System.out.println(mini);

        }
    }

    static int calc(int x,int y,HashSet<String> set){
        int min = 9999;
        for(String pos:set){
            int xc = Character.getNumericValue(pos.charAt(0));
            int yc = Character.getNumericValue(pos.charAt(1));
            int dis = Math.abs(x-xc) + Math.abs(y-yc);
            if(dis<min){
                min = dis;
            }
        }
        return min;
    }
}

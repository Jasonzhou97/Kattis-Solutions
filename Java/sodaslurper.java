import java.util.*;

public class sodaslurper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initial = sc.nextInt();
        int found = sc.nextInt();
        int required = sc.nextInt();

        int total = initial+found;
        int drank = 0;
        while(total>=required){
            int gained = total/required;
            drank += gained;
            total = total - (gained*required);
            total += gained;
        }
        System.out.println(drank);
    }
}

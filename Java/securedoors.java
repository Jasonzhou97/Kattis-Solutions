import java.util.HashSet;
import java.util.Scanner;

public class securedoors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        HashSet<String> names = new HashSet<>();

         for(int i=0;i<n;i++){
            String action = sc.next();
            String name = sc.next();
            if(action.equals("entry")){
                if(names.contains(name)){
                    System.out.println(name+" entered (ANOMALY)");
                }
                else{
                    System.out.println(name+" entered");
                    names.add(name);
                }
            }
            else{
                if(names.contains(name)){
                    System.out.println(name+" exited");
                    names.remove(name);
                }
                else{
                    System.out.println(name+" exited (ANOMALY)");
                }
            }
         }
    }
}

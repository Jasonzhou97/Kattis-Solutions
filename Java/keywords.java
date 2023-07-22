import java.util.HashSet;
import java.util.Scanner;

public class keywords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        HashSet<String> set = new HashSet<>();

        for(int i=0;i<N;i++){
            String line = sc.nextLine();
            String edited = line.toUpperCase();
            String result  = "";
            for(char c:edited.toCharArray()){
                if(c=='-'){
                    c=' ';
                }
                result+=c;
            }
            set.add(result);
        }
        System.out.println(set.size());
    }
}

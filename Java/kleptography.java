import java.util.*;

public class kleptography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Character> original = new ArrayList<>();
        ArrayList<Character> encrypted = new ArrayList<>();
        for(int i=0;i<n;i++){
            char letter = sc.next();
            original.add(letter);
        }
        for(int i=0;i<m;i++){
            char letter = sc.next();
            encrypted.add(letter);
        }
    }
}

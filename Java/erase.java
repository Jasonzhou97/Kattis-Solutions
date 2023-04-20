import java.util.Arrays;
import java.util.Scanner;

public class erase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();
        String before = sc.nextLine();
        String after = sc.nextLine();
        boolean correct = false;
        if(n%2!=0){
            char[] b = before.toCharArray();
            char[] a = new char[b.length];
            for(int i=0;i<b.length;i++){
                if(b[i]=='0'){
                    a[i] = '1';
                }
                else{
                    a[i] = '0';
                }
            }
            char[] c = after.toCharArray();
            if(Arrays.equals(c,a)){
            correct = true;
            }
        }
        else{
            if(before.equals(after)){
                correct = true;
            }
        }

        if(correct){
            System.out.println("Deletion succeeded ");
        }
        else{
            System.out.println("Deletion failed");
        }
    }
}

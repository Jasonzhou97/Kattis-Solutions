import java.util.Scanner;

public class moscowdream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for(int i=0;i<3;i++){
            int qn = sc.nextInt();
            if(qn<1){
                System.out.println("NO");
                return;
            }
            total+=qn;
        }
        int n = sc.nextInt();
        if(n>total || n < 3){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}

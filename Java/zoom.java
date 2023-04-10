import java.util.Scanner;

public class zoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int i = 1;
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            //check if its a factor of k
            if(i%k==0){
                System.out.print(num+" ");
            }
            i++;
        }
    }
}

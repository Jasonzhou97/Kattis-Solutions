import java.util.Scanner;

public class mult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(sc.hasNextInt()){
            int N = sc.nextInt();
            while(sc.hasNextInt()){            
                int num = sc.nextInt();
                if(num%N==0){
                    System.out.println(num);
                    break;
                }
            }
        }
    }
}

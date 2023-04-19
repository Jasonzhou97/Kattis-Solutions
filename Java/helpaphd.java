import java.util.Scanner;

public class helpaphd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<N;i++){
            String line = sc.nextLine();
            if(line.equals("P=NP")){
                System.out.println("skipped");
            }
            else{
                String[] arr = line.split("\\+");
                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[1]);
                System.out.println(a+b);
            }
        }
    }
}

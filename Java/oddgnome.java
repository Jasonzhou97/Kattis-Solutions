import java.util.Scanner;


public class oddgnome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int g = sc.nextInt();
            int previous = sc.nextInt();
            for(int j=1;j<g;j++){
                int id = sc.nextInt();
                if(id-previous!=1){
                    System.out.println(j+1);
                    break;
                }
                else{
                    previous = id;
                }
            }
            sc.nextLine();
        }
    }
}

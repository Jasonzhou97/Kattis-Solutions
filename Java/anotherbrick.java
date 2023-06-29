import java.util.Scanner;

public class anotherbrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();

        int length = 0;
        int layer = 1;
        boolean built = false;
        for(int i=0;i<n;i++){
            int brick = sc.nextInt();
            length+=brick;
            if(length>w){
                System.out.println("NO");
                break;
            }
            else if (length==w){
                if(layer==h){
                    System.out.println("YES");
                    built = true;
                    break;
                }
                else{
                    layer++;
                    length = 0;
                }
            }
        }
    }
}

import java.util.Scanner;

public class egypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int l = sc.nextInt();
            if(l==0){
                break;
            }
            int w = sc.nextInt();
            int h = sc.nextInt();
            if(l>w&&l>h){
                if(Math.pow(w, 2)+Math.pow(h, 2)==Math.pow(l, 2)){
                    System.out.println("right");
                }
                else{
                    System.out.println("wrong");
                }
            }
            else if(h>l&&h>w){
                if(Math.pow(l, 2)+Math.pow(w, 2)==Math.pow(h, 2)){
                    System.out.println("right");
                }
                else{
                    System.out.println("wrong");
                }
            }
            else{
                if(Math.pow(h, 2)+Math.pow(l, 2)==Math.pow(w, 2)){
                    System.out.println("right");
                }
                else{
                    System.out.println("wrong");
                }
            }


        }
    }
}

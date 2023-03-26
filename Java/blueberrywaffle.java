import java.util.Scanner;

public class blueberrywaffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int f = sc.nextInt();
        
        boolean position = true;
        int half = r/2;
        int count = 0;
       while(count<=f-10){
            if(count>=half){
                if(position){
                    position = false;
                }
                else{
                    position = true;
                }
                count+=r;
            }
            else{
                position = false;
                count+=half;
            }
        }
        if(position){
            System.out.println("up");
        }
        else{
            System.out.println("down");
        }
    }
}

import java.util.Scanner;

public class mia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int s0 = sc.nextInt();
            if(s0==0){
                break;
            }
            int s1 = sc.nextInt();
            int r0 = sc.nextInt();
            int r1 = sc.nextInt();

            if(highest(s0, s1)){
                if(highest(r0, r1)){
                    System.out.println("Tie.");
                }
                else{
                    System.out.println("Player 1 wins.");
                }
            }
            else if(highest(r0, r1)){
                System.out.println("Player 2 wins.");
            }
            else if(doubles(s0, s1)){
                if(doubles(r0, r1)){
                    if(s0>r0){
                        System.out.println("Player 1 wins.");
                    }
                    else if(s0==r0){
                        System.out.println("Tie.");
                    }
                    else{
                        System.out.println("Player 2 wins.");
                    }
                }
                else{
                    System.out.println("Player 1 wins.");
                }
            }
            else if(doubles(r0, r1)){
                System.out.println("Player 2 wins.");
            }
            else{
                int p1 = calc(s0, s1);
                int p2 = calc(r0, r1);
                if(p1>p2){
                    System.out.println("Player 1 wins.");
                }
                else if(p1==p2){
                    System.out.println("Tie.");
                }
                else{
                    System.out.println("Player 2 wins.");
                }
            }


        }
    }

    static boolean highest(int n1,int n2){
        if((n1==1 && n2==2)||(n1==2 && n2==1)){
            return true;
        }
        return false;
    }

    static boolean doubles(int n1,int n2){
        return n1==n2;
    }

    static int calc(int n1,int n2){
        if(n1>n2){
            return n1*10+n2;
        }
        else{
            return n2*10+n1;
        }
    }
}

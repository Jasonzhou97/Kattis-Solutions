import java.util.Scanner;

public class hangingout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int x = sc.nextInt();

        int ppl = 0;
        int counter = 0;
        for(int i=0;i<x;i++){
            String event = sc.next();
            int num = sc.nextInt();

            if(event.equals("enter")){
                if((ppl+num)>L){
                    counter++;
                }
                else{
                    ppl+=num;
                }
            }
            else{
                ppl -= num;
            }

        }
        System.out.println(counter);
    }
}

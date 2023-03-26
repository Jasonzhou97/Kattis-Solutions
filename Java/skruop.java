import java.util.Scanner;

public class skruop {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int volume = 7;
         sc.nextLine();
          for(int i=0;i<N;i++){
            String request = sc.nextLine();
            if(request.equals("Skru op!")){
                if(volume==10){
                    continue;
                }
                else{
                    volume++;
                }
            }
            else if(request.equals("Skru ned!")){
                if(volume==0){
                    continue;
                }
                else{
                    volume--;
                }
            }
          }
          System.out.println(volume);
    }
}

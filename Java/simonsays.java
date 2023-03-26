
import java.util.Scanner;

public class simonsays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        
        for(int i=0;i<N;i++){
            String sentence = sc.nextLine();

            if(sentence.startsWith("Simon says")){
                System.out.println(sentence.substring(10));
            }
           
        }


        sc.close();
    }
}

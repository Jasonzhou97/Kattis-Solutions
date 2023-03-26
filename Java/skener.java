import java.util.ArrayList;
import java.util.Scanner;

public class skener {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int Zr = sc.nextInt();
        int Zc = sc.nextInt();

        sc.nextLine();
        ArrayList<Character> array = new ArrayList<>();
        for(int i=0;i<R;i++){
            String row = sc.next();
            for(int k=0;k<Zr;k++){
                for(int j=0;j<row.length();j++){
                    char c = row.charAt(j);
                    for(int l=0;l<Zc;l++){
                        System.out.print(c);
                    }
                
                }
                System.out.println();

            }
        }

    }
    
}

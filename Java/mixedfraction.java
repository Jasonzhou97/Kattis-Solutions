import java.util.Scanner;

public class mixedfractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int numerator = sc.nextInt();
            int denominator = sc.nextInt();
            if(numerator==0 && denominator==0){
                break;
            }
            int whole = numerator/denominator;
            int remainder = numerator - (denominator*whole);

            System.out.println(whole+" "+remainder+" / "+denominator);

        }
    }
    
}

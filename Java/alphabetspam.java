import java.util.Scanner;

public class alphabetspam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        char[] array = sentence.toCharArray();
        
        double whitespace=0;
        double lower=0;
        double upper=0;
        double symbol=0;
        double sum = 0;

        for (char c:array){

            if(c=='_'){
                whitespace++;
                sum++;
            }
            else if(Character.isLowerCase(c)){
                lower++;
                sum++;
            }
            else if(Character.isUpperCase(c)){
                upper++;
                sum++;
            }
            else {
                symbol++;
                sum++;
        }
    }

        double w = whitespace/sum;
        double l = lower/sum;
        double u = upper/sum;
        double s = symbol/sum;
        System.out.printf("%.9f\n", w);
        System.out.printf("%.9f\n", l);
        System.out.printf("%.9f\n", u);
        System.out.printf("%.9f\n", s);
    }

    
}


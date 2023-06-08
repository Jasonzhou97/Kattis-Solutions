import java.util.Scanner;

public class averagecharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] arr = line.toCharArray();

        double avg = 0;
        for(char a:arr){
            avg += (int)a;
        }
        if(avg%arr.length!=0){
            avg = Math.floor(avg/arr.length);
        }
        else{
            avg = avg/arr.length;
        }

        System.out.println((char)avg);
    }
}

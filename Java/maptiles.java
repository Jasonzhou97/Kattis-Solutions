import java.util.Scanner;

public class maptiles2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int zoom = num.length();
        int tiles = (int)Math.pow(4, (double)zoom);
        int side = (int)Math.sqrt(tiles);
        char[] arr = num.toCharArray();

        int x=0;
        int y=0;

        for(int i=0; i<arr.length; i++) {
            int digit = Character.getNumericValue(arr[i]);
            int t = (int) Math.pow(2, arr.length - i - 1);
           
            if(digit == 1) {
                x += t;
            } else if(digit == 2) {
                y += t;
            } else if(digit == 3) {
                x += t;
                y += t;
            }

        }
        System.out.println(zoom+" "+x+" "+y);


    }
}

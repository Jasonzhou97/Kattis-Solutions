import java.util.Scanner;

public class yinyangstones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stones = sc.nextLine();
        int W = 0;
        int B = 0;
        for(int i=0;i<stones.length();i++){
            char stone = stones.charAt(i);
            if(stone=='W'){
                W++;
            }
            else{
                B++;
            }
        }
        if(W==B){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}

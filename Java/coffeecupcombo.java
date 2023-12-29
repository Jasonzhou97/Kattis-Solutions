import java.util.Scanner;

public class coffeecupcombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();

        int coffeeCount = 0;
        int lecs = 0;

        for(int i=0;i<n;i++){
            char c = line.charAt(i);
            if(c=='1'){
                coffeeCount = 2;
                lecs++;
            }
            else{
                if(coffeeCount>0){
                    lecs++;
                    coffeeCount--;
                }
            }
        }
        System.out.println(lecs);
    }
}

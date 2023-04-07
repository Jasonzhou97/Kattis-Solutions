import java.util.Scanner;

public class deathknight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        sc.nextLine();
        for(int i=0;i<n;i++){
            boolean won = true;
            String battle = sc.nextLine();
            for(int j=0;j<battle.length()-1;j++){
                if(battle.charAt(j)=='C'&&battle.charAt(j+1)=='D'){
                    won = false;
                    break;
                }
            }
            if(won){
                count++;
            }
        }
        System.out.println(count);
    }
}

import java.util.Scanner;

public class tajna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int l = word.length();
        int r = calc(l);
        int c = l/r;
        c = Math.max(r,c);
        r = l/c;
        char[][] table = new char[r][c];

        int count = 0;

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                table[j][i] = word.charAt(count);
                count++;
            }
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(table[i][j]);
            }
        }
    }

    static int calc(int num){
        for(int i=(int)Math.sqrt(num);i>0;i--){
            if(num%i==0){
                return i;
            }
        }
        return num;

    }
}

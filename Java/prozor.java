import java.util.Scanner;

public class prozor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int S = sc.nextInt();
        int K = sc.nextInt();

        char[][] window = new char[R][S];

        //copy the window input 
        for(int i=0;i<R;i++){
            String line = sc.next();
            for(int j=0;j<S;j++){
                window[i][j] = line.charAt(j);
            }
        }

        //keep track of most number of flies killed
        int maxFlies = 0;
        int r = 0;
        int c = 0;
        //loop through every possible position of racket
        for(int i=0;i<R-K+1;i++){
            for(int j=0;j<S-K+1;j++){
                int flies = calculateFlies(i,j,window,K);
                if (flies>maxFlies){
                    maxFlies = flies;
                    r = i;
                    c = j;
                }
            }
        }

        window[r][c] = '+';
        window[r+K-1][c] = '+';
        window[r][c+K-1] = '+';
        window [r+K-1][c+K-1] = '+';

        for(int i=r;i<=r+K-1;i++){
            if(i==r || i==r+K-1){
                for(int j=c+1;j<c+K-1;j++){
                    window[i][j] = '-';
                }
            }
            else{
                window[i][c] = '|';
                window[i][c+K-1] = '|'; 
            }
        }
        System.out.println(maxFlies);
        for(int i=0;i<R;i++){
            for(int j=0;j<S;j++){
                System.out.print(window[i][j]);
            }
            System.out.println();
        }
    }

    
    static int calculateFlies(int r, int c, char[][] window, int k) {
        int flies = 0;
        for (int i = r + 1; i < r + k - 1; i++) {
            for (int j = c + 1; j < c + k - 1; j++) {
                if (i >= 0 && i < window.length && j >= 0 && j < window[0].length) {
                    if (window[i][j] == '*') {
                        flies++;
                    }
                }
            }
        }
        return flies;
    }
}    

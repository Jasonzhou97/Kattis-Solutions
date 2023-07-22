import java.util.Scanner;

public class espressobucks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] map = new char[n][m];
        sc.nextLine();

        for(int i=0;i<n;i++){
            String line = sc.nextLine();
            for(int j=0;j<m;j++){
                char c = line.charAt(j);
                map[i][j] = c;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map = edit(map, i, j, n, m);
            }
        }

        for(int i=0;i<n;i++){
            char[] line = map[i];
            for(int j=0;j<m;j++){
                char c = line[j];
                System.out.print(c);
            }
            System.out.println();
        }

    }

    static char[][] edit(char[][] map,int r,int c,int n,int m){
        if(r==0){
            if(c==0){
                if(map[r][c]=='.'){
                    if((map[r+1][c]!='E')&&(map[r][c+1]!='E')){
                        map[r][c] = 'E';
                    }
                }
            }
            else if(c==m-1){
                if(map[r][c]=='.'){
                    if((map[r+1][c]!='E')&&(map[r][c-1]!='E')){
                        map[r][c] = 'E';
                    }
                }
            }
            else{
                if(map[r][c]=='.'){
                        if((map[r+1][c]!='E')&&(map[r][c-1]!='E')&&(map[r][c+1]!='E')){
                        map[r][c] = 'E';
                    }
                }

            }
        }
        else if(r==n-1){
            if(c==0){
                if(map[r][c]=='.'){
                    if((map[r-1][c]!='E')&&(map[r][c+1]!='E')){
                        map[r][c] = 'E';
                    }
                }
            }
            else if(c==m-1){
                if(map[r][c]=='.'){
                    if((map[r-1][c]!='E')&&(map[r][c-1]!='E')){
                        map[r][c] = 'E';
                    }
                }
            }
            else{
                if(map[r][c]=='.'){
                    if((map[r-1][c]!='E')&&(map[r][c-1]!='E')&&(map[r][c+1]!='E')){
                    map[r][c] = 'E';
                    }
                }
            }
        }
        else{
            if(c==0){
                if(map[r][c]=='.'){
                    if((map[r-1][c]!='E')&&(map[r][c+1]!='E')&&(map[r+1][c+1]!='E')){
                        map[r][c] = 'E';
                    }
                }
            }
            else if(c==m-1){
                if(map[r][c]=='.'){
                    if((map[r-1][c]!='E')&&(map[r][c-1]!='E')&&(map[r+1][c]!='E')){
                        map[r][c] = 'E';
                    }
                }
            }
            else{
                if(map[r][c]=='.'){
                    if((map[r-1][c]!='E')&&(map[r+1][c]!='E')&&(map[r][c-1]!='E')&&(map[r][c+1]!='E')){
                    map[r][c] = 'E';
                    }
                }
            }
        }
        return map;
    }
}

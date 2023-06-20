import java.util.Scanner;

public class fontan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        char[][] grid = new char[M][N];

        for(int i=0;i<M;i++){
            String line = sc.next();
            for(int j=0;j<N;j++){
                grid[i][j] = line.charAt(j);
            }
        }
        char[][] editedGrid = new char[M][N];
        while(verify(grid, M, N)){
            editedGrid = edit(grid, M, N);
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print(editedGrid[i][j]);
            }
            System.out.println();
        }
    }

    static boolean verify(char[][] map,int r,int c){
        for(int i=0;i<r-1;i++){
            for(int j=0;j<c;j++){
                if(map[i][j]=='V'&&map[i+1][j]=='.'){
                    return true;
                }
            }
        }
        for(int i=0;i<r-1;i++){
            for(int j=1;j<c-1;j++){
                if(map[i][j]=='V'&&map[i+1][j]=='#'){
                    if(map[i][j-1]=='.'){
                        return true;
                    }
                    if(map[i][j+1]=='.'){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static char[][] edit(char[][] map,int r,int c){
        for(int i=0;i<r-1;i++){
            for(int j=0;j<c;j++){
                if(map[i][j]=='V'&&map[i+1][j]=='.'){
                    map[i+1][j] = 'V';
                }
            }
        }
        for(int i=1;i<r-1;i++){
            for(int j=0;j<c-1;j++){
                if(map[i][j]=='V'&&map[i+1][j]=='#'){
                    if(map[i][j-1]=='.'){
                        map[i][j-1] = 'V';
                    }
                    if(map[i][j+1]=='.'){
                        map[i][j+1] = 'V';
                    }
                }
            }
        }
        return map;
    }

}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class npuzzle {
    public static void main(String[] args) {
        char[][] board = new char[4][4];
        int alphabetIndex = 0;
        HashMap<Character,int[]> positions = new HashMap<>();
        
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                if (alphabetIndex < 15) {
                    char alp =  (char) ('A' + alphabetIndex);
                    board[i][j] = alp;
                    int[] arr = new int[]{j,i};
                    positions.put(alp, arr);
                    alphabetIndex++;
                } else {
                    board[i][j] = '.';
                    int[] arr = new int[]{i,j};
                    positions.put('.', arr);
                }
            }
        }
        char[][] puzzle = new char[4][4];
        Scanner sc = new Scanner(System.in);
        HashSet<Character> visited = new HashSet<>();

        for(int i=0;i<4;i++){
            String line = sc.nextLine();
            for(int j=0;j<4;j++){
                puzzle[i][j] = line.charAt(j);
            }
        }
        int total = 0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                char b = board[i][j];
                char p = puzzle[i][j];
                if(!visited.contains(p) || !visited.contains(b) ){
                    if(b!=p && p!='.'){
                        int[] pos = positions.get(p);
                        int xb = pos[0];
                        int yb = pos[1];
                        int dis = Math.abs(xb-j) + Math.abs(yb-i);
                        total+=dis;
                        visited.add(p);
                    }
                }

            }
        }
        System.out.println(total);

    }
}

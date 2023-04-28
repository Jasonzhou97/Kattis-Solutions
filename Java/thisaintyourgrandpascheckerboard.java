import java.util.Scanner;

public class thisaintyourgrandpascheckerboard{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        //create 2d array as board
        char[][] board = new char[n][n];

        //read input to board array
        for(int i=0;i<n;i++){
            String chess = sc.nextLine();
            board[i] = chess.toCharArray();
        }
        boolean correct = true;

        for(int i=0;i<n;i++){
            //check if 3 consecutive squares in same row have the same colour
            if(consecutive(board[i])){
                correct = false;
                break;
            }
            //check if w and b squares are of same number
            if(!same(board[i])){
                correct = false;
                break;
            }
            
        }
        if(!correct){
            System.out.println(0);
        }
        else{
            //do same tests for columns
            char[][] columnBoard = new char[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    columnBoard[i][j] = board[j][i];
                }
            }
            for(int i=0;i<n;i++){
                //check if 3 consecutive squares in same row have the same colour
                if(consecutive(columnBoard[i])){
                    correct = false;
                    break;
                }
                //check if w and b squares are of same number
                if(!same(columnBoard[i])){
                    correct = false;
                    break;
                }
                
            }
            if(!correct){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }

        }
    }

    static boolean consecutive(char[] arr){
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]==arr[i+1]&&arr[i]==arr[i+2]&&arr[i+1]==arr[i+2]){
                return true;
            }     
        }
        return false;
    }

    static boolean same(char[] arr){
        int w = 0;
        int b = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='W'){
                w++;
            }
            else{
                b++;
            }
        }
        return w==b;
    }

}

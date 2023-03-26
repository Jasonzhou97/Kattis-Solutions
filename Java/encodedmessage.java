import java.util.Scanner;

public class encodedmessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            String word = sc.next();
            char[] wordArr = word.toCharArray();
            int side =(int)Math.sqrt(wordArr.length);
            char[][] array = new char[side][side];
            int l = 0;
            for(int j=0;j<side;j++){
                for(int k=0;k<side;k++){
                    array[side-k-1][j] = wordArr[l];
                    l+=1;
                }
            }

            for(int j=0;j<side;j++){
                for(int k=0;k<side;k++){
                    System.out.print((array[j][k]));

                }
            }
            System.out.println();


        }
    }
}

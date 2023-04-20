import java.util.*;

public class fallingapart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] pieces = new Integer[n];

        for(int i=0;i<n;i++){
            int piece = sc.nextInt();
            pieces[i] = piece;
        }
        //sort array in decsending order which is the way they r picked
        Arrays.sort(pieces,Collections.reverseOrder());

        int A = 0;
        int B = 0;

        for(int i=0;i<pieces.length;i++){
            //check whose turn
            if(i%2==0){
                A+=pieces[i];
            }
            else{
                B+=pieces[i];
            }
        }
        System.out.println(A +" "+B);
    }
}

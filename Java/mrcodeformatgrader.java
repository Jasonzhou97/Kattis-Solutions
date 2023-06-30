import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mrcodeformatgrader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int N = sc.nextInt();

        int prev = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> wrong = new ArrayList<>();

        arr.add(prev);
        wrong.add(prev);
        ArrayList<ArrayList<Integer>> errors = new ArrayList<>();
        for(int i=1;i<N;i++){
            int cur = sc.nextInt();
            wrong.add(cur);
            if(cur-prev==1){
                arr.add(cur);
                prev = cur;
            }
            else{
                if (!arr.isEmpty()) {
                    errors.add(new ArrayList<>(arr));
                    arr.clear();
                }
                prev = cur;
                arr.add(cur);
            }
            if(i==N-1){
                errors.add(arr);
            }

        }
        System.out.print("Errors: ");
        format(errors);
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<ArrayList<Integer>> correct = new ArrayList<>();
        int prevC = 0;
        boolean first = true;
        for(int i=1;i<=C;i++){
            if(!wrong.contains(i)){
                if(first){
                    prevC = i;
                    first = false;
                    right.add(prevC);
                }
                else{
                    if(i-prevC==1){
                        right.add(i);
                        prevC = i;
                    }
                    else{
                        correct.add(new ArrayList<>(right));
                        right.clear();
                        prevC = i;
                        right.add(i);
                    }
                }
               
            }
            if(i==C){
                correct.add(right);
            }
        }
        System.out.println();
        System.out.print("Correct: ");
        format(correct);

    }
    static void format(ArrayList<ArrayList<Integer>> array){
        for(int i=0;i<array.size();i++){
            ArrayList<Integer> ar = array.get(i);
            if(ar.size()==1){
                System.out.print(ar.get(0));
            }
            else{
                Collections.sort(ar);
                int min = ar.get(0);
                int max = ar.get(ar.size()-1);
                System.out.print(min+"-"+max);

            }
            if(i==array.size()-2){
                System.out.print(" and ");
            }
            if(i<array.size()-2){
                System.out.print(", ");
            }
        }
    }
}

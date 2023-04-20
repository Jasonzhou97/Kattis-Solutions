import java.util.ArrayList;
import java.util.Scanner;

public class finalexam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> Hanh = new ArrayList<>();
        ArrayList<Character> correct = new ArrayList<>();
        int n = sc.nextInt();

        //add a dummy first answer to the correct seq
        correct.add('E');

        for(int i=0;i<n;i++){
            String Ans = sc.next();
            char ans = Ans.charAt(0);
            Hanh.add(ans);
            correct.add(ans);
        }
        //add dummy to hanhs last answer
        Hanh.add('E');
        int count = 0;
        //compare both of their answers
        for(int i=0;i<correct.size();i++){
            if(correct.get(i)==Hanh.get(i)){
                count++;
            }
        }
        System.out.println(count);

    }
}

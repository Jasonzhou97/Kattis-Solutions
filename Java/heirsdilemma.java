import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class heirsdilemma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int H = sc.nextInt();
        
        int counter = 0;

        for(int i=L;i<=H;i++){
            String num = Integer.toString(i);
            char[] numArr = num.toCharArray();
            ArrayList<Character> numLs = new ArrayList<>();
            HashSet<Character> numSet = new HashSet<>();

            for(int j=0;j<numArr.length;j++){
                numLs.add(numArr[j]);
                numSet.add(numArr[j]);
            }

            
            //first test
            if(num.length()!=6 || numLs.contains('0')){
                continue;
            }
            //second test
            if(numSet.size()!=6){
                continue;
            }
            //third test
            if(!divisible(i)){
                continue;
            }

            //passed all 3 tests
            counter++;
        }
        System.out.println(counter);
    }
    static boolean divisible(int n){
        int N = n;
        while(n>0){
            int digit = n%10;
            if(N%digit!=0){
                return false;
                
            }
            n/=10;
        }
        return true;
    }
}

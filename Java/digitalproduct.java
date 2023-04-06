import java.util.Scanner;

public class digitalproduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while(!nonZero(x)){
            int product = 1;
            while(x>0){
                int digit = x%10;
                if(digit!=0){
                    product *= digit;
                }
                x/=10;
            }
            x = product;
        }
        String N = Integer.toString(x);
        if(N.length()==1){
            System.out.println(x);
        }
        else{
            char[] arr = N.toCharArray();
            System.out.println(arr[0]);
        }
    }

    static boolean nonZero(int n){
        String N = Integer.toString(n);
        char[] arr = N.toCharArray();
        //only 1 non zero digit
        if (N.length()==1){
            return true;
        }
        int count = 0;
        for(char num : arr ){
            if(num!='0'){
                count++;
            }
        }
        return count==1;
    }
}

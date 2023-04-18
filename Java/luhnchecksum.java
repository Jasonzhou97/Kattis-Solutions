import java.util.HashMap;
import java.util.Scanner;
import java.lang.Character;

public class luhnchecksum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<N;i++){
            char[] arr = sc.nextLine().toCharArray();
            int[] transformed = transform(arr);
            int total = add(transformed);
            if(total%10==0){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }
        }
    }

    static int[] transform(char[] arr){
        int[] result = new int[arr.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(5,1);
        map.put(6,3);
        map.put(7,5);
        map.put(8,7);
        map.put(9,9);
        //keep track of every second element
        boolean second = false;
        //start from right end
        for(int i=arr.length-1;i>=0;i--){
            char n = arr[i];
            int num = Character.getNumericValue(n);

                if(second){
                    num*=2;
                    if(num>=10){
                        int newNum = map.get(num/2);
                        
                        result[i] = newNum;
                    }
                    else{
                        result[i] = num;
                    }
                    second = false;
                }
                else{
                    result[i] = num;
                    second = true;
                }
        }
        return result;
    }
    static int add(int[] arr){
        int total = 0;
        for(int num:arr){
            total+=num;
        }
        return total;
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class raggedright {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        while(sc.hasNextLine()){
            String sen = sc.nextLine();
            int length = sen.length();
            if(length>max){
                max = length;
            }
            arr.add(length);
        }
        for(int i=0;i<arr.size()-1;i++){
            int len = arr.get(i);
            if(len!=max){
                sum+=(max-len)*(max-len);
            }
        }
        System.out.println(sum);
    }


}

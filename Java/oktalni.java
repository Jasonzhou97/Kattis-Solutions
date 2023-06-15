import java.util.Scanner;

public class oktalni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        //padd 0s in front till number of digits is divsible by 3
        while (num.length() % 3 != 0) {
            num="0"+num;
        }
        String result = "";
        for(int i=0;i<num.length();i+=3){
            String grp = num.substring(i, i+3);
            int binary = Integer.parseInt(grp);
            binary = convert(binary);
            String n = Integer.toString(binary);
            result+=n;
        }
        System.out.println(result);
        
    }

    static int convert(int num){
        int count = 0;
        int total = 0;
        while(num>0){
            int digit = num%10;
            if(digit==1){
                total += Math.pow(2, count);
            }
            count++;
            num/=10;
        }
        return total;
    }
}

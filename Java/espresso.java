import java.util.Scanner;

public class espresso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int s = sc.nextInt();
        int max = s;
        int refills = 0;

        for(int i=0;i<n;i++){
            String order = sc.next();
            int vol;
            if(order.length()==1){
                vol = Integer.parseInt(order);
                if(s-vol<0){
                    refills++;
                    s = max;
                }
                s-=vol;
            }
            else{
                vol = Character.getNumericValue(order.charAt(0));
                vol++;
                if(s-vol<0){
                    refills++;
                    s = max;
                }
                s-=vol;
            }

        }
        System.out.println(refills);
    }
}

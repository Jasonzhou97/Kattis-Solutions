import java.util.Scanner;

public class babybites {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean sense = true;
        int count = 0;
        for(int i=0;i<n;i++){
            String input = sc.next();
            if(input.equals("mumble")){
                count++;
            }
            else{
                int num = Integer.parseInt(input);
                count++;
                if(count!=num){
                    sense = false;
                    break;
                }
            }
        }
        if(sense){
            System.out.println("makes sense");
        }
        else{
            System.out.println("something is fishy");
        }
    }
}

import java.util.Scanner;



public class quadrant{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();
        int y = scanner.nextInt();
        
        if(x>0){
            if(y>0){
                System.out.println(1);
            }
            else{
                System.out.println(4);
            }
        }
        else{
            if(y>0){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }
        }
        }

}


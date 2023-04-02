import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] limits = new int[5];
        for(int i=0;i<5;i++){
            int gradeLim = sc.nextInt();
            limits[i] = gradeLim;
        }
        int grade = sc.nextInt();
        for(int i=0;i<5;i++){
            if(grade>=limits[i]){
                if(i==0){
                    System.out.println("A");
                    break;
                }
                else if(i==1){
                    System.out.println("B");
                    break;
                }
                else if(i==2){
                    System.out.println("C");
                    break;
                }
                else if(i==3){
                    System.out.println("D");
                    break;
                }
                else if(i==4){
                    System.out.println("E");
                    break;
                }
            }
        }
        if(grade<limits[4]){
            System.out.println("F");
        }
    }
}

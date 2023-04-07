import java.util.Scanner;

public class dicegame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int emma = 0;
        int gunnar = 0;
        for(int i=0;i<2;i++){
            if(i==0){
                for(int j=0;j<4;j++){
                    int dice = sc.nextInt();
                    gunnar+=dice;
                }
            }
            else{
                for(int j=0;j<4;j++){
                    int dice = sc.nextInt();
                    emma+=dice;
                }
            }
        }
        if(emma>gunnar){
            System.out.println("Emma");
        }
        else if(gunnar>emma){
            System.out.println("Gunnar");
        }
        else{
            System.out.println("Tie");
        }
    }
}

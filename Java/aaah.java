import java.util.Scanner;

public class aaah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jon = sc.nextLine();
        String doc = sc.nextLine();
        
        if(doc.length()>jon.length()){
            System.out.println("no");
        }
        else{
            System.out.println("go");
        }
    }
}

import java.util.*;

public class isithalloween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] day = date.split(" ");
        if((day[0].equals("OCT") && day[1].equals("31")) || (day[0].equals("DEC") && day[1].equals("25"))){
            System.out.println("yup");
        }
        else{
            System.out.println("nope");
        }
    }
}

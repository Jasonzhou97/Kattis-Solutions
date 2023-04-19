import java.util.Scanner;

public class apaxianparent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Y = sc.next();
        String P = sc.next();

        char last = Y.charAt(Y.length()-1);
        char second = Y.charAt(Y.length()-2);
        String name = "";
        //check for conditions
        if(last=='e'){
            name = Y+"x"+P;
        }
        else if(last=='a'||last=='i'||last=='o'||last=='u'){
            name = Y.substring(0, Y.length()-1)+"ex"+P;
        }
        else if(last=='x'&&second=='e'){
            name = Y + P;
        }
        else{
            name = Y+"ex"+P;
        }
        System.out.println(name);
    }
}

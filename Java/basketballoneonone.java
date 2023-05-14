import java.util.*;
public class basketballoneonone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();

        int A = 0;
        int B = 0;
        for(int i=0;i<n;i+=2){
            char name = s.charAt(i);
            int p = Character.getNumericValue(s.charAt(i+1));
            if(name=='A'){
                A+=p;
            }
            else{
                B+=p;
            }
            if(A>=10&&B>=10){
                if(A-B>=2||B-A>=2){
                    if(A>B){
                        System.out.println('A');
                    }
                    else{
                        System.out.println('B');
                    }
                }
            }
            else if(A>10||B>10){
                if(A-B>=1||B-A>=1){
                    if(A>B){
                        System.out.println('A');
                    }
                    else{
                        System.out.println('B');
                    }
                }
            }
        }
    }
}


import java.util.Scanner;

public class yoda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String M = sc.next();

        if(M.length()>N.length()){
            N = resize(N, M.length());
        }
        else if(M.length()<N.length()){
            M = resize(M, N.length());
        }
        String newN = "";
        String newM = "";
        int nc = 0;
        int mc = 0;
        for(int i=0;i<M.length();i++){
            int n = Character.getNumericValue(N.charAt(i));
            int m = Character.getNumericValue(M.charAt(i));

            if(n>m){
                mc++;
                newN += n;
            }
            else if(m>n){
                nc++;
                newM += m;
            }
            else{
                newN += n;
                newM += m;
            }
        }
        
        if(newN.equals("")){
            System.out.println("YODA");
        }
        else{
            System.out.println(Integer.parseInt(newN));
        }
        if(newM.equals("")){
            System.out.println("YODA");
        }
        else{
            System.out.println(Integer.parseInt(newM));
        }


    }
    static String resize(String w,int s){
        int i = s-w.length();
        for(int j=0;j<i;j++){
            w = "0"+w;
        }
        return w;
    }
}

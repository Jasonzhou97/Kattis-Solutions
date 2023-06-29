import java.util.ArrayList;
import java.util.Scanner;

public class progressivescramble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            String line = sc.nextLine();
            char mode = line.charAt(0);

            String msg = line.substring(2);
            String ans = "";
            if(mode=='e'){
                ans = encrypt(msg);
                
            }
            else{
                ans = decrypt(msg);
            }
            System.out.println(ans);
        }
    }

    static String encrypt(String m){
        ArrayList<Integer> vsi = new ArrayList<>();

        for(char c:m.toCharArray()){
            if(c==' '){
                vsi.add(0);
            }
            else{
                int value = c-'a'+1;
                vsi.add(value);
            }
        }

        int j = 1;
        while (j < vsi.size()) {
            int prev = vsi.get(j - 1);
            int cur = vsi.get(j);
            vsi.set(j, prev + cur);
            j++;
        }

        for(int i=0;i<vsi.size();i++){
            int cur = vsi.get(i);
            cur = cur%27;
            vsi.set(i,cur);
        }
        String result = "";

        for(int k:vsi){
            if(k==0){
                result+=" ";
            }
            else{
                char alphabet = (char)(k+'a'-1);
                result+=alphabet;
            }
        }
        return result;
    }

    static String decrypt(String m){
        ArrayList<Integer> vsi = new ArrayList<>();

        for(char c:m.toCharArray()){
            if(c==' '){
                vsi.add(0);
            }
            else{
                int val = c-'a'+1;
                vsi.add(val);
            }
        }
        int j = vsi.size()-1;
        while (j > 0) {
            int next = vsi.get(j - 1);
            int cur = vsi.get(j);
            if(cur<next){
                cur+=27;
            }
            vsi.set(j, cur-next);
            j--;
        }
        String result = "";
        for(int v:vsi){
            if(v==0){
                result+=" ";
            }
            else{
                char c = (char)(v+'a'-1);
                result+=c;
            }
        }
        return result;
    }
}

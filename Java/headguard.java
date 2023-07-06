import java.util.Scanner;

public class headguard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            char[] line = sc.nextLine().toCharArray();
            char prev = line[0];
            int count = 1;
            for(int i=1;i<line.length;i++){
                char cur = line[i];
                if(cur!=prev){
                    System.out.print(count);
                    System.out.print(prev);
                    prev = cur;
                    count = 1;
                }
                else{
                    count++;
                }
                if(i==line.length-1){
                    System.out.print(count);
                    System.out.print(cur);
                }
            }
            System.out.println();
        }
    }
}

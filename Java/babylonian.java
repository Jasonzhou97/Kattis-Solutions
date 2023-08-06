import java.util.Scanner;

public class babylonian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<N;i++){
            long total = 0;
            int commaCount = 0;
            String line = sc.nextLine();
            for(int j=0;j<line.length();j++){
                if(line.charAt(j)==','){
                    commaCount++;
                }
            }
            String[] parts = line.split(",");
            for(int j=0;j<parts.length;j++){
                int num = Integer.parseInt(parts[j]);
                total += (long)((long)Math.pow(60, commaCount)*num);
                commaCount--;
            }
            System.out.println(total);
        }
    }
}

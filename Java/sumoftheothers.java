import java.util.Scanner;

public class sumoftheothers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String lineInput = sc.nextLine();
            if (lineInput.isEmpty()) {
                break;
            }
            String[] line = lineInput.split(" ");
            int total = 0;
            for(int i=0;i<line.length;i++){
                total+=Integer.parseInt(line[i]);
            }
            System.out.println(total/2);
        }
    }
}

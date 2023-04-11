import java.util.Scanner;

public class titlecost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //separate title from limit
        String[] split = input.split(" ");

        String title = split[0];
        Double limit = Double.parseDouble(split[1]);

        int length = title.length();
        System.out.println(Math.min(length, limit));
    }
}

import java.util.Scanner;

public class codetosavelives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String input = sc.nextLine();
            // remove all white spaces
            input = input.replaceAll("\\s", ""); 
            // convert the string to integer
            int num = Integer.parseInt(input); 
            String input2 = sc.nextLine();
            input2 = input2.replaceAll("\\s", ""); 
            int num2 = Integer.parseInt(input2); 
            int result = num+num2;
            String number = Integer.toString(result);
            for(int j=0;j<number.length();j++){
                System.out.print(number.charAt(j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

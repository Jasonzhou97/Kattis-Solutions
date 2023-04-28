import java.util.*;

public class statistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseID = 1;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Scanner scanLine = new Scanner(line);

            if (scanLine.hasNextInt()) {
                int n = scanLine.nextInt();

                if (scanLine.hasNextInt()) {
                    int num = scanLine.nextInt();
                    int max=num;
                    int min=num;
                    int range;

                    for (int j = 1; j < n; j++) {
                        if (scanLine.hasNextInt()) {
                            int N = scanLine.nextInt();

                            if (N > max) {
                                max = N;
                            }
                            if (N < min) {
                                min = N;
                            }
                        }
                    }
                    range = max - min;
                    System.out.println("Case "+caseID+": "+min+" "+max+" "+range);
                    caseID++;
                }
            }
        }
    }
}
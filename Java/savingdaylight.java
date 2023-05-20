import java.util.Scanner;

public class savingdaylight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().split(" ");
            if (arr.length >= 2) {
                String sr = arr[arr.length - 2];
                String ss = arr[arr.length - 1];

                String[] parts1 = sr.split(":");
                String[] parts2 = ss.split(":");

                if (parts1.length >= 2 && parts2.length >= 2) {
                    int h1 = Integer.parseInt(parts1[0]);
                    int h2 = Integer.parseInt(parts2[0]);
                    int m1 = Integer.parseInt(parts1[1]);
                    int m2 = Integer.parseInt(parts2[1]);

                    int h = h2 - h1;
                    int m;
                    if (m2 < m1) {
                        m = m2 + 60 - m1;
                        h--;
                    } else {
                        m = m2-m1;
                    }
                    for (int i = 0; i < arr.length - 2; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.print(h + " hours " + m + " minutes");
                    System.out.println();
                }
            }
        }
    }
}

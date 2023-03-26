import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class datum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dateStr = sc.nextLine();
        String[] parts = dateStr.split(" ");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = 2009;
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH);
        System.out.println(dayOfWeek);
    }
}
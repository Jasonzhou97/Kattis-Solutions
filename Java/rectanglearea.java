import java.text.DecimalFormat;
import java.util.*;

public class rectanglearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();

        float L = Math.abs(x1-x2);
        float H = Math.abs(y1-y2);

        DecimalFormat df = new DecimalFormat("#.000");
        float area = Float.valueOf(df.format(L*H));
        System.out.println(area);
    }
    
}

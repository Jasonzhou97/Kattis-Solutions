import java.util.HashSet;
import java.util.Scanner;

public class beehives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            float d = sc.nextFloat();
            if(d==0.0){
                break;
            }
            int N = sc.nextInt();
            float[][] arr = new float[N][2];
            for(int i=0;i<N;i++){
                float x = sc.nextFloat();
                float y = sc.nextFloat();
                float[] pos = new float[]{x, y};
                arr[i] = pos;
            }
            HashSet<float[]> set = new HashSet<>();
            for(int i=0;i<N;i++){
                float[] pos = arr[i];

                for(int j=i+1;j<N;j++){
                    float[] pos1 = arr[j];
                    double distance = calc(pos,pos1);
                    if(distance<d){
                        set.add(pos);
                        set.add(pos1);
                    }

                }
            }
            System.out.println(set.size()+" sour, "+(N-set.size())+" sweet");
        }
    }
    static double calc(float[] pos, float[] pos1) {
        float x0 = pos[0];
        float y0 = pos[1];
        float x1 = pos1[0];
        float y1 = pos1[1];
    
        float xd = x1 - x0;
        float yd = y1 - y0;
        return Math.sqrt((xd * xd) + (yd * yd));
    }
}

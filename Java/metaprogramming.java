import java.util.HashMap;
import java.util.Scanner;

public class metaprogramming {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(" ");
            if(line.length==3){
                int val = Integer.parseInt(line[1]);
                String key = line[2];
                map.put(key, val);
            }
            else{
                String k1 = line[1];
                String k2 = line[3];

                if(!map.containsKey(k1)||!map.containsKey(k2)){
                    System.out.println("undefined");
                }
                else{
                    int kv1 = map.get(k1);
                    int kv2 = map.get(k2);
                    String op = line[2];
                    System.out.println(eval(kv1, kv2, op));
                }
            }
        }
    }
    static boolean eval(int v1,int v2, String op){
        if(op.equals("=")){
            return v1==v2;
        }
        else if(op.equals(">")){
            return v1>v2;
        }
        else{
            return v1<v2;
        }
    }
}

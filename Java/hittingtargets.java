import java.util.ArrayList;
import java.util.Scanner;

public class hittingtargets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<m;i++){
            ArrayList<Integer> shape= new ArrayList<Integer>();
            String word = sc.next();
            if(word.equals("rectangle")){
                for(int j=0;j<4;j++){
                    int num = sc.nextInt();
                    shape.add(num);
                }
            }
            else{ 
                for(int j=0;j<3;j++){
                    int num = sc.nextInt();
                    shape.add(num);
                }
            }
            list.add(shape);
        }

        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int counter = 0;
            for(int j=0;j<list.size();j++){
                ArrayList<Integer> figure = list.get(j);
                //if its rectangle
                if(figure.size()==4){
                    int x1 = figure.get(0);
                    int y1 = figure.get(1);
                    int x2 = figure.get(2);
                    int y2 = figure.get(3);
                    if((x >= x1 && x <= x2) && (y >= y1 && y <= y2)){
                        counter++;
                    }
                }
                //its circle
                else{
                    int xc = figure.get(0);
                    int yc = figure.get(1);
                    int r = figure.get(2);


                    double dx = xc-x;
                    double dy = yc-y;

                    double distance = Math.sqrt(dx*dx + dy*dy);;
                    if(distance<=r){
                        counter++;
                    }
                }
            }
            System.out.println(counter);
        }
    }
}

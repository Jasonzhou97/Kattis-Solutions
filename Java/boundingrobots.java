import java.util.Scanner;


public class boundingrobots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int w = sc.nextInt();
            int l = sc.nextInt();
            //last case
            if(w==0&&l==0){
                break;
            }

            int n = sc.nextInt();
            int x =0;int y = 0;
            int xa = 0;int ya = 0;
            for(int i=0;i<n;i++){

                String direction = sc.next();
                int length = sc.nextInt();
    
                if(direction.equals("u")){
                    y+=length;
                    if(ya+length>l-1){
                        ya=l-1;
                    }
                    else{
                        ya+=length;
                    }
                }
                else if(direction.equals("d")){
                    y-=length;
                    if(ya-length<0){
                        ya=0;
                    }
                    else{
                        ya-=length;
                    }
                }
                else if(direction.equals("l")){
                    x-=length;
                    if(xa-length<0){
                        xa=0;
                    }
                    else{
                        xa-=length;
                    }
                }
                else if(direction.equals("r")){
                    x+=length;
                    if(xa+length>w-1){
                        xa=w-1;
                    }
                    else{
                        xa+=length;
                    }
                }

            }
            System.out.println("Robot thinks "+x+" "+y);
            System.out.println("Actually at "+xa+" "+ya);
            System.out.println();
        }
    }
}

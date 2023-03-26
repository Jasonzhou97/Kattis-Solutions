import java.util.*;

public class pieceofcake2 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> lengths = new ArrayList<>();
    for(int i=0;i<3;i++){
        lengths.add(sc.nextInt());
    }
    int n =lengths.get(0);
    int volume = 4;
    for(int i=1;i<lengths.size();i++){
        int length = lengths.get(i);
        if(n>(length*2)){
            volume*=(n-length);
        }
        else{
            volume*=length;
        }
    }
    System.out.println(volume);
 }   
}

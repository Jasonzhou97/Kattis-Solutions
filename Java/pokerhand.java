import java.util.*;

public class pokerhand {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         HashMap<Character,Integer> cards = new HashMap<>();
         for(int i=0;i<5;i++){
            String card = sc.next();
            char rank = card.charAt(0);
    
            if(!cards.containsKey(rank)){
                cards.put(rank,1);
            }
            else{
                int value = cards.get(rank);
                cards.put(rank,value+1);
            }
         }
         int max = 0;
         for(int value:cards.values()){
            if(value>max){
                max = value;
            }
         }
         System.out.println(max);
    }
    
}

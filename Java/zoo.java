import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lst = 1;
        while(true){
            int N = sc.nextInt();
            sc.nextLine();
            HashMap<String,Integer> record = new HashMap<>();
            if(N==0){
                break;
            }
            for(int i=0;i<N;i++){
                String[] animal = sc.nextLine().split(" ");
                String type = animal[animal.length-1].toLowerCase();
                if(record.containsKey(type)){
                    record.put(type, record.get(type)+1);
                }
                else{
                    record.put(type, 1);
                }
            }

            // Create a TreeMap and copy all entries from HashMap to arrange by alphabetical order
            TreeMap<String, Integer> sortedMap = new TreeMap<>(record);
            System.out.println("List "+lst+":");
            for(String animal:sortedMap.keySet()){
                System.out.println(animal+" | "+sortedMap.get(animal));
            }
            lst++;
        }
    }
}

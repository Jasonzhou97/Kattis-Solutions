import java.util.*;

public class simone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<K;i++){
            map.put(i+1,0);
        }
        for(int i=0;i<N;i++){
            int color = sc.nextInt();
            int freq = map.get(color);
            freq++;
            map.put(color, freq);

        }
        // Convert the HashMap to a List of Map.Entry objects
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());

        // Sort the List based on the values in ascending order
        Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });
         // Create a new LinkedHashMap to store the sorted entries
         LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();

        // Add the sorted entries to the LinkedHashMap
        for (Map.Entry<Integer, Integer> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        int count = 1;
        int previous = 0;
        ArrayList<Integer> colors = new ArrayList<>();
        for(int color:sortedMap.keySet()){
            int freq = sortedMap.get(color);
            if(count==1){
                colors.add(color);
                previous = freq;
                count++;
            }
            else{
                if(freq==previous){
                    colors.add(color);
                }
            }
        }
        Collections.sort(colors);
        System.out.println(colors.size());
        for(int color:colors){
            System.out.print(color+" ");
        }
    }
}

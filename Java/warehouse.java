import java.util.*;

public class warehouse {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){

            int N = sc.nextInt();
            Map<String, Integer> map = new HashMap<>();
            for(int j=0;j<N;j++){
                String name = sc.next();
                int num = sc.nextInt();
                if(map.containsKey(name)){
                    int m = map.get(name);
                    m+=num;
                    map.put(name, m);
                }
                else{
                    map.put(name, num);
                }


            }
                 // Sort the map by values, and for keys with the same values, sort them alphabetically
                 Map<String, Integer> sortedMap = sortByValues(map,false);

                // Print the sorted map
                System.out.println(sortedMap.keySet().size());
                for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
                    System.out.println(entry.getKey()+" "+entry.getValue());
                }
        }

    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValues(Map<K, V> map, final boolean ascending) {
        List<Map.Entry<K, V>> entries = new ArrayList<>(map.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> entry1, Map.Entry<K, V> entry2) {
                int valueComparison = entry1.getValue().compareTo(entry2.getValue());
                if (valueComparison != 0) {
                    return ascending ? valueComparison : -valueComparison;
                }
                Comparable<K> comparableKey1 = (Comparable<K>) entry1.getKey();
                return comparableKey1.compareTo(entry2.getKey());
            }
        });

        LinkedHashMap<K, V> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}

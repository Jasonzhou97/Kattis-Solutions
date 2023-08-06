import java.util.*;

public class touchscreenkeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] strings = {
            "qwertyuiop",
            "asdfghjkl",
            "zxcvbnm"
        };
        
        HashMap<Character, int[]> charIndexMap = new HashMap<>();
        
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                char c = strings[i].charAt(j);
                int[] index = {i, j};
                charIndexMap.put(c, index);
            }
        }
        
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            String word = sc.next();
            int l = sc.nextInt();
            int[][] arr = new int[word.length()][2];
            for(int k=0;k<word.length();k++){
                char c = word.charAt(k);
                int[] pos = charIndexMap.get(c);
                arr[k] = pos;
            }
            HashMap<String,Integer> map = new HashMap<>();
            for(int j=0;j<l;j++){
                String w = sc.next();
                int total = 0;
                for(int k=0;k<w.length();k++){
                    char c = w.charAt(k);
                    int[] pos = charIndexMap.get(c);
                    int x = pos[0];
                    int y = pos[1];
                    int x1 = arr[k][0];
                    int y1 = arr[k][1];

                    int distance = calc(x, y, x1, y1);
                    total += distance;
                }
                
                map.put(w, total);
            }
            LinkedHashMap<String, Integer> sortedMap = sort(map);
            TreeMap<Integer, List<String>> finalMap = alphabetic(sortedMap);
            for (Map.Entry<Integer, List<String>> entry : finalMap.entrySet()) {
                int value = entry.getKey();
                List<String> stringsWithSameValue = entry.getValue();
                
                Collections.sort(stringsWithSameValue);

                for (String wd : stringsWithSameValue) {
                    System.out.println(wd + " " + value);
                }
            }
        }
    }
    static int calc(int x0,int y0,int x1,int y1){
        int dis = Math.abs(x0-x1) + Math.abs(y0-y1);
        return dis;
    }

    static LinkedHashMap sort(HashMap<String,Integer> map){
        // Create a list of map entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort the list by values in ascending order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // Create a LinkedHashMap to maintain the sorted order
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    static TreeMap alphabetic(LinkedHashMap<String,Integer> sortedMap){
        // Create a TreeMap to group strings with the same values
        TreeMap<Integer, List<String>> groupedMap = new TreeMap<>();
        for (String wd : sortedMap.keySet()) {
            int value = sortedMap.get(wd);
            groupedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(wd);
        }

        return groupedMap;
    }
}

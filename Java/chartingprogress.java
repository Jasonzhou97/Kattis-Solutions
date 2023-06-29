import java.util.*;

public class chartingprogress {
    //not complete
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Character>> arr = new ArrayList<>();

        while(sc.hasNextLine()){
            String line = sc.nextLine();

            if(!line.isEmpty()){
                ArrayList<Character> a = new ArrayList<>();

                for(char c:line.toCharArray()){
                    a.add(c);
                }
                arr.add(a);
            }
            else{
                HashMap<Integer,Integer> map = new HashMap<>();
                ArrayList<ArrayList<Character>> columns = new ArrayList<>();
                for(int i=0;i<arr.size();i++){
                    ArrayList<Character> column = new ArrayList<>();
                    int count = 0;
                    for(int j=0;j<arr.size();j++){
                        ArrayList<Character> row = arr.get(j);
                        char c = row.get(i);
                        column.add(c);
                        if(c=='*'){
                            map.put(i, count);
                        }
                        count++;
                    }
                    columns.add(column);
                }
                List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

                // Sort the list based on the values using a custom Comparator
                Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                        return entry1.getValue().compareTo(entry2.getValue());
                    }
                });

                LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
                for (Map.Entry<Integer, Integer> entry : entryList) {
                    sortedMap.put(entry.getKey(), entry.getValue());
                }
                ArrayList<ArrayList<Character>> res = new ArrayList<>();
                

                for(int i=0;i<arr.size();i++){
                    ArrayList<Character> r = new ArrayList<>();
                    for(int key:sortedMap.keySet()){
                        ArrayList<Character> co = columns.get(key);
                        r.add(co.get(i));
                    }
                    res.add(r);
                }

                for(int i=0;i<res.size();i++){
                    ArrayList<Character> f = res.get(i);
                    for(int j=0;j<f.size();j++){
                        System.out.print(f.get(j));
                    }
                }
                map.clear();
                columns.clear();
                arr.clear();
                System.out.println();
            }
        }
    }
}

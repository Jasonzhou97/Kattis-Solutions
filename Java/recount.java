import java.util.*;

public class recount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();

        while(true){
            String name = sc.nextLine();
            if(name.equals("***")){
                break;
            }
            if(map.containsKey(name)){
                int count = map.get(name);
                count++;
                map.put(name, count);
            }
            else{
                map.put(name, 1);
            }

        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort the list in descending order based on values
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });


        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();


        for (int i = 0; i < 2 && i < entryList.size(); i++) {
            Map.Entry<String, Integer> entry = entryList.get(i);
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        ArrayList<String> keysList = new ArrayList<>(sortedMap.keySet());
        if(sortedMap.get(keysList.get(0)) > sortedMap.get(keysList.get(1))){
            System.out.println(keysList.get(0));
        }
        else{
            System.out.println("Runoff!");
        }

    }
}

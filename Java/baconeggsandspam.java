import java.util.*;

public class baconeggsandspam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){

            int n = sc.nextInt();
            if(n==0){
                break;
            }
            HashMap<String,ArrayList<String>> map = new HashMap<>();
            sc.nextLine();
            for(int i=0;i<n;i++){
                String order= sc.nextLine();
                String[] arr = order.split(" ");
                String name = arr[0];
                for(int j=1;j<arr.length;j++){
                    String food = arr[j];
                    if(map.keySet().contains(food)){
                        ArrayList<String> nm = map.get(food);
                        nm.add(name);
                        Collections.sort(nm);
                        map.put(food, nm);
                    }
                    else{
                        ArrayList<String> nm = new ArrayList<>();
                        nm.add(name);
                        map.put(food, nm);
                    }
                }

            }
            // Sort the dictionary by keys in alphabetical order
            Map<String, ArrayList<String>> sortedMap= new TreeMap<>(map);
            
            for(String fd:sortedMap.keySet()){
                ArrayList<String> nm = sortedMap.get(fd);
                System.out.print(fd +" ");
                for(String person:nm){
                    System.out.print(person+" ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class karte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        String[] parts = input.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

        HashSet<String> set = new HashSet<>();
        boolean two = false;      
        for(int i=0;i<arr.length;i+=3){
            String word = "";
            word+=arr[i];
            word+=arr[i+1];
            word+=arr[i+2];
            if(set.contains(word)){
                System.out.println("GRESKA");
                two=true;
                break;
            }
            else{
                set.add(word);
            }
        }
        if(!two){
            HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
            hashMap.put("P", 13);
            hashMap.put("K",13);
            hashMap.put("H", 13);
            hashMap.put("T", 13);
            for (String part : parts) {
                //number
                if (part.matches("\\d+")) {
                    continue;
                }
                //alphabet
                else {
                    int value = hashMap.get(part);
                    value -= 1;
                    hashMap.put(part, value);
                }
            }
            int P = hashMap.get("P");
            int K = hashMap.get("K");
            int H = hashMap.get("H");
            int T = hashMap.get("T");
            System.out.println(P+" "+K+" "+H+" "+T);
        }

    }
    
}

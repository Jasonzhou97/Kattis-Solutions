import java.util.HashMap;
import java.util.Scanner;

public class doorman{
    
    public static void main(String[] args) {    
    
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        HashMap<Character,Integer> map = new HashMap<>();
        map.put('W', 0);
        map.put('M', 0);

        char[] line = sc.next().toCharArray();



        boolean skip = false;
        boolean limit = false;
        for(int i=0;i<line.length-1;i++){
            if(skip){
                skip = false;
                continue;
            }
            if(limit){
                break;
            }
            char first = line[i];
            char second = line[i+1];
            int w = map.get('W');
            int m = map.get('M');

            if(Math.abs(w-m)>=X){
                    
                    if(m>w){
                        if((first=='W'&&second=='M')||(first=='M'&&second=='W')){       
                                int n = map.get(first);
                                map.put(first, n+1);
                                int z = map.get(second);
                                map.put(second, z+1);
                                skip = true;
                    }
                    else if(first=='W'){
                        int n = map.get(first);
                        map.put(first, n+1);
                    }
                    else{
                        limit = true;
                    }
                    }
                    else{
                        if((first=='W'&&second=='M')||(first=='M'&&second=='W')){       
                                int n = map.get(first);
                                map.put(first, n+1);
                                int z = map.get(second);
                                map.put(second, z+1);
                                skip = true;
                    }
                    else if(first=='M'){
                        int n = map.get(first);
                        map.put(first, n+1);
                    }
                    else{
                        limit = true;
                    }
                    }

            }
            else{
                int n = map.get(first);
                map.put(first, n+1);
            }
            char last = line[i+1];
            if(skip){
                continue;
            }
            else{
            if(i==line.length-2){
                if(Math.abs(w-m)>X){
                    if((w>m&&last=='M')|(w<m&&last=='W')){
                        int n = map.get(last);
                        map.put(last,n+1);
                    }
            }
            else{
                int n = map.get(last);
                map.put(last, n+1);
            }
            }
            }

        }

        int woman = map.get('W');
        int man = map.get('M');
        System.out.println(man+woman);
    }

}   
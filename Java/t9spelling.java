import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class t9spelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        HashMap<Integer, ArrayList<Character>> map = new HashMap<>();

        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('a');
        list2.add('b');
        list2.add('c');
        map.put(2, list2);

        ArrayList<Character> list3 = new ArrayList<>();
        list3.add('d');
        list3.add('e');
        list3.add('f');
        map.put(3, list3);

        ArrayList<Character> list4 = new ArrayList<>();
        list4.add('g');
        list4.add('h');
        list4.add('i');
        map.put(4, list4);

        ArrayList<Character> list5 = new ArrayList<>();
        list5.add('j');
        list5.add('k');
        list5.add('l');
        map.put(5, list5);

        ArrayList<Character> list6 = new ArrayList<>();
        list6.add('m');
        list6.add('n');
        list6.add('o');
        map.put(6, list6);

        ArrayList<Character> list7 = new ArrayList<>();
        list7.add('p');
        list7.add('q');
        list7.add('r');
        list7.add('s');
        map.put(7, list7);

        ArrayList<Character> list8 = new ArrayList<>();
        list8.add('t');
        list8.add('u');
        list8.add('v');
        map.put(8, list8);

        ArrayList<Character> list9 = new ArrayList<>();
        list9.add('w');
        list9.add('x');
        list9.add('y');
        list9.add('z');
        map.put(9, list9);

        int previous = -1;
        for(int i=1;i<=N;i++){
            System.out.print("Case #"+i+": ");
            String message = sc.nextLine();
            for(int j=0;j<message.length();j++){
                char alphabet = message.charAt(j);
                if(alphabet==' '){
                    if(previous==0){
                        System.out.print(' ');
                    }
                    System.out.print(0);
                    

                    previous = 0;
                }
                else{
                    for(int key:map.keySet()){
                        if(map.get(key).contains(alphabet)){
                            int count = 1;
                            ArrayList<Character> arr = map.get(key);
                            if(key==previous){
                                System.out.print(" ");
                            }
                            for(char a : arr){
                                if(a==alphabet){
                                    for(int k=0;k<count;k++){
                                        System.out.print(key);
                                    }
                                    
                                }
                                else{
                                    count++;
                                }
                            }
                            previous = key;
                        }
                    }
                }

            }

            System.out.println();
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class peg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Character>> board = new ArrayList<>();


        while(sc.hasNextLine()){
            String s = sc.nextLine();
            ArrayList<Character> row = new ArrayList<>();
            for(int i=0;i<s.length();i++){
                row.add(s.charAt(i));
            }
            board.add(row);
        }
        int count = 0;
        for(int i=2;i<5;i++){
            ArrayList<Character> b = board.get(i);
            for(int j=2;j<5;j++){
                Character c = b.get(j);
                Character cl = b.get(j-1);
                Character cl2 = b.get(j-2);
                Character cr = b.get(j+1);
                Character cr2 = b.get(j+2);
                if(c==' '){
                    continue;
                }
                else{
                    ArrayList<Character> u1 = board.get(i-1);
                    ArrayList<Character> u2 = board.get(i-2);
                    ArrayList<Character> d1 = board.get(i+1);
                    ArrayList<Character> d2 = board.get(i+2);
                    //check upwards and downwards
                    if(c=='o'&&u1.get(j)=='o'&&u2.get(j)=='.'){
                        count++;
                    }
                    if(c=='o'&&d1.get(j)=='.'&&u1.get(j)=='o'){
                        count++;
                    }
                    if(c=='o'&&d1.get(j)=='o'&&u1.get(j)=='.'){
                        count++;
                    }
                    if(c=='o'&&d1.get(j)=='o'&&d2.get(j)=='.'){
                        count++;
                    }
                    if(i==2||i==4){
                        if(c=='.'&&u1.get(j)=='o'&&u2.get(j)=='o'){
                            count++;
                        }
                        if(c=='.'&&d1.get(j)=='o'&&d2.get(j)=='o'){
                            count++;
                        }
                    }
                    //check left and right
                    if(c=='o'&&cl=='o'&&cl2=='.'){
                        count++;
                    }
                    if(c=='o'&&cr=='o'&&cr2=='.'){
                        count++;
                    }
                    if(c=='.'&&cl=='o'&&cl2=='o'){
                        count++;
                    }
                    if(c=='.'&&cr=='o'&&cr2=='o'){
                        count++;
                    }
                    
                }
            }
        }
        System.out.println(count);
    }
}

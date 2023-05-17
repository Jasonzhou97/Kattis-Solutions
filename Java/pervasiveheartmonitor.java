import java.util.ArrayList;
import java.util.Scanner;

public class pervasiveheartmonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String[] arr = sc.nextLine().split(" ");
            ArrayList<String> name = new ArrayList<>();
            ArrayList<Double> nums = new ArrayList<>();
            for(String word:arr){
                if(isAlphabet(word)){
                    //collects the words in name
                    name.add(word);
                }
                else{
                    //collects the heart rates
                    nums.add(Double.parseDouble(word));
                }
                
            }
            //calculate average
            double average = avg(nums);
            System.out.print(average+" ");
            for(String part:name){
                    System.out.print(part+" ");
                }
            System.out.println();
                
        }
        

    }

    //check if the input is a word
    static boolean isAlphabet(String input){
        return input.matches("[a-zA-Z]+");
    }

    static Double avg(ArrayList<Double> arr){
        double total = 0;
        for(double num:arr){
            total+=num;
        }
        return total/arr.size();
    }
}

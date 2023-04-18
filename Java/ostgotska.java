import java.util.Scanner;

public class ostgotska {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String[] arr = sentence.split(" ");
        int count = 0;
        int words = arr.length;

        //loop through each word
        for(String word:arr){
            int len = word.length();
            //loop through each letter in the word
            for(int i=0;i<len-1;i++){
                //check if it contains ae
                if(word.charAt(i)=='a'&&word.charAt(i+1)=='e'){
                    count++;
                    break;
                }
            }
        }
        if(count>words*0.4){
            System.out.println("dae ae ju traeligt va");
        }
        else{
            System.out.println("haer talar vi rikssvenska");
        }
    }
}

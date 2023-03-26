import java.util.*;

public class trik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int position = 1;
        char[] arr = sc.next().toCharArray();
        for(int k=0;k<arr.length;k++){
            if(arr[k]=='A'){
                if(position==2){
                    position--;
                    
                }
                else if(position==1){
                    position++;
                   
                }
            }
            else if(arr[k]=='B'){
                if(position==2){
                    position++;
                    
                }
                else if(position==3){
                    position--;
                    
                }
            }
            else{
                if(position==1){
                    position = 3;
                    
                }
                else if(position==3){
                    position = 1;
                    
                }
            }
        }

        System.out.println(position);
    }
}

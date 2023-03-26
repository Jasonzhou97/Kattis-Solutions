import java.util.Scanner;

public class drmmessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        char[] arr = msg.toCharArray();
        int half = arr.length/2;
        char[] front = new char[half];
        char[] back = new char[half];

        for(int i=0;i<half;i++){
            front[i] = arr[i];
            back[i] = arr[half+i];
        }
        int valFront = sum(front);
        int valBack = sum(back);

        char[] updatedFront = rotate(front, valFront,half);
        char[] updatedBack= rotate(back, valBack,half);

        char[] result = new char[half];
        for(int i=0;i<half;i++){
            char char1 = updatedFront[i];
            char char2 = updatedBack[i];

            char newChar = (char) ((char1 - 'A' + char2 - 'A' + 26) % 26 + 'A');

            result[i] = newChar;
        }
        for(int i=0;i<half;i++){
            System.out.print(result[i]);
        }

    }

    public static int sum(char[] arr){
        int value = 0;
        for(int i=0;i<arr.length;i++){
            char alphabet = arr[i];
            value += alphabet - 'A';
            }
            return value;
    }

    public static char[] rotate(char[] original,int value,int length){
        char[] updated = new char[length];
        for(int i=0;i<original.length;i++){
            char alphabet = original[i];
            char newAlp = (char) ((alphabet - 'A' + value) % 26 + 'A');
            updated[i] = newAlp;
        }
        return updated;
    }
}

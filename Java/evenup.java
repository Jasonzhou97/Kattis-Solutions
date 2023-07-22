import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class evenup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int card = sc.nextInt();
            arr.add(card);
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.size(); i++) {
            int currentCard = arr.get(i);
            if (!stack.isEmpty() && (currentCard + stack.peek()) % 2 == 0) {
                stack.pop();
            } else {
                stack.push(currentCard);
            }
        }

        System.out.println(stack.size());
    }
}

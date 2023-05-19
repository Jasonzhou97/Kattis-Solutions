import java.util.*;

public class veci {
    public static int getNextNumberWithSameDigits(int X) {
        String numberString = String.valueOf(X);
        char[] digits = numberString.toCharArray();

        int pivotIndex = -1;
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                pivotIndex = i;
                break;
            }
        }

        if (pivotIndex == -1) {
            // No valid number greater than X with the same digits
            return 0;
        }

        int smallestDigitIndex = pivotIndex + 1;
        for (int i = pivotIndex + 2; i < digits.length; i++) {
            if (digits[i] > digits[pivotIndex] && digits[i] < digits[smallestDigitIndex]) {
                smallestDigitIndex = i;
            }
        }

        swap(digits, pivotIndex, smallestDigitIndex);
        Arrays.sort(digits, pivotIndex + 1, digits.length);

        String resultString = new String(digits);
        return Integer.parseInt(resultString);
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int nextNumber = getNextNumberWithSameDigits(X);
        System.out.println(nextNumber);
    }
}

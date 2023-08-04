import java.util.HashSet;
import java.util.Scanner;

public class conquestcampaign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();

        HashSet<int[]> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int[] pos = new int[2];
            pos[0] = sc.nextInt() - 1;
            pos[1] = sc.nextInt() - 1;
            if (!set.contains(pos)) {
                set.add(pos);
            }
        }

        int day = 0;
        while (set.size() != (R * C)) {
            HashSet<int[]> newPositions = new HashSet<>();
            for (int[] arr : set) {
                int x = arr[0];
                int y = arr[1];
                if (x > 0 && x < C - 1) {
                    if (y > 0 && y < R - 1) {
                        int[] pos1 = { x - 1, y };
                        int[] pos2 = { x + 1, y };
                        int[] pos3 = { x, y - 1 };
                        int[] pos4 = { x, y + 1 };
                        newPositions.add(pos1);
                        newPositions.add(pos2);
                        newPositions.add(pos3);
                        newPositions.add(pos4);
                    } else if (y > 0) {
                        int[] pos1 = { x - 1, y };
                        int[] pos3 = { x, y - 1 };
                        int[] pos4 = { x, y + 1 };
                        newPositions.add(pos1);
                        newPositions.add(pos3);
                        newPositions.add(pos4);
                    } else {
                        int[] pos1 = { x - 1, y };
                        int[] pos2 = { x + 1, y };
                        int[] pos3 = { x, y + 1 };
                        newPositions.add(pos1);
                        newPositions.add(pos2);
                        newPositions.add(pos3);
                    }
                } else if (x > 0) {
                    if (y > 0 && y < R - 1) {
                        int[] pos1 = { x - 1, y };
                        int[] pos3 = { x, y - 1 };
                        int[] pos4 = { x, y + 1 };
                        newPositions.add(pos1);
                        newPositions.add(pos3);
                        newPositions.add(pos4);
                    } else if (y > 0) {
                        int[] pos1 = { x - 1, y };
                        int[] pos3 = { x, y - 1 };
                        newPositions.add(pos1);
                        newPositions.add(pos3);
                    } else {
                        int[] pos1 = { x - 1, y };
                        int[] pos2 = { x + 1, y };
                        int[] pos3 = { x, y + 1 };
                        newPositions.add(pos1);
                        newPositions.add(pos2);
                        newPositions.add(pos3);
                    }
                } else {
                    if (y > 0 && y < R - 1) {
                        int[] pos1 = { x + 1, y };
                        int[] pos3 = { x, y - 1 };
                        int[] pos4 = { x, y + 1 };
                        newPositions.add(pos1);
                        newPositions.add(pos3);
                        newPositions.add(pos4);
                    } else if (y > 0) {
                        int[] pos1 = { x + 1, y };
                        int[] pos3 = { x, y - 1 };
                        newPositions.add(pos1);
                        newPositions.add(pos3);
                    } else {
                        int[] pos1 = { x + 1, y };
                        int[] pos2 = { x - 1, y };
                        int[] pos3 = { x, y + 1 };
                        newPositions.add(pos1);
                        newPositions.add(pos2);
                        newPositions.add(pos3);
                    }
                }
            }
            set.addAll(newPositions);
            day++;
        }
        System.out.println(day);
    }
}

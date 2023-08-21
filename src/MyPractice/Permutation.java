package MyPractice;

import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        boolean[] visited = new boolean[4];
        int[] out = new int[3];

        permutation(arr, 0, 4, 3, visited, out);
    }

    public static void permutation(int[] arr, int depth, int n, int r, boolean[] visited, int[] out) {
        if (depth == r) {
            System.out.println(Arrays.toString(out));
            return;
        }

        for (int i = n; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, depth + 1, n, r, visited, out);
                visited[i] = false;
            }
        }
    }
}

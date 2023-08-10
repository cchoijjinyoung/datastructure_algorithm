package Practice.LinearDS_03.src;// Practice6
// 배열 arr 에서 중복 값을 제거한 새 배열을 만드시오.

// 입출력 예시)
// arr: 1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5
// 결과: 1, 5, 3, 2, 4

import java.util.Arrays;

public class Practice6 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5};
        int[] visited = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int visitCnt = 0;
        int compareVal = 0;
        int idx = 0;

        while (visitCnt < arr.length) {
            if (visited[idx] == 0) {
                System.out.print(arr[idx] + " ");
                visited[idx] = 1;
                visitCnt++;
                compareVal = arr[idx];

                for (int j = idx + 1; j < arr.length; j++) {
                    if (visited[j] == 0 && compareVal == arr[j]) {
                        visited[j] = 1;
                        visitCnt++;
                    }
                }
            } else {
                idx++;
            }
        }
    }
}


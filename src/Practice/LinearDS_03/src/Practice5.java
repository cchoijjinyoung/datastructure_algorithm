package Practice.LinearDS_03.src;// Practice5
// 배열 arr 의 값을 오름차순으로 출력

// 입출력 예시)
// arr: 5, 3, 1, 4, 6, 1
// 결과: 1, 1, 3, 4, 5, 6

import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

// 하나씩 비교 후 교체
        int[] arr = {5, 3, 1, 4, 6, 1, 8, 2, 3, 4, 5, 9, 0, 3, 1, 5, 2, 0, 2, 4, 9, 9, 2, 10, 2, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

// 강사님 반복문을 length만큼 돌려서 그때마다 최솟값을 출력
        /*
        int[] visited = new int[arr.length];
        int visitCnt = 0;
        int minVal = Integer.MAX_VALUE;
        int minIdx = -1;

        while (visitCnt < arr.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < minVal && visited[i] == 0) {
                    minVal = arr[i];
                    minIdx = i;
                }
            }
            if (minIdx != -1) {
                System.out.print(minVal + " ");
                visited[minIdx] = 1;
                visitCnt++;
            }
            minVal = Integer.MAX_VALUE;
            minIdx = -1;
        }
        System.out.println();
         */

        long endTime = System.nanoTime();

        long duration = (endTime - startTime);  // 실행 시간 (나노초 단위)
        System.out.println("Execution time: " + duration + " nanoseconds");
    }
}

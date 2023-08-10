package Practice.LinearDS_03.src;// Practice7
// 2차원 배열 arr 을 시계방향 90도 회전시킨 결과를 출력하세요.

// 입출력 예시:
// arr:
// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 결과:
// 11 6 1
// 12 7 2
// 13 8 3
// 14 9 4
// 15 10 5


import java.util.Arrays;

public class Practice7 {
    public static void main(String[] args) {
        int[][] arr = new int[5][3];
        int[][] result = new int[arr[0].length][arr.length];
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for(int j = 0; j < arr[i].length; j++) {
                arr[j][i] = a++;
                System.out.print(arr[j][i]);
            }
        }
        /*
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = a++;
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println();
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[j][i] + " ");
            }
        }
        /*
         */
        /*
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = arr[2 - j][i];
            }
        }
        for (int[] item : result) {
            System.out.println(Arrays.toString(item));
        }

         */
    }
}

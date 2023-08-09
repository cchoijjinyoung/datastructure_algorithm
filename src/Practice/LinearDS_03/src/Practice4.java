package Practice.LinearDS_03.src;// Practice4
// 배열 arr 에서 peek 값 모두 출력
// peek : 해당 값을 기준으로 좌/우가 자기보다 작을 때.
// - 그래프로 보면 위로 상승하여 '찍고' 내려오기 전 접선의 기울기가 수평인 지점 : 극대점
// - ^ : 이모양의 꼭짓점

// 입출력 예시)
// arr: 3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11
// 결과: 3, 6, 5, 10, 11

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11};
        String tmp = "";

        if (arr[0] > arr[1]) {
            tmp += arr[0] + " ";
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                tmp += arr[i] + " ";
            }
        }

        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            tmp += arr[arr.length - 1] + " ";
        }

        String[] result = (tmp.split(" "));
        System.out.println(Arrays.toString(result));
    }

}

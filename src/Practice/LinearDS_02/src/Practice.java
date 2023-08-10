package Practice.LinearDS_02.src;
// Practice
// 기본 배열 자료형을 이용한 배열의 생성, 삽입, 삭제 기능 구현

import java.util.Arrays;

class MyArray {

    int[] arr;

//  배열의 초기 사이즈 설정
    MyArray(int size) {
        this.arr = new int[size];
    }

//  배열에 데이터 삽입
    public void insertData(int index, int data) {
        // ex) 길이가 3인 배열에 하나 더 추가하고 싶으면 매개변수인 index가 3까지만 가능
        // 현재 arr[2]까지만 있는 배열에 갑자기 arr[4]를 넣으려하면 예외를 던진다.

        // {1, 2, 3, 4, 5} index = 3, data = 10;
        if (index < 0 || index > this.arr.length) {
            System.out.println("Index Error");
            return;
        }

        // 기존 배열을 복사해놓고 기존 배열의 length보다 1개 더 많은 배열을 생성
        // arrDup = {1, 2, 3, 4, 5};
        // this.arr = {0, 0, 0, 0, 0, 0};
        int[] arrDup =  this.arr.clone();
        this.arr = new int[this.arr.length + 1];

        // this.arr = {1, 2, 3, 0, 0, 0};
        for (int i = 0; i < index; i++) {
            this.arr[i] = arrDup[i];
        }

        // this.arr = {1, 2, 3, 0, 4, 5};
        for (int i = index + 1; i < this.arr.length; i++) {
            this.arr[i] = arrDup[i - 1];
        }

        // this.arr = {1, 2, 3, 10, 4, 5};
        this.arr[index] = data;
    }


//  배열에서 특정 데이터 삭제
    public void removeData(int data) {
        // this.arr = {1, 2, 3}, data = 2 -> {1, 3}
        int targetIndex = -1;

        // 2의 인덱스 = 1;
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == data) {
                targetIndex = i;
                break;
            }
        }
        if (targetIndex == -1) {
            System.out.println("해당 데이터가 없습니다.");
        } else {
            int[] arrDup = this.arr.clone(); // {1, 2, 3}
            this.arr = new int[this.arr.length - 1]; // {0, 0}

            for (int i = 0; i < targetIndex; i++) {
                this.arr[i] = arrDup[i];
            }

            for (int i = targetIndex; i < this.arr.length; i++) {
                this.arr[i] = arrDup[i + 1];
            }
        }
    }
}

public class Practice {
    public static void main(String[] args) {

//      Test code
        int size = 5;
        MyArray myArray = new MyArray(size);

        for (int i = 0; i < size; i++) {
            myArray.arr[i] = i + 1;
        }
        // [1, 2, 3, 4, 5]로 시작.

        System.out.println(Arrays.toString(myArray.arr));   // [1, 2, 3, 4, 5]

        myArray.arr[0] = 10;
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 3, 4, 5]

        myArray.insertData(2, 20);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 4, 5]

        myArray.insertData(6, 60);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 4, 5, 60]

        myArray.insertData(-1, 0);  // Index Error

        myArray.removeData(4);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 5, 60]

        myArray.removeData(5);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 60]

        myArray.removeData(99); // 해당 데이터가 없습니다.
    }
}

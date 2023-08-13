package Practice_NoLinear.NonLinearDS_01.src;// Practice1
// 배열을 이용한 이진 트리 구성, 순회

class BinaryTree {
    char[] arr; // 따로 배열을 만들어서 for문으로 A 부터 원하는 크기만큼 넣어줄것임.

    public BinaryTree(char[] data) { // BinaryTree bt = new BinaryTree(arr);
        this.arr = data.clone(); // = data; 를 하면 안되는 이유 : data를 참조하게되면 data가 수정됐을때 영향을 미친다.
    }

    public void preOrder(int idx) {
        System.out.print(this.arr[idx] + " ");
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        if (left < this.arr.length) {
            this.preOrder(left);
        }

        if (right < this.arr.length) {
            this.preOrder(right);
        }
    }

    public void inOrder(int idx) { // 중위 순회
        // 전위 순회와는 다르게 출력부터 하지 않는다.
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        // left 값을 구하고 노드의 갯수보다 적으면 재귀한다.
        if (left < this.arr.length) {
            this.inOrder(left);
        }
        // left 값을 찾으면
        System.out.print(this.arr[idx] + " ");

        if (right < this.arr.length) {
            this.inOrder(right);
        }

    }

    public void postOrder(int idx) {
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        if (left < this.arr.length) {
            this.postOrder(left);
        }

        if (right < this.arr.length) {
            this.postOrder(right);
        }

        System.out.print(this.arr[idx] + " ");
    }

    public void levelOrder(int idx) {
        for (int i = 0; i < this.arr.length; i++) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }
}

public class Practice1 {
    public static void main(String[] args) {
        // Test code
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)('A' + i);
        }

        BinaryTree bt = new BinaryTree(arr);
//
//        System.out.println("== Preorder ==");
//        bt.preOrder(0);
//        System.out.println();
//
        System.out.println("== Inorder ==");
        bt.inOrder(0);
        System.out.println();
//
//        System.out.println("== Postorder ==");
//        bt.postOrder(0);
//        System.out.println();
//
//        System.out.println("== Levelorder ==");
//        bt.levelOrder(0);
//        System.out.println();
    }
}

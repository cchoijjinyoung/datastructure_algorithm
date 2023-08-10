package Practice.LinearDS_04.src;// 선형 자료구조 - 연결 리스트
// 단순 연결 리스트 (simple ver.) 기본 구조 구현

// 노드 - 연결 리스트의 기본 구조로 '값과 포인터(링크를 관리하는 부분)'로 이루어짐
class Node {
    int data;
    Node next;

    Node() {}
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    Node head;

    LinkedList() {}
    LinkedList(Node node) {
        this.head = node;
    }

    //  연결 리스트 비어있는지 확인 - head가 없을 것
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    //  연결 리스트의 맨 뒤(tail)에 데이터 추가
    public void addData(int data) {
        if (this.head == null) { // 아무노드도 존재하지 않으면, 지금 추가하는 노드를 head로 설정
            this.head = new Node(data, null);
        } else {
            Node currentNode = this.head; // 처음 노드를 head로 초기화해주고
            while (currentNode.next != null) { // tail까지 순회
                currentNode = currentNode.next;
            }
            // 순회가 끝나면 currentNode는 기존의 tail노드일 것 -> 이 뒤에 데이터를 추가해야함.
            currentNode.next = new Node(data, null);
        }
    }
    //  연결 리스트의 맨 뒤의 데이터 삭제
    public void removeData() {
        if (this.isEmpty()) {
            System.out.println("리스트가 비어있습니다.");
            return;
        }
        Node currentNode = this.head;
        Node prev = null;
        while (currentNode.next != null) {
            prev = currentNode;
            currentNode = currentNode.next;
        }
        // 만약 노드가 애초에 하나였다면 this.head를 null로 변경.
        if (currentNode == this.head) {
            this.head = null;
        } else { // 아니면 tail의 전노드의 포인터를 null로 변경.
            prev.next = null;
        }
    }

    //  연결 리스트에서 데이터 찾기
    public void findData(int findData) {
        if (this.isEmpty()) {
            System.out.println("리스트가 비어있습니다.");
            return;
        }

        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.data == findData) {
                System.out.println("데이터가 존재합니다.");
                return;
            }
            currentNode = currentNode.next;
        }
        System.out.println("데이터를 찾지 못했습니다.");
    }

    //  연결 리스트의 모든 데이터 출력
    public void showData() {
        if (this.isEmpty()) {
            System.out.println("리스트가 비어있습니다.");
            return;
        }
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}


public class Main {

    public static void main(String[] args) {

//      Test Code
        LinkedList myList = new LinkedList(new Node(1, null));
        myList.showData();      // 1

        myList.addData(2);
        myList.addData(3);
        myList.addData(4);
        myList.addData(5);
        myList.showData();      // 1 2 3 4 5

        myList.findData(3);     // Data exist!
        myList.findData(100);   // Data not found!

        myList.removeData();
        myList.removeData();
        myList.removeData();
        myList.showData();      // 1 2

        myList.removeData();
        myList.removeData();
        myList.removeData();    // List is empty

    }

}

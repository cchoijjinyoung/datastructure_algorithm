import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // 자바에서 집합 사용 - HashSet
        System.out.println("== HashSet ==");
        HashSet set1 = new HashSet<>();
        set1.add(1);
        set1.add(1);
        set1.add(1);

        System.out.println("set1 = " + set1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1);

    }
}

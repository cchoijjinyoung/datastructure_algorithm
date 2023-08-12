package Practice.LinearDS_12.src;// 선형 자료구조 - 해시 테이블

import java.util.Hashtable;
import java.util.Map;

public class Main {
    // 해시 함수


    public static void main(String[] args) {
        // 기본 해시 테이블 사용 방법
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("key1", 10);
        ht.put("key2", 20);
        ht.put("key3", 30);

        for (Map.Entry<String, Integer> item: ht.entrySet())

        // 해시 충돌 케이스 (해시 함수 사용)


    }
}

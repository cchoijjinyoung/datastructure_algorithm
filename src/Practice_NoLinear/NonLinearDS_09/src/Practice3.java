package Practice_NoLinear.NonLinearDS_09.src;

import java.util.*;

class Person3 implements Comparable<Person3> {
    String name;
    int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person3 o) {
        return o.age - this.age;
    }
}

public class Practice3 {
    public static void solution(String[] name, int[] age) {
        List<Person3> list = new ArrayList<>();

        for (int i = 0; i < name.length; i++) {
            Collections.sort(list);
            list.add(new Person3(name[i], age[i]));
        }



        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).age);
        }
    }

    public static void main(String[] args) {
        String[] name = {"A", "B", "C", "D", "E"};
        int[] age = {30, 20, 45, 62, 35};

        solution(name, age);
    }
}

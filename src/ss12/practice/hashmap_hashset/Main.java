package ss12.practice.hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "DN");
        Student student2 = new Student("Minh", 21, "BN");
        Student student3 = new Student("Hoang", 22, "HN");

        System.out.println("HashMap"); //xep theo thu tu tang dan
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(3, student3);
        studentMap.put(2, student2);

//        studentMap.put(4, student4);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println("HashSet"); //xep theo thu tu giam dan
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student1);
        students.add(student3);

        for (Student student : students) {
            System.out.println(student.toString());
        }


    }
}

package encapsulation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> a1 = new ArrayList<>();
        a1.add(new Student(1, "rahul", 18, 98));
        a1.add(new Student(2, "ram", 23, 100));
        a1.add(new Student(3, "shiv", 39, 42));
        System.out.println(a1);

        System.out.println("Sorted by marks:-");
        Collections.sort(a1, Comparator.comparing(Student::getMarks));
        System.out.println(a1);
    }
}

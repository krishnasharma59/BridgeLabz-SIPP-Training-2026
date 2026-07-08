import java.util.*;
public class Main{
    public static void main(String[] args){

        Student s1 = new Student(2, 55,"raj");
        ArrayList<Student> a1 = new ArrayList<>();
        a1.add(new Student(3, 67,"Gopal"));
        a1.add(new Student(4, 67, "pal"));
        a1.add(s1);
        for(Student s: a1){
            System.out.println(s.id + " " + s.marks + " " + s.name);
        }
    }
}

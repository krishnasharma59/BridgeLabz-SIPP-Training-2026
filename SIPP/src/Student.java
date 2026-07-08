public class Student{
    int id;
    double marks;
    String name;
    public Student(int id, double marks, String name){
        this.id = id;
        this.marks = marks;
        this.name = name;
    }
    public void info(){
        System.out.println(id);
        System.out.println(marks);
        System.out.println(name);
    }
}

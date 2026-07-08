package collectionQue.question1;

class student extends person {
    final int studentId;
    double gpa;

    student(String name, int age, int studentId, double gpa) {
        super(name, age);       // Calls Person constructor
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student ID: " + studentId +
                ", GPA: " + gpa;
    }
}

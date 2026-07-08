package collectionQue.question1;


public class Main {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Krishna",
                20,
                101,
                9.2,
                "Artificial Intelligence"
        );

        System.out.println(gs);

        // IS-A relationship
        person p = gs;
        student s = gs;

        System.out.println("\nIS-A Relationship:");
        System.out.println("GradStudent IS-A Student: " + (gs instanceof student));
        System.out.println("GradStudent IS-A Person: " + (gs instanceof person));
        System.out.println("Student reference can hold GradStudent object: " + s);
        System.out.println("Person reference can hold GradStudent object: " + p);
    }
}

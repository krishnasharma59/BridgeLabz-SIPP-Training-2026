import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Box<String> b1 = new Box<>();
        b1.setId("101");
        b1.setName("Rahul");
        b1.setSalary("800000");
        System.out.println("ID: "+ b1.getId());
        System.out.println("Name: "+b1.getId());
        System.out.println("Salary: " + b1.getId());

        Box<Integer> b2 = new Box<>();
        b2.setId(100);
        b2.setName(5041);
        b2.setSalary(3218422);

        // =---------------------------------------------------------------------------------------

        Box3<Integer, String> b3 = new Box3<>();
        b3.setKey(9);
        b3.setValue("Kohli");
        b3.setKey(7);
        b3.setValue("Dhoni");
        System.out.println(b3.getKey()+ " =" + b3.getValue());


        ArrayList<String> list = new ArrayList<>();
        
    }
}

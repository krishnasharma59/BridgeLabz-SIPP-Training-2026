package abstraction;

public class Main {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.run(4);
        c1.start();
        // upcasting(using Parent to call Child)
        Vehicle v1 =  new Car();
        //v1.start();
        v1.run(3);
    }
}

package abstraction;

public class Car extends Vehicle {
    public void start(){
        System.out.println("Start with the push button");

    }

    @Override
    public void run(int wheels) {
        System.out.println("Runs on a "+ wheels);
    }
}

package inheritance;

public class Main {
    public static void main(String[] Args){
        Animal a1 = new Animal();
        a1.walk();
        Dog d1 = new Dog();
        d1.sound();
        Cat c1 = new Cat();
        c1.sound();
        System.out.println("==============================================");
        System.out.println("This is for Lion");
        Lion l1 = new Lion();
        l1.walk();
        l1.sound();
        l1.eat();
        System.out.println("==============================================");
        System.out.println("This is for Cow");
        cow c2 = new cow();
        c2.walk();
        c2.sound();
        c2.eat();



    }
}

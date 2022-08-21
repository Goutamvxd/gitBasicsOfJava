package Aug_thirteen.inheritance.hierarchical;

public class TestAnimalHe {
    public static void main(String[] args) {
        Cat c=new Cat();
        System.out.println("--------Cat---------");
        c.meow();
        c.eat();
        System.out.println("====================");
        Dog d=new Dog();
        System.out.println("--------Dog----------");
        d.bark();
        d.eat();

    }
}

package inheritance;

public class Dog extends Animal {
    void bark(){
        System.out.println("Dog is barking");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

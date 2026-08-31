package polymorphism;
//polymorphism allows the same method name/reference to behave differently depending upon the situation
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        //sound() behaves differently depending on object
        animal1.sound();
        animal2.sound();
    }
}

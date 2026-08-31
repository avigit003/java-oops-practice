package polymorphism.runTime;

public class Main {
    public static void main(String[] args) {
        Vehicle v; //reference type
        v = new Car(); //object type
        v.start();

        v = new Bike();
        v.start();

        //upcasting - parent reference pointing to a child object(assigning a child obj to parent refernce
        //static method can't be overridden, it is based on reference/calss type not object type
    }
}

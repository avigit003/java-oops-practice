package polymorphism.compileTime;
//compile time polymorphism also known as early binding, method overloading, static polymorphism


public class Main {
    public static void main(String[] args) {
        calculator d = new calculator();
        System.out.println(d.add(10,20));
        System.out.println(d.add(20,30,40));
        System.out.println(d.add(30.12,40.32,50.22));
    }
}

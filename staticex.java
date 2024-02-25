import static java.lang.Math.*;

public class staticex {

    static {
        System.out.println("This is a static block.");
    }

    static int staticVariable = 10;

    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    static class StaticInnerClass {
        void display() {
            System.out.println("This is a static inner class.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Value of PI: " + PI);
        System.out.println("Square root of 16: " + sqrt(16));

        System.out.println("Static variable: " + staticVariable);
        staticMethod();

        StaticInnerClass staticInner = new StaticInnerClass();
        staticInner.display();
    }
}

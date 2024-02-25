
final class finalex {

    final int finalVariable = 10;

    final void finalMethod() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        finalex obj = new finalex();
        obj.finalMethod();
        System.out.println("Final variable: " + obj.finalVariable);
    }
}

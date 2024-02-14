class runs extends runnable {
    public void start() {
        System.out.println("this is run method in runnable");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("exception occured ");
        }
    }
}
public class runnable {
    public static void main(String[] args) {
        runs th1 = new runs();
        th1.start();
        runs th2 = new runs();
        th2.start();
    }
}

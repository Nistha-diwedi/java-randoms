class CustomThread extends Thread {
    public void run() {
        System.out.println("Java is hot, aromatic, and invigorating");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            System.out.println("exception occured ");
        }
    }
}
public class multithread {
    public static void main(String[] args) {
        CustomThread th1 = new CustomThread();
        th1.start();
        CustomThread th2 = new CustomThread();
        th2.start();
    }
}


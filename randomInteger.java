import java.util.*;
import java.lang.Thread.*;
class thread1 extends Thread{
    public int number()  {
        Random rand = new Random();
        int x = rand.nextInt(50);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("error occured");;
        }
        return x;
    }
}
class thread2 extends Thread{
    int x;
    thread2(int x){
        this.x = x;
    }
    public int square(){
        return x*x;
    }
}
class thread3 extends Thread{
    int x;
    thread3(int x){
        this.x = x;
    }
    public int cube(){
        return x*x*x;
    }
}
public class randomInteger {
    public static void main(String[] args) {
        thread1 th = new thread1();
        int y = th.number();
        System.out.println("the number is = "+y);
        if(th.number()%2==0){
            thread2 th2 = new thread2(y);
            System.out.println("the square = "+th2.square());
        }else{
            thread3 th3 = new thread3(y);
            System.out.println("the cube = "+th3.cube());
        }
    }
}

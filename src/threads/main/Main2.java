package threads.main;
import threads.two.IncrementInt;
import threads.two.IncrementIntSync;
import threads.two.Counter;
public class Main2 {
    public static void main(String[] s) {
        Counter c=new Counter(0);
        IncrementInt thread1 = new IncrementInt(c);  thread1.start();
        IncrementInt thread2 = new IncrementInt(c);thread2.start();
        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e){

        }
        System.out.println("without sync: "+c.value);
        Counter c2=new Counter(0);
        IncrementIntSync thread3=new IncrementIntSync(c2); thread3.start();
        IncrementIntSync thread4=new IncrementIntSync(c2); thread4.start();
        try {
            thread3.join();
            thread4.join();
        }
        catch (InterruptedException e){

        }
        System.out.println("sync: "+c2.value);
    }
}

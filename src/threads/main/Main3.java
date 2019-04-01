package threads.main;

import threads.three.IncrementIntSyncPrint;
import threads.two.Counter;
import threads.two.IncrementInt;
import threads.three.PrintThread;
import threads.three.PrintThreadSync;

public class Main3 {

    public static void main(String[] args) {
        Counter c = new Counter(0);
        IncrementInt thread1 = new IncrementInt(c);
        thread1.start();
        PrintThread thread2 = new PrintThread(c);
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {

        }
        System.out.println("Sync: ");
        Counter c2=new Counter(0);
        IncrementIntSyncPrint thread3 = new IncrementIntSyncPrint(c2);
        thread3.start();
        PrintThreadSync thread4=new PrintThreadSync(c2);
        thread4.start();
    }
}

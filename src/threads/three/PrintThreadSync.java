package threads.three;

import threads.two.Counter;

public class PrintThreadSync extends Thread {
    public Counter counter;
    public PrintThreadSync(Counter counter){
        this.counter=counter;
    }
    @Override
    public void run(){
        synchronized (counter) {
            try {
                counter.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(counter.value);
        }
    }
}

package threads.three;

import threads.two.Counter;

public class PrintThread extends Thread {
    public Counter counter;
    public PrintThread(Counter counter){
        this.counter=counter;
    }
    @Override
    public void run(){
        System.out.println(counter.value);
    }
}

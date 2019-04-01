package threads.two;

public class IncrementIntSync extends Thread{
    private Counter counter;
    int currentOperationCount;
    public IncrementIntSync(Counter counter){
        this.counter=counter;
        currentOperationCount=0;
    }
    @Override
    public void run() {
        while (currentOperationCount < 1000000) {
            synchronized (counter) {
                {
                    counter.value++;
                    currentOperationCount++;
                }

            }
        }
    }
}

package threads.three;
import threads.two.Counter;
public class IncrementIntSyncPrint extends Thread {
        private Counter counter;
        public IncrementIntSyncPrint(Counter counter){
            this.counter=counter;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (counter) {
                    {
                        for (int i=0; i<1000000; i++) {
                            counter.value++;
                        }
                        counter.notify();
                    }

                }
            }
        }


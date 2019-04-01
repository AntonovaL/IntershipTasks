package threads.two;

public class IncrementInt extends Thread {
        private Counter counter;
        public IncrementInt(Counter counter){
            this.counter=counter;
        }
        @Override
        public void run(){
            for (int i=0; i<1000000; i++){
                counter.value++;
            }
        }
    }


package threads.main;
import threads.one.SendMessageThread;
import threads.one.SendMessageThread2;
public class Main1 {
    public static void main(String[] args){
        SendMessageThread t1=new SendMessageThread("Start 1","message from 1","end 1");
        t1.start();
        SendMessageThread2 t2=new SendMessageThread2("Start 2", "message from 2", "end 2");
        t2.start();
        SendMessageThread t3=new SendMessageThread("Start 3","message from 3", "end 3");
        t3.start();
        SendMessageThread2 t4=new SendMessageThread2("Start 4", "message from 4", "end 4 ");
        t4.start();
    }
}

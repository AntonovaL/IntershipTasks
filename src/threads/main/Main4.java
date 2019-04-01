package threads.main;

import threads.four.SyncMethods;

public class Main4 {
    public  static  void main(String[] args){
        Object lock=new Object();
        SyncMethods t=new SyncMethods(lock);
        t.methodOne();
    }
}

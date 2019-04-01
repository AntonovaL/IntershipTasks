package threads.four;

public class SyncMethods {
    Object lock;
    public SyncMethods(Object lock){
        this.lock=lock;
    }
    public void methodOne(){
        synchronized (lock){
            System.out.println(1);
            methodTwo();
        }
    }
    void methodTwo(){
        synchronized (lock){
            System.out.println(2);
            methodThree();
        }
    }
    void methodThree(){
        synchronized (lock){
            System.out.println(3);
        }
    }

}

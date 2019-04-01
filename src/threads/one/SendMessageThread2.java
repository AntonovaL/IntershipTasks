package threads.one;

public class SendMessageThread2 extends Thread{
    private String message;
    private String shutDownMessage;
    public SendMessageThread2(String startMessage, String message, String shutDownMessage){
        System.out.println(startMessage);
        this.message=message;
        this.shutDownMessage=shutDownMessage;
    }
    @Override
    public void run(){
        System.gc();
        for (int i=0; i<3; i++){
            System.out.println(message);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }
        }
        System.runFinalization();
    }
    @Override
    protected void finalize(){
        System.out.println(shutDownMessage);
    }
}

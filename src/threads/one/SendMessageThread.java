package threads.one;

public class SendMessageThread extends Thread {
    private String message;
    private String shutDownMessage;
    public SendMessageThread(String startMessage, String message, String shutDownMessage){
        System.out.println(startMessage);
        this.message=message;
        this.shutDownMessage=shutDownMessage;
    }
    @Override
    public void run(){
        for (int i=0; i<3; i++){
            System.out.println(message);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }
        }
    }
    @Override
    protected void finalize(){
        System.out.println(shutDownMessage);
    }
}

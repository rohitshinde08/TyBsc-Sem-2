class Message {
    private String msg;
    
    // Constructor
    public Message(String msg){
        this.msg = msg;
    }
    
    // Getter and Setter
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

class Sender implements Runnable {
    private Message msg;
    
    // Constructor
    public Sender(Message msg){
        this.msg = msg;
    }
    
    @Override
    public void run() {
        String[] messages = {"Hello", "How are you?", "Goodbye Corona"};
        
        for(String message : messages){
            synchronized(msg){
                msg.setMsg(message);
                System.out.println("Sender: Sent message - " + message);
                try {
                    Thread.sleep(2000); // Simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Receiver implements Runnable {
    private Message msg;
    
    // Constructor
    public Receiver(Message msg){
        this.msg = msg;
    }
    
    @Override
    public void run() {
        while(true){
            synchronized(msg){
                if(!msg.getMsg().equals("Goodbye Corona")){
                    System.out.println("Receiver: Received message - " + msg.getMsg());
                } else {
                    System.out.println("Receiver: " + msg.getMsg());
                    break;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Message msg = new Message("");
        Sender sender = new Sender(msg);
        Receiver receiver = new Receiver(msg);
        
        Thread senderThread = new Thread(sender);
        Thread receiverThread = new Thread(receiver);
        
        senderThread.start();
        receiverThread.start();
    }
}

package ConcurrencyAndMultithreading;

public class ExtendMyThread extends Thread{

    public void run(){
        System.out.println("thread is running");
    }
}

class ThreadRun {
    public static void main(String[] args) {
        ExtendMyThread thread = new ExtendMyThread();
        thread.start();
    }

}
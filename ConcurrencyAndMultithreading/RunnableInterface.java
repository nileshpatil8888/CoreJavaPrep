package ConcurrencyAndMultithreading;

public class RunnableInterface implements Runnable {

    public void run(){
        System.out.println("Thread is running");
    }
}

class Threads{
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableInterface());
        thread.start();
    }
}

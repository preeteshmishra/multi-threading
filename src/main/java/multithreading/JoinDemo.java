package multithreading;

import java.lang.*;

public class JoinDemo implements Runnable
{
    public void run()
    {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: "
                + t.getName());

        // checks if current thread is alive
        System.out.println("Is Alive? "
                + t.isAlive());
    }

    public static void main(String args[]) throws Exception
    {
        Thread t = new Thread(new JoinDemo());
        t.start();
        t.setName("join thread");

        // Waits for 1000ms this thread to die.
        t.join(1000);

        System.out.println("\nJoining after 1000"+
                " mili seconds: \n");
        System.out.println("Current thread: ++  " +
                Thread.currentThread().getName());


        // Checks if this thread is alive
        System.out.println("Is alive? " + t.isAlive());
        System.out.println("Is alive?  ++  " + Thread.currentThread().isAlive());

    }
}

package multithreading;


class MyThreadT extends Thread
{
    public void run()
    {
        for (int i=0; i<5 ; i++)
            System.out.println(Thread.currentThread().getName()
                    + " in control");
    }
}

public class YieldDemo {



    public static void main(String[]args)
    {

     //   Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        MyThreadT t = new MyThreadT();
        t.start();
        t.setName("yield thread  ");
      //  t.setPriority(Thread.MAX_PRIORITY);


        for (int i=0; i<5; i++)
        {
            // Control passes to child thread
           Thread.yield();

            // After execution of child Thread
            // main thread takes over
            System.out.println(Thread.currentThread().getName()
                    + " in control");
        }
    }
}

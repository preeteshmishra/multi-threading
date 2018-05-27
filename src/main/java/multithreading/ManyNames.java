package multithreading;


class MyThread implements Runnable
    //When it comes to thread , nothing is guaranteed
{
    public void run(){

        for(int i = 0;i<=2;i++){
            System.out.println("Current thread running is " + Thread.currentThread().getName() + " " + Thread.currentThread().getId());
        }

        }
}

public class ManyNames {

    public static void main(String []args){

        MyThread thread = new MyThread();
        Thread t1 = new Thread(thread) ;
        Thread t2 = new Thread(thread);
        Thread t3 = new Thread(thread);

        t1.setName("Pk");
        t2.setName("Gk");
        t3.setName("Rk");

        t1.start();
        System.out.println(t1.getState());
       // t1.setPriority(0);
        t2.start();
       // t2.setPriority(10);
        t3.start();
       // t3.setPriority(5);
        System.out.println(t1.getState());

    }
}

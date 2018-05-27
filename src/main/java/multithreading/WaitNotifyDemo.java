package multithreading;

public class WaitNotifyDemo {

    public static void main(String []args){

        Demo d = new Demo();
        Thread t = new Thread(d);
      //  Thread t2 = new Thread(d);

        t.start();
        t.setName("Gk");
//If a wait() is called on a thread object whose lock is not owned or achieved , it will throw a IllegalMonitorStateException
        //synchronized(t2) --> like this
        synchronized (t){
            System.out.println("Going to wait");
            try{

                t.wait(1000);
                System.out.println("waiting over ++");

            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("Who am i ");

        }
    }
}

class Demo implements Runnable{

    WaitNotifyDemo w;

    int total;

    public void run(){
System.out.println("thtread name" + Thread.currentThread().getName() + "       "+ this.toString());
        synchronized (this){

            for(int i = 0;i<100;i++){
                total+=i;


            }
            System.out.println("Sum of 100 numbers is " + total);

         notify();


            System.out.println("will i ever get on the console");





            }




        }

    public static void whyIAmHere(){

        System.out.println("zzzzzzzzzz");
    }

    }

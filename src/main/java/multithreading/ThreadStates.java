package multithreading;


import java.lang.Thread.State;

class Tango implements Runnable{

    public void run(){

        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("I am "+  Thread.currentThread().getName() /*ThreadStates.thread1.getState()*/ + "   My statess is   "+ ThreadStates.thread1.getState());
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            Thread.sleep(200);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("I am "+ Thread.currentThread().getName() + "   My statess is   "+ ThreadStates.thread1.getState());
        System.out.println("I am "+ Thread.currentThread().getName() + "   My statess is   "+Thread.currentThread().getState() );
    }

}

public class ThreadStates implements Runnable {

    public static Thread thread1 ;
    public static ThreadStates tState;

    public static void main(String args[]){

        tState = new ThreadStates();
        thread1 = new Thread(tState);
        thread1.setName("Thread1");
        System.out.println("I am "+ Thread.currentThread().getName() + "   My state is   "+ thread1.getState());

       thread1.start();

        System.out.println("I am "+ Thread.currentThread().getName() + "   My state is   "+ thread1.getState());





    }



    public void run(){

        Tango t = new Tango();
        Thread thread2 = new Thread(t);
        thread2.setName("Thread2");
System.out.println("I am " + thread1.getName() + thread1.getState());
        System.out.println("I am "+ Thread.currentThread().getName() + "   My states is   "+ thread2.getState());

        thread2.start();
        System.out.println("I am "+ Thread.currentThread().getName() + "   My states is   "+ thread2.getState());

        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
         //  thread2.join();
            System.out.println("I am "+ Thread.currentThread().getName() + "   My state is   "+ thread2.getState());
        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("I am "+ Thread.currentThread().getName() + "   My state is   "+ thread1.getState());




    }




}

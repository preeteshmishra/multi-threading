package multithreading;

public class MainThread {

    public static void main(String []args){


        try{

            System.out.println("Entering the deadlock");

            Thread.currentThread().join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
System.out.println("I am inside deadlock");
    }

}

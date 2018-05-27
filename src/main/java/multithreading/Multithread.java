package multithreading;

 /*class MultithreadDemo implements Runnable{

   public void run(){

       try{

           System.out.println("Thread id "+Thread.currentThread().getId()+ "    " + "Thread name" + Thread.currentThread().getName());

         }catch (Exception e){
           e.printStackTrace();
       }
     }

}*/

class MultithreadDemo extends Thread{

    public void run(){

        try{

            System.out.println("Thread id "+Thread.currentThread().getId()+ "    " + "Thread name         " + Thread.currentThread().getName());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
public class Multithread {


    public static void main(String []args){

        int n = 8;
        for(int i = 0;i<8;i++){

            /*Thread obj = new Thread(new MultithreadDemo());
            obj.start();*/

            MultithreadDemo obj = new MultithreadDemo();
            obj.setName("Preetesh");
            obj.start();
           // System.out.println(Threa);
        }
    }

}

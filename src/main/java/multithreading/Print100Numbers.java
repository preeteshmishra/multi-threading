package multithreading;


class MyRunnable implements Runnable{

    public void run(){

        for(int i = 1 ;i<=100;i++){
            try{
                System.out.println(i);
                Thread.sleep(1000);

                if(i%10 ==0){
                    System.out.println("Next please ..");
                }
            }catch (Exception e){

                e.printStackTrace();
            }

        }
    }
}
public class Print100Numbers {

    public static void main(String []args) {


        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}

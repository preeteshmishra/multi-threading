package multithreading;

 class test implements Runnable {

     public void run() {

     }
 }
public class TestSleepMethod {

    public static void main(String []args){
        printAll(args);
    }

    public static void printAll(String []lines){
        for(int i = 0;i<10;i++){
            System.out.println(i + "..");
            try{

            Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

package multithreading;

class Account {

    private int balance = 50 ;

    public int getBalance(){
        return balance;
    }
    public void withdraw(int amt){
        balance = balance-amt;

    }

}

public class AcctBalanceWithSync implements Runnable{

private Account acct = new Account();

public static void main(String []args) {

    AcctBalanceWithSync acctBalanceWithSync = new AcctBalanceWithSync();

    Thread t1 = new Thread(acctBalanceWithSync);
    Thread t2 = new Thread(acctBalanceWithSync);

    t1.setName("Fred");
    t2.setName("Lucy");

    t1.start();
    t2.start();
}
    public  void run()
    {
        for(int i = 0;i<5;i++) {
            makeWithdraw(10);

            if (acct.getBalance() < 0)
                System.out.println("Account is overdrwan");
        }
    }


    private  void  makeWithdraw(int amt) {

        synchronized (this) {

            if (amt <= acct.getBalance()) {

                System.out.println(Thread.currentThread().getName() + " is going to make the withdraw. " + "Available Balance is " + acct.getBalance());

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                acct.withdraw(10);

                System.out.println(Thread.currentThread().getName() + " completed the  withdraw. " + "Available Balance is " + acct.getBalance());


            } else {

                System.out.println("Not enough in account for " + Thread.currentThread().getName() + "  to withdraw . Available balance is " + acct.getBalance());
            }
        }
    }
}





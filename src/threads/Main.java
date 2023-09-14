package threads;

class Resource{
     void print(int n) {
         while (true){
             System.out.println(Thread.currentThread().getName());
             System.out.println(++n);
         }

    }
}
class Thread1 extends Thread{

    Resource resource1 = new Resource();

    @Override
    synchronized public void run() {

            resource1.print(1);

    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Resource r1 = new Resource();
     //   r1.print(10);
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        //Thread.currentThread().setPriority(1);

        t1.start();


        t2.start();
        t1.join();



       // Thread.sleep(2000);
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());


    }
}

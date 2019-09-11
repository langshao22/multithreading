package threadDemo;

/**
 * Created by Administrator on 2019/9/11.
 *
 * stop thread by exception
 */


public class ThreadStopByException {

    static class MyThread extends Thread {

        @Override
        public void run() {

            try {
                for (int i = 0; i <= 50000; i++) {
                    System.out.println(i);
                    if(this.interrupted()){
                        throw new InterruptedException();
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("线程马上退出");
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        try {
            Thread myThread = new MyThread();
            myThread.start();
            Thread.sleep(200);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

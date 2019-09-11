package threadDemo;

/**
 * Created by Administrator on 2019/9/11.
 * stop thread by return
 */


public class ThreadStopByReturn {

    static class MyThread extends Thread {

        @Override
        public void run() {

                for (int i = 0; i <= 50000; i++) {
                    System.out.println(i);
                    if(this.interrupted()){
                        System.out.println("线程马上退出");
                        return;
                    }
                }

        }
    }


    public static void main(String[] args) {
        try {
            Thread myThread = new MyThread();
            myThread.start();
            Thread.sleep(100);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

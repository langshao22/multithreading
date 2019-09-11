package threadDemo;

/**
 * Created by Administrator on 2019/9/11.
 * 线程通过 interrupt 仅仅是在当前线程中打了一个停止的标记，并不是真正的停止线程
 */



public class ThreadCantStopDemo {

    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i <= 50000; i++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Thread mythread = new MyThread();
        mythread.start();
        mythread.interrupt();
    }
}

package Demo;

public class M1 {
    public static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("MyThread1");
        }
    }

    public static void main(String[] args) {
        Thread myThread =new MyThread();
        myThread.start();
        /**
         * 在调用了start（）方法后，虚拟机会先为我们创建
         * 一个线程，然后等到这个线程第一次得到时间片时再调用
         * run()方法。
         * 不可多次调用start（）方法，第一次调用后再次调用
         * start会抛出异常
         */

    }
}

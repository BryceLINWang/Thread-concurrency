package Demo;

public class M2 {
    //Runnable是一个函数式接口
    //可用函数式编程简化代码
    public static class MyThread implements Runnable{
        @Override
        public void run() {
            System.out.println("MyThread2.");
        }
    }

    public static void main(String[] args) {
        new M1.MyThread().start();

        new Thread(()->{
            System.out.println("java8匿名内部类");
        }).start();
    }
}

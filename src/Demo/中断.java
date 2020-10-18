package Demo;

public class 中断 {
    static class MyThread extends Thread{
        volatile boolean stop=false;
        public void run(){
            while (!stop){
                System.out.println(getName()+"is running");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("week up from block..");
                    stop=true;//在异常处理代码中修改共享变量的状态
                }
            }
            System.out.println(getName()+" is exiting..");
        }
    }

    public static void main(String[] args)throws InterruptedException {
        MyThread m1=new MyThread();
        System.out.println("Link Start!");
        m1.start();
        Thread.sleep(3000);
        System.out.println("Interrupt thread..."+m1.getName());
        m1.stop=true;//设置共享变量为true
        m1.interrupt();//阻塞时退出阻塞状态
        Thread.sleep(3000);//主线程休眠3s以便观察线程m1的中断状况
        System.out.println("stopping application...");
    }
}

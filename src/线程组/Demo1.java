package 线程组;

public class Demo1 {
    public static void main(String[] args) {
        Thread thread=new Thread();
        //常用方法
        //获取线程组名
       String groupname= thread.getThreadGroup().getName();
        System.out.println(groupname);
        //复制线程组
        //Thread[]threads=new Thread[threadGroup().activeCount()];
        //ThreadGroup threadGroup=new ThreadGroup();
        //threadGroup.enumerate(threads);
    }
}

package Demo;

public class M3 {
    public static void main(String[] args) {
        //ThreadGroup管理着它下⾯的Thread，
        // ThreadGroup是⼀个标准的向下引⽤的树状 结构，
        // 这样设计的原因是防⽌"上级"线程被"下级"线程引⽤
        // ⽽⽆法有效地被GC回 收。
        //main线程组的父线程组是JVM创建的System线程组
        Thread test=new Thread(()->{
            System.out.println("test当前线程组名："+
                    Thread.currentThread().getThreadGroup().getName());
            System.out.println("test线程名："+
                    Thread.currentThread().getName());
        });
        test.start();
        System.out.println("执行main方法线程名"+Thread.currentThread().getName());
    }
}

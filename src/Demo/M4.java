package Demo;

public class M4 {
    /**
     * 优先级
     * Java程序中对线程所设置的优先级只是给
     * 操作系统⼀个建议，操作系统不⼀定会采纳。⽽真正的调⽤顺序，
     * 是由操作系统的 线程调度算法决定的。
     * @param args
     */
    public static void main(String[] args) {
        Thread a=new Thread();
        System.out.println("我是默认线程优先级："+a.getPriority());
        Thread b=new Thread();
        b.setPriority(10);
        System.out.println("我是设置过的优先级："+b.getPriority());
        ////通常情况下//，⾼优先级的线程将会⽐低优先级的线程有//更⾼的⼏率//得到执⾏。
    }
}

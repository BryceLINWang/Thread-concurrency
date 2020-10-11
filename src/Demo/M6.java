package Demo;

public class M6 {
    //如果一个线程组存在比线程组最大优先级大的线程
    //，那么该线程优先级将会失效，取而代之的将是线程组的最大优先级
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("t1");
        threadGroup.setMaxPriority(6);
        Thread thread = new Thread(threadGroup,"thread");
        thread.setPriority(9);
        System.out.println("我是线程组的优先级"+threadGroup.getMaxPriority());
        System.out.println("我是线程的优先级"+thread.getPriority());
    }
}

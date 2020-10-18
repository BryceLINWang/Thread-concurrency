package 线程状态;

public class M1 {
    //处于NEW状态的线程此时尚未启动。这⾥的尚未启动指的是还没调⽤Thread实例 的start()⽅法。
    public static void main(String[] args) {
        Thread t1=new Thread(()->{});
       // System.out.println(t1.getState());
        t1.start();
        //第一次调用后会修改threadStatus!=0
        t1.start();
    }
}

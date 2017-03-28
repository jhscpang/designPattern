package tech.pangchao.observer;

/**
 * Created by pangchao on 2017/3/28.
 */
public class Main {

    public static void main(String[] args) {
        Observer o1 = new ObserverImpl();
        Observer o2 = new ObserverImpl();
        Subject s1 = new SubjectImpl();

        //注册观察者
        s1.attach(o1);
        s1.attach(o2);

        //通知观察者
        s1.notice();

        //注销观察者
        s1.detach(o1);
    }
}

package tech.pangchao.observer;

/**
 * Created by pangchao on 2017/3/28.
 */
public interface Subject {

    //注册方法
    public void attach(Observer observer);

    //注销方法
    public void detach(Observer observer);

    //通知方法
    public void notice();
}

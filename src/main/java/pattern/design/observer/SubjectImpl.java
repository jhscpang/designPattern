package pattern.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pangchao on 2017/3/28.
 */
public class SubjectImpl implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    //注册方法
    public void attach(Observer observer) {
        System.out.println("attach a observer...");
        observers.add(observer);
    }

    //注销方法
    public void detach(Observer observer) {
        System.out.println("detach a observer...");
        observers.remove(observer);
    }

    //通知方法
    public void notice() {
        System.out.println("notice observers...");
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

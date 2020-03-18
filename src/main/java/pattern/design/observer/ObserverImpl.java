package pattern.design.observer;

/**
 * Created by pangchao on 2017/3/28.
 */
public class ObserverImpl implements Observer {

    //响应方法
    public void update() {
        System.out.println("observer update...");
    }
}

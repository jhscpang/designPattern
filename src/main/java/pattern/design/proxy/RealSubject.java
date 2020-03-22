package pattern.design.proxy;

/**
 * 被代理的类
 * <p>
 * Created by pangchao on 2020/3/22.
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("real request");
    }
}

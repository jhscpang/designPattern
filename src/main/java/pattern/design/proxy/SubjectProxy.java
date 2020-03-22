package pattern.design.proxy;

/**
 * Created by pangchao on 2020/3/22.
 */
public class SubjectProxy implements Subject {

    private Subject realSubject = new RealSubject(); // 持有被代理类的引用

    @Override
    public void request() {
        beforeRequest();
        realSubject.request();
        afterRequest();
    }

    private void beforeRequest() {
        System.out.println("before request");
    }

    private void afterRequest() {
        System.out.println("After request");
    }
}

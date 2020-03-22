package pattern.design.proxy;

/**
 * Created by pangchao on 2020/3/22.
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new SubjectProxy();
        subject.request();
    }
}

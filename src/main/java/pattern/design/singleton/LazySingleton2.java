package pattern.design.singleton;

/**
 * Holder方式
 * Created by pangchao on 2020/3/18.
 */
public class LazySingleton2 {

    private LazySingleton2() {
    }

    public static LazySingleton2 getInstance() {
        return Holder.instance;
    }

    private static class Holder {
        private final static LazySingleton2 instance = new LazySingleton2();
    }
}


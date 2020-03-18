package pattern.design.factory.factoryMethod;

/**
 * 数据库日志记录器
 * <p>
 * Created by pangchao on 2020/3/18.
 */
class DatabaseLogger implements Logger {
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}

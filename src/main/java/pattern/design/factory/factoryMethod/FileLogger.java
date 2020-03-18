package pattern.design.factory.factoryMethod;

/**
 * 文件日志记录器
 * <p>
 * Created by pangchao on 2020/3/18.
 */
class FileLogger implements Logger {
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}

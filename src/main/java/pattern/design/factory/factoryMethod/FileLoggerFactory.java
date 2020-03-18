package pattern.design.factory.factoryMethod;

/**
 * 文件日志记录器工厂类
 * Created by pangchao on 2020/3/18.
 */
class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        // 创建文件日志记录器对象
        Logger logger = new FileLogger();
        // 创建文件，代码省略
        return logger;
    }
}

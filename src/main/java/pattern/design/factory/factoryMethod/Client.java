package pattern.design.factory.factoryMethod;

/**
 * Created by pangchao on 2020/3/18.
 */
public class Client {
    public static void main(String args[]) {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory(); // 可引入配置文件实现
        logger = factory.createLogger();
        logger.writeLog();
    }
}

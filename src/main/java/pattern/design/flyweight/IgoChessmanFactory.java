package pattern.design.flyweight;

import java.util.HashMap;

/**
 * Created by pangchao on 2020/3/22.
 */
public class IgoChessmanFactory {

    // 定义一个HashMap用于存储享元对象，实现享元池
    private static HashMap cache = new HashMap();

    private static IgoChessmanFactory instance = new IgoChessmanFactory();

    private IgoChessmanFactory() {
        IgoChessman black, white;
        black = new BlackIgoChessman();
        cache.put("b", black);
        white = new WhiteIgoChessman();
        cache.put("w", white);
    }

    //返回享元工厂类的唯一实例
    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    //通过key来获取存储在Hashtable中的享元对象
    public static IgoChessman getIgoChessman(String color) {
        return (IgoChessman) cache.get(color);
    }

}

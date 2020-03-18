package pattern.design.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器
 * <p>
 * Created by pangchao on 2020/3/18.
 */
public class PrototypeManager {

    // 定义一个Map，用于存储原型对象
    private Map map = new HashMap<String, OfficialDocument>();
    private static PrototypeManager pm = new PrototypeManager();

    // 为Map增加公文对象
    private PrototypeManager() {
        map.put("far", new FAR());
        map.put("srs", new SRS());
    }

    // 增加新的公文对象
    public void addOfficialDocument(String key, OfficialDocument doc) {
        map.put(key, doc);
    }

    //通 过浅克隆获取新的公文对象
    public OfficialDocument getOfficialDocument(String key) {
        return ((OfficialDocument) map.get(key)).clone();
    }

    public static PrototypeManager getPrototypeManager() {
        return pm;
    }
}

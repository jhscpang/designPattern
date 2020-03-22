package pattern.design.composite;

/**
 * 抽象构件
 * <p>
 * Created by pangchao on 2020/3/22.
 */
public abstract class AbstractFile {
    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法!");
    }

    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法!");
    }

    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法!");
        return null;
    }

    public abstract void killVirus();
}
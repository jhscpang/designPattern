package pattern.design.bridge;

/**
 * 抽象图像类:抽象类
 * Created by pangchao on 2020/3/21.
 */
public abstract class Image {

    protected OsImp imp; // 通过持有另一个维度的引用来代替继承，减少耦合

    public void setImageImp(OsImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}

package pattern.design.bridge;

/**
 * 抽象操作系统实现类:实现类接口
 * <p>
 * Created by pangchao on 2020/3/21.
 */
public interface OsImp {
    public void doPaint(Matrix m); // 显示像素矩阵m
}

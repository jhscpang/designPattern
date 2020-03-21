package pattern.design.bridge;

/**
 * Created by pangchao on 2020/3/21.
 */
public class UnixImp implements OsImp {
    public void doPaint(Matrix m) {
        // 调用Unix系统的绘制函数绘制像素矩阵
        System.out.print("在Unix操作系统中显示图像:");
    }
}
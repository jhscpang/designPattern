package pattern.design.bridge;

/**
 * Created by pangchao on 2020/3/21.
 */
public class WindowsImp implements OsImp {
    public void doPaint(Matrix m) {
        // 调用Windows系统的绘制函数绘制像素矩阵
        System.out.print("在Windows操作系统中显示图像:");
    }
}

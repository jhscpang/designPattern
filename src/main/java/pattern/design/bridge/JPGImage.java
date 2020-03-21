package pattern.design.bridge;

/**
 * Created by pangchao on 2020/3/21.
 */
public class JPGImage extends Image {
    public void parseFile(String fileName) { // 模拟解析JPG文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为JPG。");
    }
}

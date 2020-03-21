package pattern.design.bridge;

/**
 * Created by pangchao on 2020/3/21.
 */
public class Client {
    public static void main(String args[]) {
        Image image;
        OsImp imp;
        image = new GIFImage();
        imp = new LinuxImp();
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}

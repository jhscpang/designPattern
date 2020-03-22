package pattern.design.composite;

/**
 * Created by pangchao on 2020/3/22.
 */
public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("-----对图像文件'" + name + "'进行杀毒");
    }
}
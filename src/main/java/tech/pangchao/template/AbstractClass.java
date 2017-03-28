package tech.pangchao.template;

/**
 * Created by pangchao on 2017/3/28.
 */
public abstract class AbstractClass {

    //开冰箱门
    public void openFridge() {
        System.out.println("把冰箱门打开...");
    }

    //把对象放进冰箱
    public abstract void putInElephant();

    //关冰箱门
    public void closeFridge() {
        System.out.println("把冰箱门关上...");
    }

    //钩子方法
    public boolean isHot() {
        return false;
    }

    //模板方法
    public void templateMethod() {
        //制定执行步骤
        openFridge();
        if (isHot()) {
            putInElephant();
        }
        closeFridge();
    }

}

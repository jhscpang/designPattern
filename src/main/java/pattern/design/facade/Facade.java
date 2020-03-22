package pattern.design.facade;

/**
 * 门面类，封装子系统的复杂调用
 * <p>
 * Created by pangchao on 2020/3/22.
 */
public class Facade {

    private SubSystem1 subSystem1;

    private SubSystem2 subSystem2;

    private SubSystem3 subSystem3;

    public Facade() {
        subSystem1 = new SubSystem1();
        subSystem2 = new SubSystem2();
        subSystem3 = new SubSystem3();
    }

    public void facade() {
        subSystem1.subSystem1();
        subSystem2.subSystem2();
        subSystem3.subSystem3();
    }
}

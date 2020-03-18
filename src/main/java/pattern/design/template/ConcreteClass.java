package pattern.design.template;

/**
 * Created by pangchao on 2017/3/28.
 */
public class ConcreteClass extends AbstractClass {

    @Override
    public void putInElephant() {
        System.out.println("把大象横着放进去...");
    }

    @Override
    public boolean isHot() {
        return true;
    }
}

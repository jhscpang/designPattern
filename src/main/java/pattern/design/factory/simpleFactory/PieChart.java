package pattern.design.factory.simpleFactory;

/**
 * Created by pangchao on 2020/3/18.
 */
public class PieChart implements Chart {

    public PieChart() {
        System.out.println("创建饼状图！");
    }

    public void display() {
        System.out.println("显示饼状图！");
    }

}

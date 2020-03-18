package pattern.design.factory.simpleFactory;

/**
 * Created by pangchao on 2020/3/18.
 */
public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("创建柱状图！");
    }

    public void display() {
        System.out.println("显示柱状图！");
    }
}

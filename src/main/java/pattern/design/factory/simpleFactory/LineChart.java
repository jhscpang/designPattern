package pattern.design.factory.simpleFactory;

/**
 * Created by pangchao on 2020/3/18.
 */
public class LineChart implements Chart {

    public LineChart() {
        System.out.println("创建折线图！");
    }

    public void display() {
        System.out.println("显示折线图！");
    }

}

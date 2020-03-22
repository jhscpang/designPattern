package pattern.design.flyweight;

/**
 * 抽象享元类
 * <p>
 * Created by pangchao on 2020/3/22.
 */
public abstract class IgoChessman {

    public abstract String getColor(); // 子类复写

    public void display() {
        System.out.println("棋子颜色:" + this.getColor());
    }

}

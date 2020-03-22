package pattern.design.decorator;

/**
 * Created by pangchao on 2020/3/22.
 */
public class Client {
    public static void main(String args[]) {
        Component component, componentSB, componentBB; //全部使用抽象构件定
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();
    }
}

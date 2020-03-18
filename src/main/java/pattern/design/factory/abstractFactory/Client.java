package pattern.design.factory.abstractFactory;

/**
 * Created by pangchao on 2020/3/18.
 */
public class Client {
    public static void main(String args[]) {
        SkinFactory factory = new SummerSkinFactory();
        Button button = factory.createButton();
        TextField textField = factory.createTextField();
        ComboBox comboBox = factory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();
    }
}

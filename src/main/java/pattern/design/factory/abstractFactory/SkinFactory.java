package pattern.design.factory.abstractFactory;

/**
 * 抽象工厂
 * Created by pangchao on 2020/3/18.
 */
public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}

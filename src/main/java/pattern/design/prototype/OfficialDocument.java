package pattern.design.prototype;

/**
 * Created by pangchao on 2020/3/18.
 */
public interface OfficialDocument extends Cloneable {

    public OfficialDocument clone();

    public void display();

}

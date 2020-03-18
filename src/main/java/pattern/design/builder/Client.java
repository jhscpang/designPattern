package pattern.design.builder;

/**
 * Created by pangchao on 2020/3/18.
 */
public class Client {

    public static void main(String[] args) {
        ActorBuilder builder = new HeroBuilder();
        Actor actor = builder.construct();
        System.out.println(actor.getType()  + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());
    }
}

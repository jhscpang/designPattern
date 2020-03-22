package pattern.design.command;

/**
 * Created by pangchao on 2017/4/3.
 */
public class Client {

    public static void main(String[] args) {

        OpenWindowReceiver openWindowReceiver = new OpenWindowReceiver();
        // 构造器注入
        Command command = new OpenWindowCommand(openWindowReceiver);
        // set方法注入
        Invoker invoker = new Invoker();
        invoker.setCommand(command);

        invoker.call();
    }
}

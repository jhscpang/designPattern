package tech.pangchao.command;

/**
 * Created by pangchao on 2017/4/3.
 */
public class Client {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        //构造器注入
        Command command = new ConcreteCommand(receiver);
        //set方法注入
        Invoke invoke = new Invoke();
        invoke.setCommand(command);

        invoke.call();
    }
}

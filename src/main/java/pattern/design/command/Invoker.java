package pattern.design.command;

/**
 * 命令发出者
 * <p>
 * Created by pangchao on 2017/4/3.
 */
public class Invoker {

    private Command command; // 维护抽象命令的引用

    // 构造器注入
    public Invoker(Command command) {
        this.command = command;
    }

    public Invoker() {
    }

    // 业务方法，用于调用命令类的execute()方法
    public void call() {
        command.execute();
    }

    public Command getCommand() {
        return command;
    }

    // set方法注入
    public void setCommand(Command command) {
        this.command = command;
    }
}

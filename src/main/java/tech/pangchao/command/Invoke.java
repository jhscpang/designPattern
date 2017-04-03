package tech.pangchao.command;

/**
 * Created by pangchao on 2017/4/3.
 */
public class Invoke {

    private Command command;

    //构造器注入
    public Invoke(Command command) {
        this.command = command;
    }

    public Invoke() {
    }

    //业务方法，用于调用命令类的execute()方法
    public void call() {
        command.execute();
    }

    public Command getCommand() {
        return command;
    }

    //set方法注入
    public void setCommand(Command command) {
        this.command = command;
    }
}

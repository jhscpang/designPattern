package pattern.design.command;

/**
 * 打开窗口命令
 * <p>
 * Created by pangchao on 2017/4/3.
 */
public class OpenWindowCommand implements Command {

    private OpenWindowReceiver openWindowReceiver; // 维护具体接收者引用

    public OpenWindowCommand(OpenWindowReceiver openWindowReceiver) {
        this.openWindowReceiver = openWindowReceiver;
    }

    public void execute() {
        openWindowReceiver.action();
    }
}

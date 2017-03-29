package tech.pangchao.chain;

/**
 * Created by pangchao on 2017/3/29.
 */
public abstract class Handler {

    protected Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    //抽象处理请求方法
    public abstract void handleNote(Note note);
}

package pattern.design.chain;

/**
 * Created by pangchao on 2017/3/29.
 */
public class Dean extends Handler {

    public Dean(Handler next) {
        super(next);
    }

    @Override
    public void handleNote(Note note) {
        //请假天数大于一天并且小于7天才有权限处理，否则交给上级处理
        int day = note.getDay();
        if (day >= 1 && day <= 7) {
            System.out.println("院长批准了" + note.getAuthor() + "请假" + day + "天");
        } else {
            if (next != null) {
                next.handleNote(note);
            }
        }
    }
}

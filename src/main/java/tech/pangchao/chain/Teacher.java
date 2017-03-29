package tech.pangchao.chain;

/**
 * Created by pangchao on 2017/3/29.
 */
public class Teacher extends Handler {

    public Teacher(Handler next) {
        super(next);
    }

    @Override
    public void handleNote(Note note) {
        //请假天数等于一天才有权限处理，否则交给上级处理
        int day = note.getDay();
        if (day == 1) {
            System.out.println("班主任批准了" + note.getAuthor() + "请假" + day + "天");
        } else {
            if (next != null) {
                next.handleNote(note);
            }
        }
    }
}

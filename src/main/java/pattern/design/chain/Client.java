package pattern.design.chain;

/**
 * Created by pangchao on 2017/3/29.
 */
public class Client {

    public static void main(String[] args) {

        //创建假条
        Note note1 = new Note("小明", 1);
        Note note2 = new Note("小黑", 6);

        //创建处理者责任链
        Handler dean = new Dean(null);
        Handler teacher = new Teacher(dean);

        //发起请假请求
        teacher.handleNote(note1); //小明的请求被老师批准
        teacher.handleNote(note2); //小黑的请求被院长批准

    }
}

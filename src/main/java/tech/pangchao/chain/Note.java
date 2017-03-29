package tech.pangchao.chain;

/**
 * Created by pangchao on 2017/3/29.
 */
public class Note {

    //发起人
    private String author;
    //请假天数
    private int day;

    public Note(String author, int day) {
        this.author = author;
        this.day = day;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

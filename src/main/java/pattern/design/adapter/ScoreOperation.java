package pattern.design.adapter;

/**
 * 目标接口
 * Created by pangchao on 2020/3/21.
 */
public interface ScoreOperation {

    public int[] sort(int array[]); // 成绩排序

    public int search(int array[], int key); // 成绩查找
}

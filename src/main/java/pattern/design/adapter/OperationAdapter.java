package pattern.design.adapter;

/**
 * 适配器：通过持有适配者的引用实现适配
 * Created by pangchao on 2020/3/21.
 */
public class OperationAdapter implements ScoreOperation {
    private QuickSort sortObj; // 定义适配者QuickSort对象
    private BinarySearch searchObj; // 定义适配者BinarySearch对象

    public OperationAdapter() {
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int array[]) {
        // 正式环境这里可能需要加一些必要的结构转换
        return sortObj.quickSort(array); // 调用适配者类QuickSort的排序方法
    }

    @Override
    public int search(int array[], int key) {
        // 正式环境这里可能需要加一些必要的结构转换
        return searchObj.binarySearch(array, key); // 调用适配者类BinarySearch的查找方法
    }
}

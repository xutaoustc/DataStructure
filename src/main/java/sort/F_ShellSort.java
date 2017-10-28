package sort;

//一种特殊的插入排序

//先取一个正整数 d1(d1 < n)，把全部记录分成 d1 个组，所有距离为 d1 的倍数的记录看成一组，然后在各组内进行插入排序
//然后取 d2(d2 < d1)
//重复上述分组和排序操作；直到取 di = 1(i >= 1) 位置，即所有记录成为一个组，最后对这个组进行插入排序。
//       一般选 d1 约为 n/2，d2 为 d1 /2， d3 为 d2/2 ，…， di = 1。
public class F_ShellSort {
    public static void sort(int[]array){
        int n = array.length;

        // gap为步长，每次减为原来的一半。
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // 共gap个组，对每一组都执行直接插入排序
            for (int i = 0 ;i < gap; i++) {
                for (int j = i + gap; j < n; j += gap) {
                    // 如果a[j] < a[j-gap]，则寻找a[j]位置，并将后面数据的位置都后移。
                    if (array[j] < array[j - gap]) {

                        int tmp = array[j];
                        int k = j - gap;
                        while (k >= 0 && array[k] > tmp) {
                            array[k + gap] = array[k];
                            k -= gap;
                        }
                        array[k + gap] = tmp;
                    }
                }
            }
        }
    }
}

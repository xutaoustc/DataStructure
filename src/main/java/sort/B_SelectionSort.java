package sort;

//(1)从待排序序列中，找到关键字最小的元素；
//(2)如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换；
//(3)从余下的 N - 1 个元素中，找出关键字最小的元素，重复(1)、(2)步，直到排序结束。

public class B_SelectionSort {
    public static void sort(int[]array){
        for(int i=0;i<array.length;i++){
            int maxValue = Integer.MAX_VALUE;
            int indexValue = -1;

            for(int j=i;j<array.length;j++){
                if(maxValue>array[j]){
                    maxValue = array[j];
                    indexValue = j;
                }
            }

            int swap = array[indexValue];
            array[indexValue]=array[i];
            array[i]=swap;
        }
    }
}

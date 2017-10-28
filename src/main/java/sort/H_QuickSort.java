package sort;


//2、算法思想。通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，
//    然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
public class H_QuickSort {
    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int left, int right){
        int index = partition(array, left, right);
        if(left < index - 1){
            quickSort(array, left, index - 1);
        }
        if(index + 1 < right){
            quickSort(array, index+1, right);
        }
    }

    private static int partition(int[] array, int left, int right){
        int pivot = array[left];

        while (left < right) {
            while (left < right && array[right] >= pivot)
                right--;
            if (left < right)
                array[left++] = array[right];
            while (left < right && array[left] <= pivot)
                left++;
            if (left < right)
                array[right--] = array[left];
        }
        array[left] = pivot;

        return left;
    }
}

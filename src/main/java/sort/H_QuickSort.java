package sort;

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
            quickSort(array, index, right);
        }
    }

    private static int partition(int[] array, int left, int right){
        int pivot = array[(left + right) / 2];
        int temp;

        while(left < right){
            while(array[left] < pivot) left++;
            while(array[right] > pivot) right--;

            if(left < right){
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        return left;
    }
}

package sort;

public class InsertSort {
    public static void sort(int[]array){
        //把一个元素往已经排好序的子数组里不停插入
        for(int i=1;i<array.length;i++){
            int temp = array[i];
            int j = i -1;

            while(j>=0 && temp< array[j]){
                array[j+1]=array[j];
                j--;
            }


            array[j+1]=temp;

        }
    }
}

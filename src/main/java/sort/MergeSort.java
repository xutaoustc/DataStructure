package sort;



public class MergeSort {
    public static void sort(int[] array){
        int[] tempArray = new int[array.length];

        mergeSort(array,0, array.length-1,tempArray);
    }

    private static void mergeSort(int[]array,int low ,int high, int[] tempArray){

        if(low < high){
            int middle = (low + high)/2;
            mergeSort(array, low, middle,tempArray);
            mergeSort(array, middle + 1, high,tempArray);

            merge(array, low, middle, high,tempArray);
        }
    }

    private static void merge(int[]array, int low ,int middle,int high,int[] tempArray){
        int guardleft=low;
        int guardright=middle+1;
        int guardTemp=low;


        //因为这里基于的基础是两边都已经是排过序的了，所以一次遍历就完成了合并后的排序
        while(guardleft<=middle && guardright<=high){
            if(array[guardleft]<=array[guardright]){
                tempArray[guardTemp++]=array[guardleft++];
            }else{
                tempArray[guardTemp++]=array[guardright++];
            }
        }

        while(guardleft<=middle){
            tempArray[guardTemp++]=array[guardleft++];
        }
        while(guardright<=high){
            tempArray[guardTemp++]=array[guardright++];
        }

        //最后复制
        for(int i=low;i<=high;i++){
            array[i] = tempArray[i];
        }
    }
}



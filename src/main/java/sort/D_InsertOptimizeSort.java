package sort;

public class D_InsertOptimizeSort {
    public static void sort(int[]array){
        for(int i=1;i<array.length;i++){
            int index = getInsertIndex(array,i,array[i]);

            if(i != index){
                int j = i;
                int temp = array[i];
                while(j > index){
                    array[j] = array[j - 1];
                    j--;
                }

                array[j] = temp;
            }
        }
    }

    private static int getInsertIndex(int[]array,int length,int value){
        int low = 0;
        int high = length - 1;
        int middle = -1;

        while(low <= high){
            middle = (low + high) / 2;

            if(array[middle] > value){
                high = middle - 1;
            }else if(array[middle] < value){
                low = middle + 1;
            }else{
                return middle;
            }
        }

        if(array[middle] <= value){
            middle++;
        }

        return middle;
    }
}

package sort;

public class BubbleSort {
    public static void sort(int[] array){
        for(int i=0;i<=array.length-1;i++){
            for(int j=1;j<=array.length-1-i;j++){
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j]=array[j-1];
                    array[j-1]= temp;
                }
            }
        }
    }
}

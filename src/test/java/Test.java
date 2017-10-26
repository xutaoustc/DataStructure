import sort.MergeSort;

public class Test {
    public static void main(String[]args){
        int[] number = {1,3,5,7,9,2,4,6,8,10};


        MergeSort.sort(number);


        for(int i =0 ;i<number.length;i++){
            System.out.println(number[i]);
        }
    }
}

import sort.*;

public class Test {
    public static void main(String[]args){
        //初始化原始数据
        int LENGTH= 100000;
        int[] number = new int[LENGTH];
        for(int i =0;i<LENGTH;i++){
            number[i] = (int)(Math.random() * LENGTH);
        }


        long begintime,endtime=0;
        int[] backup = null;
        backup = number.clone();


        number = backup.clone();
        begintime = System.currentTimeMillis();
        InsertSort.sort(number);
        endtime=System.currentTimeMillis();
        System.out.println("Insert sort" + (endtime-begintime));

        number = backup.clone();
        begintime = System.currentTimeMillis();
        InsertOptimizeSort.sort(number);
        endtime=System.currentTimeMillis();
        System.out.println("InsertOptimize sort" + (endtime-begintime));

        number = backup.clone();
        begintime = System.currentTimeMillis();
        BubbleSort.sort(number);
        endtime=System.currentTimeMillis();
        System.out.println("Bubble sort" + (endtime-begintime));

        number = backup.clone();
        begintime = System.currentTimeMillis();
        MergeSort.sort(number);
        endtime=System.currentTimeMillis();
        System.out.println("Merge sort" + (endtime-begintime));

        number = backup.clone();
        begintime = System.currentTimeMillis();
        SelectionSort.sort(number);
        endtime=System.currentTimeMillis();
        System.out.println("Selection sort" + (endtime-begintime));

        //int[] number = {1,3,5,7,9,2,4,6,8,10};
//        InsertOptimizeSort.sort(number);
//        for(int i =0 ;i<number.length;i++){
//            System.out.println(number[i]);
//        }
    }
}

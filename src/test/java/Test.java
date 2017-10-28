import sort.*;

public class Test {
    public static void main(String[]args){
        //初始化原始数据
        int LENGTH= 10000000;
        int[] number = new int[LENGTH];
        for(int i =0;i<LENGTH;i++){
            number[i] = (int)(Math.random() * LENGTH);
        }


        long begintime,endtime=0;
        int[] backup = null;
        backup = number.clone();


//        number = backup.clone();
//        begintime = System.currentTimeMillis();
//        A_BubbleSort.sort(number);
//        endtime=System.currentTimeMillis();
//        System.out.println("Bubble sort" + (endtime-begintime));
//
//        number = backup.clone();
//        begintime = System.currentTimeMillis();
//        B_SelectionSort.sort(number);
//        endtime=System.currentTimeMillis();
//        System.out.println("Selection sort" + (endtime-begintime));
//
//
//        number = backup.clone();
//        begintime = System.currentTimeMillis();
//        C_InsertSort.sort(number);
//        endtime=System.currentTimeMillis();
//        System.out.println("Insert sort" + (endtime-begintime));
//
//        number = backup.clone();
//        begintime = System.currentTimeMillis();
//        D_InsertOptimizeSort.sort(number);
//        endtime=System.currentTimeMillis();
//        System.out.println("InsertOptimize sort" + (endtime-begintime));


        number = backup.clone();
        begintime = System.currentTimeMillis();
        E_MergeSort.sort(number);
        endtime=System.currentTimeMillis();
        System.out.println("Merge sort" + (endtime-begintime));

        number = backup.clone();
        begintime = System.currentTimeMillis();
        F_ShellSort.sort(number);
        endtime=System.currentTimeMillis();
        System.out.println("Shell sort" + (endtime-begintime));

        number = backup.clone();
        begintime = System.currentTimeMillis();

        G_HeapSort.sort(number);
        endtime=System.currentTimeMillis();
        System.out.println("Heap sort" + (endtime-begintime));

        number = backup.clone();
        begintime = System.currentTimeMillis();
        H_QuickSort.sort(number);
        endtime=System.currentTimeMillis();
        System.out.println("Quick sort" + (endtime-begintime));


        //int[] number = {1,3,5,7,9,2,4,6,8,10};
//        for(int i =0 ;i<number.length;i++){
//            System.out.println(number[i]);
//        }
    }
}

package sort;

//http://www.cnblogs.com/JVxie/p/4859889.html
//http://blog.csdn.net/never_cxb/article/details/50211631

//n个元素的序列{k1，k2，…,kn}当且仅当满足下列关系之一时，称之为堆。
//情形1：ki <= k2i 且ki <= k2i+1 （最小化堆或小顶堆）
//情形2：ki >= k2i 且ki >= k2i+1 （最大化堆或大顶堆）
//其中i=1,2,…,n/2向下取整;

//若数组下标从0开始
//leftChild = 2*parent+1;
//rightChild = 2*parent +2;
//parent = (child-1)/2;//child 为 leftChild  或 rightChild

//若将和此序列对应的一维数组（即以一维数组作此序列的存储结构）看成是一个完全二叉树，则堆的含义表明，
// 完全二叉树中所有非终端结点的值均不大于（或不小于）其左、右孩子结点的值。

import exception.HeapEmptyException;

public class G_HeapSort {
    private static Heap heap;

    public static void sort(int[]array){
        heap = new Heap(array);

        try{
            while(true){
                heap.remove();
//                System.out.println(heap.remove());
            }
        }catch (HeapEmptyException e){
        }
    }
}


class Heap{
    private int[] heapValues;
    private int heapSize;

    public Heap(int[] values){
        this.heapValues = new int[values.length];

        for(int i=0;i<values.length;i++){
            add(values[i]);
        }
    }

    private void enlargeCheck(){
        if(heapSize==heapValues.length){
            int[] newHeapValues = new int[heapSize * 2];

            for(int i = 0 ;i < heapSize-1; i++){
                newHeapValues[i] = heapValues[i];
            }
            heapValues = newHeapValues;
        }
    }


    /**
     * 增加一个新元素，步骤是
     * 1. 先把元素插入到 array 的末尾
     * 2. 比较末尾元素和它的父元素，若小于，交换两者
     * 3. 重复上述步骤，直到到顶点位置或者子元素大于父元素
     * 4. 不一定要遍历堆所有的元素，达到堆的性质后会提前结束
     */
    public void add(int value){
        enlargeCheck();

        heapValues[heapSize++] = value;

        int child = heapSize - 1;
        int parent = (child - 1) / 2;

        // 判断是否到达顶点
        while (child > 0) {
            // 父元素大于子元素，交换，保持父是小的
            if (heapValues[parent]> value) {
                heapValues[child]=heapValues[parent];
                heapValues[parent]=value;

                child = parent;
                parent = (child - 1) / 2;
            } else {
                // 已经是最小堆了，无需再比较
                break;
            }
        }
    }

    /**
     * 删除顶点处的元素，步骤是：
     * 1. 把末尾的元素复制到顶点处
     * 2. 然后比较此时顶点的值和左右子树，保持最小堆的性质
     * 3. 交换顶点和左右子树较小的值
     * 4. 重复上述步骤，直到已经成了最小堆或者遍历完
     * 5. 注意可能存在左子树存在，右子树不存在情况
     * 6. 不一定要遍历堆所有的元素，达到堆的性质后会提前结束
     */
    public int remove() throws HeapEmptyException {
        if (heapSize==0)
            throw new HeapEmptyException();

        int removed = heapValues[0];
        int lastValue = heapValues[heapSize-1];
        heapSize--;
        heapValues[0]=lastValue;

        int parent = 0;
        int leftChild = parent * 2 + 1;
        int rightChild = parent * 2 + 2;

        //如果左子树存在
        while(leftChild <= heapSize-1){
            int minIndex = leftChild;
            // 右子树存在，判断左右子树哪个小，保存坐标
            // 如果不存在，那么使用左子树的坐标
            // 保存较小元素的坐标，可以省去考虑左右子树都存在，只有左存在的情况
            if (rightChild <= heapSize - 1) {
                if (heapValues[rightChild] < heapValues[leftChild]) {
                    minIndex = rightChild;
                }
            }


            if (heapValues[minIndex] < lastValue) {
                heapValues[parent] = heapValues[minIndex];
                heapValues[minIndex] = lastValue;

                parent = minIndex;
                leftChild = parent * 2 + 1;
                rightChild = parent * 2 + 2;
            } else {
                break; // 已经达到了最小堆的性质
            }
        }

        return removed;
    }
}


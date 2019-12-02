package redBlackTree;

public class RedBlackTree {
    public static void main(String[] args) {
        // 二叉搜索树 -> 平衡二叉搜索树 -> 红黑树,AVL树等

        // 性质：
        // 1. 根节点为黑
        // 2. 红色节点的孩子为黑色
        // 3. 从任何一个节点出发到达叶子节点经过的黑色节点数量一致

        // 策略：
        // 插入红节点
        // fix violation

        // 1. z=root
        // 2. z.uncle = red    ->  recolor parent,uncle, grandparent
        // 3. z.uncle = black(triangle)  -> rotate z.parent
        // 4. z.uncle = black(line)  -> rotate z.grandparent & recolor parent,grandparent

        // 如果用红黑树作为数据库索引
        // 1. 树太高，每次检索需要检索多次磁盘
        // 2. 读取浪费太多
        // 但是在HashMap中使用是没有关系的，因为HashMap中是内存
    }
}

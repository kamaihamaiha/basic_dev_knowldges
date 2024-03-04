package com.kk.demo.part_1;

/**
 * Union-find data type
 * [参考官方实现](https://algs4.cs.princeton.edu/code/edu/princeton/cs/algs4/UF.java.html)
 */
public class UF {
    private int[] id;
    private int count;


    /**
     * 初始化N个触点
     * @param N
     */
    public UF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * 在 p & q 之间添加一条连接
     * @param p
     * @param q
     */
    public void union(int p, int q){

    }

    /**
     * p & q 是否在同一个分量中
     * @param p
     * @param q
     * @return
     */
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

    /**
     * p所在的分量的标识符
     * @param p
     * @return
     */
    public int find(int p){
        return id[p];
    }

    /**
     * 连通分量的数量
     * @return
     */
    public int count(){
        return count;
    }

}

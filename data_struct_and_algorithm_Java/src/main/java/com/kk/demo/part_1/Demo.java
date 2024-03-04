package com.kk.demo.part_1;

/**
 * union-find 算法
 * https://www.bilibili.com/video/BV1Jt411P77c/?p=2&spm_id_from=333.880.my_history.page.click&vd_source=82b7ac2fbd7ece380f983e2c23199d99
 */
public class Demo {

    public static void main(String[] args) {

        /**
         * Read in number of objects N of standard input
         * Repeat:
         * - read in pair of integers from standard input
         * - if they are not yet connected, connect them and print out pair
         *
         */

        /*int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                StdOut.println(p + " " + q);
            }
        }*/

        int[] ids = new int[]{0, 1, 1, 8, 8, 0, 0, 1, 8, 8};
        System.out.println("hello");
    }
}

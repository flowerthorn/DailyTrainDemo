package com.study.algorithm.bit;

/**
 * https://leetcode-cn.com/problems/number-of-1-bits/
 */
public class NumberOfBits {

    // you need to treat n as an unsigned value
    //二进制中1的个数
    //简单法：移位加计数
    //时间O(32)
    public static int hammingWeight1(int n) {
        int count = 0;
        while (n > 0) {
            //&运算符 都为1 才是1
            if ((n & 1) == 1) {
                count++;
            }
            //右移一位 高位补0 低位舍弃
            n = n >> 1;
        }
        return count;
    }

    //快速法
    //https://leetcode-cn.com/problems/number-of-1-bits/solution/wei-1de-ge-shu-by-leetcode-solution-jnwf/
    //n&n-1 可以去除掉末位的1
    //log(n) 对数指数
    //原理是不断清除n的二进制表示中最右边的1，同时累加计数器，直至n为0
    //为什么n &= (n – 1)能清除最右边的1呢？
    // 因为从二进制的角度讲，n相当于在n - 1的最低位加上1。
    // 举个例子，8（1000）= 7（0111）+ 1（0001），所以8 & 7 = （1000）&（0111）= 0（0000），清除了8最右边的1
    // 再比如7（0111）= 6（0110）+ 1（0001），所以7 & 6 = （0111）&（0110）= 6（0110），清除了7的二进制表示中最右边的1（也就是最低位的1）。
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = (n - 1) & n;
            count++;
        }
        return count;
    }

    //jdk实现
    //https://segmentfault.com/a/1190000015763941
    public static int hammingWeight2(int n) {
//        return Integer.bitCount(n);
        n = n - ((n >>> 1) & 0x55555555);
        n = (n & 0x33333333) + ((n >>> 2) & 0x33333333);
        n = (n + (n >>> 4)) & 0x0f0f0f0f;
        n = n + (n >>> 8);
        n = n + (n >>> 16);
        return n & 0x3f;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight2(9));
    }
}

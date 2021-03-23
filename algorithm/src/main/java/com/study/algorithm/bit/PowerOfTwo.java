package com.study.algorithm.bit;

//是否是2的n次幂，如果是 是几次幂
public class PowerOfTwo {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(8));
    }

    static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    //通过递归取余的方式
    static boolean isPowerOfTwo2(int n) {
        if (n == 1) {
            return true;
        }
        if (n >= 2 && n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        }
        return false;
    }

    static int getPowerOfTwo(int n) {
        if ((n & (n - 1)) == 0) {
            int num = 0;
            while (n != 0) {
                num++;
                n = n >> 1;
            }
            return num;
        } else {
            return -1;
        }
    }
}

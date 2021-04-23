package com.study.algorithm.bit;

public class BitNormalTest {

    public static void main(String[] args) {
        int num = 10;
        printBitInfo(num);
        int left = num << 2;
        printBitInfo(left);
        int right = num >> 2;
        printBitInfo(right);
        swap(10,12);
    }

    private static void printBitInfo(int num) {
        System.out.println(Integer.toBinaryString(num));
    }

    private static void swap(int a,int b){
        System.out.println("a="+a+"b="+b);
        a^=b;
        b^=a;
        a^=b;
        System.out.println("a="+a+"b="+b);
    }
}

package com.study.algorithm.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//数组中出现次数超过一半的数字
//https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
public class FindNumInArrayBeyondHalf {

    /**
     * 摩尔投票法 两两消除 时间n 空间1
     */
    public static int majorityElement1(int[] arr) {
        int result = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (count == 0) {
                //前面的被消耗没了 重新赋值
                count++;
                result = arr[i];
            } else if (result == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        return result;
    }

    /**
     * 排序取中位数
     */
    public static int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * 哈希表统计法 时间 空间  O[n]
     */
    public static int majorityElement3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0) + 1;
            if (count > nums.length / 2) {
                return nums[i];
            }
            map.put(nums[i], count);

        }
        return -1;
    }

    /**
     * 位运算 32位 每一位1的个数
     */
    public static int majorityElement4(int[] nums) {
        int major = 0;
        int length = nums.length;
        //在java中int类型是32位，我们遍历每一位
        for (int i = 0, mask = 1; i < 32; i++, mask <<= 1) {
            //bitCounts表示所有数字在当前位置1的个数。比如当i=0
            //的时候，我们可以认为他表示的是所有数字在二进制位
            //中最右边1的总数。
            int bitCounts = 0;
            for (int j = 0; j < length; j++) {
                //判断数字nums[j]的第i（i从0开始）个位置是否为1，
                //如果是1，bitCounts就加1
                if ((nums[j] & mask) != 0) {
                    bitCounts++;
                }
                //如果bitCounts大于数组的一半，那么这个众数在
                //这个位置肯定是1，然后通过 major |= mask运算
                //把这个位置变为1，后面不需要再判断了，直接终止
                //内层循环
                if (bitCounts > length / 2) {
                    major |= mask;
                    return nums[j];
                }
            }
        }
        return major;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 5, 5, 5, 2, 5, 4, 2};
        System.out.println(majorityElement1(arr));
    }
}

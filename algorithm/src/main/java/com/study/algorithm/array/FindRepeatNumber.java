package com.study.algorithm.array;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindRepeatNumber {

    /**
     * 时间O(n) 空间O(n)
     */
    public static int findRepeatNumber1(int[] nums) {
        Objects.requireNonNull(nums);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }
        return -1;
    }

    /**
     * 注意关键点：数组长度为n，范围为 n-1 排序： 原地置换 空间为0(1) 时间O(n)
     */
    public static int findRepeatNumber(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                temp = nums[i];
                nums[i]=nums[nums[i]];
                nums[temp]=temp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    }
}

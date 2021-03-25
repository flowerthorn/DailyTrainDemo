package com.study.algorithm.stackqueue;

import java.util.List;
import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/flatten-nested-list-iterator/
 */
//把递归方法 转 迭代方法，我们需要用到「栈」。
public class NestedIterator2 {

    private Stack<NestedInteger> mStack;

    public NestedIterator2(List<NestedInteger> nestedList) {
        mStack = new Stack<>();
        //先进后出特性
        for (int i = nestedList.size() - 1; i >= 0; i--) {
            mStack.push(nestedList.get(i));
        }
    }

    public boolean hasNext() {
        while (!mStack.isEmpty()){
            final NestedInteger peek = mStack.peek();
            if (peek.isInteger()){
                return true;
            }
            mStack.pop();
            List<NestedInteger> list=peek.getList();
            for (int i = list.size() - 1; i >= 0; i--) {
                mStack.push(list.get(i));
            }
        }
        return false;
    }

    public Integer next() {
        return mStack.pop().getInteger();
    }
}

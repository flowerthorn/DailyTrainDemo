package com.study.algorithm.stackqueue;

import java.util.ArrayDeque;

public class StackByTwoQueue {

    private ArrayDeque<Integer> mQueue1;

    private ArrayDeque<Integer> mQueue2;

    public StackByTwoQueue() {
        mQueue1 = new ArrayDeque<>();
        mQueue2 = new ArrayDeque<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        mQueue1.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        if (!mQueue1.isEmpty()) {
            while (mQueue1.size() > 1) {
                mQueue2.add(mQueue1.poll());
            }
            return mQueue1.remove();
        }
        if (!mQueue2.isEmpty()) {
            while (mQueue2.size() > 1) {
                mQueue1.add(mQueue2.poll());
            }
            return mQueue2.remove();
        }
        throw new IllegalArgumentException("pop exception");
    }

    /**
     * Get the top element.
     */
    public int top() {
        if (!mQueue1.isEmpty()) {
            while (mQueue1.size() > 1) {
                mQueue2.add(mQueue1.remove());
            }
            int value = mQueue1.peek();
            mQueue2.add(mQueue1.poll());
            return value;
        }
        if (!mQueue2.isEmpty()) {
            while (mQueue2.size() > 1) {
                mQueue1.add(mQueue2.remove());
            }
            int result = mQueue2.peek();
            mQueue1.add(mQueue2.poll());
            return result;
        }
        throw new IllegalArgumentException("top illegal");
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return mQueue1.isEmpty() && mQueue2.isEmpty();
    }
}

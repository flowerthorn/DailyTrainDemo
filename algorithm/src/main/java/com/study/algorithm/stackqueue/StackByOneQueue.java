package com.study.algorithm.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackByOneQueue {

    private Deque<Integer> mDeque;

    public StackByOneQueue() {
        mDeque = new ArrayDeque();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        mDeque.add(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        int size = mDeque.size();
        for (int i = 0; i < size - 1; i++) {
            mDeque.add(mDeque.remove());
        }
        return mDeque.poll();

    }

    /**
     * Get the front element.
     */
    public int top() {
        int size = mDeque.size();
        for (int i = 0; i < size - 1; i++) {
            mDeque.add(mDeque.remove());
        }
        int result = mDeque.peek();
        mDeque.add(mDeque.remove());
        return result;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return mDeque.isEmpty();
    }
}

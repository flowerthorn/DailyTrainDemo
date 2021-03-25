package com.study.algorithm.stackqueue;

import java.util.Stack;

/**
 * 用两个栈实现一个队列 void push(int x) 将元素 x 推到队列的末尾 int pop() 从队列的开头移除并返回元素 int peek() 返回队列开头的元素 boolean
 * empty() 如果队列为空，返回 true ；否则，返回 false
 *
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/implement-queue-using-stacks
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class QueueByStack {

    private Stack<Integer> mInputStack;//用来管理输入

    private Stack<Integer> mOutputStack;//用来管理输出

    public QueueByStack() {
        mInputStack = new Stack<>();
        mOutputStack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        mInputStack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        copyElementsIfNeed();
        if (!mOutputStack.isEmpty()) {
            return mOutputStack.pop();
        }
        throw new IllegalArgumentException("pop illegal");
    }

    /**
     * Get the front element.
     */
    public int peek() {
        copyElementsIfNeed();
        return mOutputStack.peek();
    }

    private void copyElementsIfNeed() {
        if (mOutputStack.isEmpty()) {
            while (!mInputStack.isEmpty()) {
                mOutputStack.push(mInputStack.pop());
            }
        }
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return mInputStack.isEmpty() && mOutputStack.isEmpty();
    }

    public static void main(String[] args) {
        QueueByStack myQueue = new QueueByStack();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek()); // return 1
        System.out.println(myQueue.pop()) ; // return 1, queue is [2]
        System.out.println(myQueue.empty()); // return false
    }
}

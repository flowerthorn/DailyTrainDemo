package com.study.algorithm.stackqueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/flatten-nested-list-iterator/
 */
public class NestedIterator implements Iterator<Integer> {

    private List<Integer> mIntegerList;

    private Iterator<Integer> mIterator;

    public NestedIterator(List<NestedInteger> nestedList) {
        mIntegerList = new LinkedList<>();
        fillList(nestedList);
        mIterator = mIntegerList.iterator();
    }

    private void fillList(List<NestedInteger> nestedList) {
        if (nestedList == null || nestedList.size() == 0) {
            return;
        }
        for (int i = 0; i < nestedList.size(); i++) {
            NestedInteger nestedInteger = nestedList.get(i);
            if (nestedInteger.isInteger()) {
                mIntegerList.add(nestedInteger.getInteger());
            } else {
                fillList(nestedInteger.getList());
            }
        }
    }

    @Override
    public boolean hasNext() {
        return mIterator.hasNext();
    }

    @Override
    public Integer next() {
        return mIterator.next();
    }
}

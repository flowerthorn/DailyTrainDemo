package com.study.java.generic;

public class IntegerType extends GenericType<Integer> {

    private Integer mData;

    @Override
    public Integer getData() {
        return 100;
    }

    @Override
    public void setData(Integer data) {
        mData = data;
    }
}

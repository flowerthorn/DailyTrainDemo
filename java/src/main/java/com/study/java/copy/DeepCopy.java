package com.study.java.copy;

/**
 * 深拷贝实现
 */
public class DeepCopy extends SourceObject implements Cloneable {

    public DeepCopy(String stringField, int intField, StubObject refFiled) {
        super(stringField, intField, refFiled);
    }

    @Override
    protected Object clone() {
        DeepCopy deepCopy = new DeepCopy(mStringField, mIntField,
                new StubObject(mRefFiled.getStubIntFiled()));
        return deepCopy;
    }
}

package com.study.java.copy;

/**
 * 浅拷贝实现
 */
public class ShallowCopy extends SourceObject implements Cloneable {

    public ShallowCopy(String stringField, int intField, StubObject refFiled) {
        super(stringField, intField, refFiled);
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

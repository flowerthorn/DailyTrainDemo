package com.study.java.copy;

public class SourceObject {

    protected String mStringField;

    protected int mIntField;

    protected StubObject mRefFiled;

    public SourceObject(String stringField, int intField, StubObject refFiled) {
        mStringField = stringField;
        mIntField = intField;
        mRefFiled = refFiled;
    }

    public String getStringField() {
        return mStringField;
    }

    public void setStringField(String stringField) {
        mStringField = stringField;
    }

    public int getIntField() {
        return mIntField;
    }

    public void setIntField(int intField) {
        mIntField = intField;
    }

    public StubObject getRefFiled() {
        return mRefFiled;
    }

    public void setRefFiled(StubObject refFiled) {
        mRefFiled = refFiled;
    }
}

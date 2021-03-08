package com.study.java.generic;

public class MultiGeneric<K, V> {

    private K mKey;

    private V mValue;

    public void setKeyValue(K key, V value) {
        mKey = key;
        mValue = value;
    }
}

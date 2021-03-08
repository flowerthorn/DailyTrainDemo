package com.study.java.generic.typeLimit;

import java.util.ArrayList;

public class TypeLimitGeneric {


    public <K, V extends ArrayList & Comparable & Iterable> void set(K k, V value) {
    }

    //因为T没有限定能实现compareTo方法，所以会报错
//    public <T> T min(T a, T b) {
//        return a.compareTo(b) > 0 ? a : b;
//    }
    public <T extends Comparable> T min(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}

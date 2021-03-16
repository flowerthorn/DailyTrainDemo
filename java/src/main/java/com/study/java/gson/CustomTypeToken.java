package com.study.java.gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

public class CustomTypeToken<T> {

    private final Type mType;

    public CustomTypeToken() {
        final Type genericSuperclass = getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = null;
        if (genericSuperclass instanceof ParameterizedType) {
            parameterizedType = (ParameterizedType) genericSuperclass;
        } else {
            new IllegalArgumentException("CustomTypeToken exception");
        }
        if (parameterizedType == null) {
            mType = null;
            return;
        }
        Type[] types = Objects.requireNonNull(parameterizedType).getActualTypeArguments();
        mType = types[0];
    }

    public Type getType() {
        return mType;
    }
}

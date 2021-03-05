package com.study.java.proxy.dynamicProxy;

import com.study.java.proxy.normalProxy.IAction;

public class LamerSeller implements IAction {

    @Override
    public void getSomething() {
        System.out.println("LamerSeller 专柜--lamer");
    }
}

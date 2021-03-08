package com.study.java.proxy.dynamicProxy;

import com.study.java.proxy.normalProxy.IAction;

public class LamerSeller implements ILamer {

    @Override
    public void getLamer() {
        System.out.println("LamerSeller 专柜--lamer");
    }
}

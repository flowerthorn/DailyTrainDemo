package com.study.java.proxy.normalProxy;

/**
 * 售卖者
 */
public class Sk2Seller implements IAction {

    @Override
    public void getSomething() {
        System.out.println("Sk2Seller 专柜--sk2");
    }
}

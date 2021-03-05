package com.study.java.proxy.normalProxy;

/**
 * 代理人【不具备提供sk2能力，需要去专柜购买】
 */
public class Sk2Agent implements IAction {

    private Sk2Seller mSeller;

    public void setSeller(Sk2Seller seller) {
        mSeller = seller;
    }

    @Override
    public void getSomething() {
        System.out.println("sk2 do before");
        mSeller.getSomething();
        System.out.println("sk2 do after");
    }
}

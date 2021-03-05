package com.study.java.proxy.normalProxy;

public class LamerAgent implements IAction {

    private LamerSeller mLamerSeller;

    public void setLamerSeller(LamerSeller seller) {
        mLamerSeller = seller;
    }

    @Override
    public void getSomething() {
        System.out.println("lamer do before");
        mLamerSeller.getSomething();
        System.out.println("lamer do after");
    }
}

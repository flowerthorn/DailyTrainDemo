package com.study.java.proxy.normalProxy;

/**
 * 代理模式简要demo 购买者
 */
public class Purchaser {

    public static void main(String[] args) {
        Sk2Agent sk2Agent = new Sk2Agent();
        sk2Agent.setSeller(new Sk2Seller());
        sk2Agent.getSomething();
        LamerAgent lamerAgent = new LamerAgent();
        lamerAgent.setLamerSeller(new LamerSeller());
        lamerAgent.getSomething();
    }
}

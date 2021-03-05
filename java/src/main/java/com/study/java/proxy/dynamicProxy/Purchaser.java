package com.study.java.proxy.dynamicProxy;

public class Purchaser {

    public static void main(String[] args) {
        Sk2Seller sk2Seller=new Sk2Seller();
        AgentStore agentStore=new AgentStore(sk2Seller);
//        IAction
        agentStore.create(IAction.class);
    }
}

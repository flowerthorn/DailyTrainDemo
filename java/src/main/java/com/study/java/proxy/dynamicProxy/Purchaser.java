package com.study.java.proxy.dynamicProxy;

public class Purchaser {

    public static void main(String[] args) {
        Sk2Seller sk2Seller = new Sk2Seller();
        AgentStore agentStore = new AgentStore(sk2Seller);
        ISk2 sk2 = agentStore.create(ISk2.class);
        sk2.getSk2();
        LamerSeller lamerSeller = new LamerSeller();
        AgentStore lamerAgent = new AgentStore(lamerSeller);
        ILamer lamer = lamerAgent.create(ILamer.class);
        lamer.getLamer();
    }
}

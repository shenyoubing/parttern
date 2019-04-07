package com.syb.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        //通过策略模式取不同的贷款类型
        Envirment envirment = new Envirment(new ACPILoan());
        envirment.interest();
    }

}

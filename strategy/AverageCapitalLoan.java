package com.syb.strategy;
//等额本金类
public class AverageCapitalLoan implements Loan {
    @Override
    public Object interest() {
        System.out.println("等额本金计算方法");
        return null;
    }
}

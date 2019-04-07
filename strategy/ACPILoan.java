package com.syb.strategy;
//等额本息
public class ACPILoan implements Loan{
    @Override
    public Object interest() {
        System.out.println("等额本息计算方法");
        return null;
    }
}

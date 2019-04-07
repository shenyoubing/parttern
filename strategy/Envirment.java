package com.syb.strategy;

public class Envirment {

    private Loan loan;

    public Envirment(Loan loan){
        this.loan = loan;
    }

    public Object interest() {
        loan.interest();
        return null;
    }

}

package com.wipro.bank.acc;

public class RDAccount extends Account {

    public RDAccount(int tenure, float principal) {

        this.tenure = tenure;
        this.principal = principal;
    }

    @Override
    public float calculateAmountDeposited() {

        return principal * tenure * 12;
    }

    @Override
    public float calculateInterest() {

        float p = calculateAmountDeposited();

        float r = rateOfInterest / 100;

        float n = 4;

        float t = tenure;

        float interest = (float)(p *
                (Math.pow((1 + (r / n)), (n * t)) - 1));

        return interest;
    }

}
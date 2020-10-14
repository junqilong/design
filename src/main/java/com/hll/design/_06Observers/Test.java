package com.hll.design._06Observers;

/**
 * @author linglong.he
 * @date 2020-08-27 11:14
 **/
public class Test {

    public static void main(String[] args) {
        RmbRate rate  = new RmbRate();
        rate.addObserver(new CompanyIn());
        rate.addObserver(new CompanyOut());
        RmbRateEvent rmbRateEvent = new RmbRateEvent(rate);
        rmbRateEvent.setIsup(true);
        rate.notifyObserver(rmbRateEvent);
    }
}

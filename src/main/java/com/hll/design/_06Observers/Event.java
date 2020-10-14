package com.hll.design._06Observers;

/**
 * Created by linglong.he on 2020/8/27.
 */
public interface Event<T> {

    T getSource();
}

class RmbRateEvent implements Event<RmbRate>{

    private RmbRate rmbRate;

    public Boolean getIsup() {
        return isup;
    }

    public void setIsup(Boolean isup) {
        this.isup = isup;
    }

    private Boolean isup;

    public RmbRateEvent(RmbRate rmbRate){
        this.rmbRate = rmbRate;
    }



    public RmbRate getSource() {
        return rmbRate;
    }
}

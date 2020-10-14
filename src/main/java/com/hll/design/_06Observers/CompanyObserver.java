package com.hll.design._06Observers;

/**
 * Created by linglong.he on 2020/8/27.
 */
public interface CompanyObserver {
    void response(RmbRateEvent event);
}

class CompanyIn implements CompanyObserver{

    public void response(RmbRateEvent event) {
        if(event.getIsup()){
            System.out.println("companyin up");
        }else
            System.out.println("companyin down");
    }
}


class CompanyOut implements CompanyObserver{

    public void response(RmbRateEvent event) {
        if(event.getIsup()){
            System.out.println("companyout up");
        }else
            System.out.println("companyout down");
    }
}

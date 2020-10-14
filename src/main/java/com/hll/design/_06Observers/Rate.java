package com.hll.design._06Observers;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linglong.he
 * @date 2020-08-27 11:04
 **/
public abstract class Rate {

    protected List<CompanyObserver> list = new ArrayList<CompanyObserver>();

    public void addObserver(CompanyObserver companyObserver){
        list.add(companyObserver);
    }

    public void deleteObserver(CompanyObserver companyObserver){
        list.remove(companyObserver);
    }

    public  abstract  void notifyObserver(RmbRateEvent event);


}


class RmbRate extends Rate{

    public void notifyObserver(RmbRateEvent event) {
        List<CompanyObserver> list = super.list;
        for (CompanyObserver companyObserver : list) {
            companyObserver.response(event);
        }
    }
}

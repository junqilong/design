package com.hll.design._07composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linglong.he
 * @date 2020-08-28 10:23
 **/
public abstract class AbstractCompnent {
    String path;
    abstract void opr();
    abstract boolean isLeaf();
    abstract void add(AbstractCompnent compnent);
    abstract void delete(AbstractCompnent abstractCompnent);
}


class CompositeCompnent extends AbstractCompnent{

    private String path;
    private List<AbstractCompnent> list = new ArrayList<AbstractCompnent>();

    public CompositeCompnent(String path){
        this.path = path;
    }

    void opr() {
        System.out.println(path);
    }

    void add(AbstractCompnent compnent){
        list.add(compnent);
    }

    void delete(AbstractCompnent abstractCompnent){
        list.remove(abstractCompnent);
    }

    boolean isLeaf() {
        return false;
    }

    public List<AbstractCompnent> getChild(){
        return list;
    }
}


class LeafCompnent extends AbstractCompnent{

    private String path;

    public LeafCompnent(String path){
        this.path = path;
    }

    void opr() {
        System.out.println(path);
    }

    boolean isLeaf() {
        return true;
    }

    void add(AbstractCompnent compnent) {

    }

    void delete(AbstractCompnent abstractCompnent) {

    }


}

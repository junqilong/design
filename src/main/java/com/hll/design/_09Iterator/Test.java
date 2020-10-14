package com.hll.design._09Iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author linglong.he
 * @date 2020-09-02 10:31
 **/
public class Test {


    public static void main(String[] args) {
        Collection_<String> c = new ArrayList_<String>();
        for(int i=0;i<10;i++){
            c.add(i+"");
        }

        Iterator_<String> iterator = c.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        List<String> strings = new LinkedList<String>();
        strings.add("1");
        strings.add("2");
        Iterator<String> iterator1 = strings.iterator();


    }
}

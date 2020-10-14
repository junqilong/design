package com.hll.design._04ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linglong.he
 * @date 2020-08-26 14:48
 **/
public class Chain {


    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("hello: && world <script> ....");


        FilterChain chain = new FilterChain();
        chain.addFilter(new HtmlFilter()).addFilter(new KeywordFilter());

        FilterChain chain1 = new FilterChain();
        chain1.addFilter(new HelloFilter()).addFilter(new WorldFilter());

        chain.addFilter(chain1);

        chain.doFilter(msg);


        System.out.println(msg);

    }
}

class FilterChain implements DoFilter{
    List<DoFilter> list = new ArrayList<DoFilter>();

    public FilterChain addFilter(DoFilter doFilter){
        list.add(doFilter);
        return this;
    }

    public void doFilter(Msg msg){
        for (DoFilter doFilter : list) {
            doFilter.doFilter(msg);
        }
    }
}


interface DoFilter{
    void doFilter(Msg msg);
}

class HelloFilter implements  DoFilter{

    public void doFilter(Msg msg) {
        String msg1 = msg.getMsg();
        msg1 = msg1.replaceAll("hello","hahaha");
        msg.setMsg(msg1);
    }
}

class WorldFilter implements  DoFilter{

    public void doFilter(Msg msg) {
        String msg1 = msg.getMsg();
        msg1 = msg1.replaceAll("world","wwwww");
        msg.setMsg(msg1);
    }
}

class HtmlFilter implements DoFilter{

    public void doFilter(Msg msg) {
        String msg1 = msg.getMsg();
        msg1 = msg1.replaceAll("<","[");
        msg1 = msg1.replaceAll(">","]");
        msg.setMsg(msg1);

    }
}

class KeywordFilter implements DoFilter{

    public void doFilter(Msg msg) {
        String msg1 = msg.getMsg();
        msg1 = msg1.replaceAll("&&","**");
        msg.setMsg(msg1);
    }
}


class Msg {
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
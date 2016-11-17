package com.mvp.libin.designmodule.adapter_pattern.expound.class_adapter;

/**
 * Created by libin on 16/11/17.
 */

public class Test {
    public static void main(String[] args){
        System.out.println(new Class_adapter().getFiveVole()+"-----------");
        System.out.println(new Volt220().getVolt220()+"-----------");
    }
}

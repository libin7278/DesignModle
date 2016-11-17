package com.mvp.libin.designmodule.adapter_pattern.expound.Target_adapter;



/**
 * Created by libin on 16/11/17.
 */

public class Test {
    public static void main(String[] args){
        Volt220 volt220 = new Volt220();
        System.out.println(new Target_adapter(volt220).getVolt220()+"-----------");
        System.out.println(new Target_adapter(volt220).getFiveVole()+"-----------");
        System.out.println(new Volt220().getVolt220()+"-----------");
    }
}

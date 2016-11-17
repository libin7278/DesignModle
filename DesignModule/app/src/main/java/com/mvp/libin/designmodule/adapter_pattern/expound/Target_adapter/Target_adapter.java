package com.mvp.libin.designmodule.adapter_pattern.expound.Target_adapter;

/**
 * Created by libin on 16/11/17.
 * 对象适配器模式
 * adapter
 */

public class Target_adapter implements FiveVolt{
    Volt220 volt220;

    public Target_adapter(Volt220 mVolt220) {
        volt220 = mVolt220;
    }


    public int getVolt220() {
        return volt220.getVolt220();
    }

    @Override
    public int getFiveVole() {
        return 5;
    }
}

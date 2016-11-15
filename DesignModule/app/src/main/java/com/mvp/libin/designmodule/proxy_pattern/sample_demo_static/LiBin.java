package com.mvp.libin.designmodule.proxy_pattern.sample_demo_static;

/**
 * Created by libin on 16/11/14.
 * 委托类
 */

public class LiBin implements ILawsuit {
    @Override
    public void submit() {
        System.out.println("老板拖欠我工资!特此申请仲裁");
    }

    @Override
    public void burden() {
        System.out.println("这是合同和一年流水");
    }

    @Override
    public void defend() {
        System.out.println("证据确凿不用说什么了");
    }

    @Override
    public void finish() {
        System.out.println("诉讼成功,即日发放工资");
    }
}

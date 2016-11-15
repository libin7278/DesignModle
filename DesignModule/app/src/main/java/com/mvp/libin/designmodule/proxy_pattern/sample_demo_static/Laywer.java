package com.mvp.libin.designmodule.proxy_pattern.sample_demo_static;

/**
 * Created by libin on 16/11/14.
 * 代理律师
 */

public class Laywer implements ILawsuit{
    private ILawsuit mILawsuit;

    public Laywer(ILawsuit mILawsuit) {
        this.mILawsuit = mILawsuit;
    }

    @Override
    public void submit() {
        mILawsuit.submit();
    }

    @Override
    public void burden() {
        mILawsuit.burden();
    }

    @Override
    public void defend() {
        mILawsuit.defend();
    }

    @Override
    public void finish() {
        mILawsuit.finish();
    }
}
